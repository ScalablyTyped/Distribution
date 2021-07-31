package typings.passportNaver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Age extends StObject {
    
    var age: Double
    
    var birthday: js.Any
    
    var email: String
    
    var id: String
    
    var nickname: String
    
    var profile_image: String
  }
  object Age {
    
    @scala.inline
    def apply(age: Double, birthday: js.Any, email: String, id: String, nickname: String, profile_image: String): Age = {
      val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], birthday = birthday.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nickname = nickname.asInstanceOf[js.Any], profile_image = profile_image.asInstanceOf[js.Any])
      __obj.asInstanceOf[Age]
    }
    
    @scala.inline
    implicit class AgeMutableBuilder[Self <: Age] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAge(value: Double): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBirthday(value: js.Any): Self = StObject.set(x, "birthday", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNickname(value: String): Self = StObject.set(x, "nickname", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile_image(value: String): Self = StObject.set(x, "profile_image", value.asInstanceOf[js.Any])
    }
  }
}
