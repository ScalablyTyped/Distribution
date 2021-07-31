package typings.nyaapi.mod.pantsu

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoginData extends StObject {
  
  var password: String
  
  var username: String
}
object LoginData {
  
  @scala.inline
  def apply(password: String, username: String): LoginData = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoginData]
  }
  
  @scala.inline
  implicit class LoginDataMutableBuilder[Self <: LoginData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
