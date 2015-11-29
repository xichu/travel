package com.firmname.travel.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.firmname.travel.server.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@ResponseBody
	@RequestMapping(value="/{userId}", method = RequestMethod.GET)
	public User getUser(@PathVariable String userId){
		User user = new User();
		user.setId(userId);
		user.setName("Jason");
		return user;
	}

}
