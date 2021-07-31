package typings.nodeTelegramBotApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  var first_name: String
  
  var id: Double
  
  var is_bot: Boolean
  
  var language_code: js.UndefOr[String] = js.undefined
  
  var last_name: js.UndefOr[String] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object User {
  
  @scala.inline
  def apply(first_name: String, id: Double, is_bot: Boolean): User = {
    val __obj = js.Dynamic.literal(first_name = first_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], is_bot = is_bot.asInstanceOf[js.Any])
    __obj.asInstanceOf[User]
  }
  
  @scala.inline
  implicit class UserMutableBuilder[Self <: User] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst_name(value: String): Self = StObject.set(x, "first_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs_bot(value: Boolean): Self = StObject.set(x, "is_bot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_code(value: String): Self = StObject.set(x, "language_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage_codeUndefined: Self = StObject.set(x, "language_code", js.undefined)
    
    @scala.inline
    def setLast_name(value: String): Self = StObject.set(x, "last_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_nameUndefined: Self = StObject.set(x, "last_name", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
