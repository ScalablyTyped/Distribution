package typings.npmProfile.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileCredentials extends StObject {
  
  /**
    * default value for email
    */
  var email: String
  
  /**
    * default value for username
    */
  var username: String
}
object ProfileCredentials {
  
  inline def apply(email: String, username: String): ProfileCredentials = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileCredentials]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProfileCredentials] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
