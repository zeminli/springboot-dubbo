package net.gzspark.service.impl;

import net.gzspark.service.HelloService;
import org.apache.dubbo.config.annotation.Service;


@Service(registry = "dubboRegistry", timeout = 3000, version = "1.0", retries = 3, loadbalance = "random", actives = 5)
public class HelloServiceImpl implements HelloService {


    @Override
    public String sayHello() {
        return "欢迎使用 dubbo!";
    }
}
