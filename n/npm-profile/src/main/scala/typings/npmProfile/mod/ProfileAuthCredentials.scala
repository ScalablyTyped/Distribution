package typings.npmProfile.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileAuthCredentials
  extends StObject
     with ProfileCredentials {
  
  /**
    * default value for password
    */
  var password: String
}
object ProfileAuthCredentials {
  
  inline def apply(email: String, password: String, username: String): ProfileAuthCredentials = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileAuthCredentials]
  }
  
  extension [Self <: ProfileAuthCredentials](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
  }
}
