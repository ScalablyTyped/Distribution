package typings.meteor.meteorMod.Meteor

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User_ extends StObject {
  
  var _id: String
  
  var createdAt: js.UndefOr[Date] = js.undefined
  
  var emails: js.UndefOr[js.Array[UserEmail]] = js.undefined
  
  var profile: js.UndefOr[js.Any] = js.undefined
  
  var services: js.UndefOr[js.Any] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object User_ {
  
  @scala.inline
  def apply(_id: String): User_ = {
    val __obj = js.Dynamic.literal(_id = _id.asInstanceOf[js.Any])
    __obj.asInstanceOf[User_]
  }
  
  @scala.inline
  implicit class User_MutableBuilder[Self <: User_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreatedAt(value: Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    @scala.inline
    def setEmails(value: js.Array[UserEmail]): Self = StObject.set(x, "emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailsUndefined: Self = StObject.set(x, "emails", js.undefined)
    
    @scala.inline
    def setEmailsVarargs(value: UserEmail*): Self = StObject.set(x, "emails", js.Array(value :_*))
    
    @scala.inline
    def setProfile(value: js.Any): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    @scala.inline
    def setServices(value: js.Any): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServicesUndefined: Self = StObject.set(x, "services", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
    
    @scala.inline
    def set_id(value: String): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
  }
}
