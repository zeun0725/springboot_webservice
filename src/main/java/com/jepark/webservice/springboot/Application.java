package com.jepark.webservice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//앞으로 만들 프로젝트의 메인 클래스
@SpringBootApplication //스프링부트 자동 설정
public class Application {
    public static void main(String[] args)
    {
        SpringApplication.run(Application.class, args);
    }
}
