package typings.npmProfile.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProfileAuthToken extends StObject {
  
  /**
    * String, to be used to authenticate further API calls.
    */
  var token: String
  
  /**
    * String, the username the user authenticated as.
    */
  var username: String
}
object ProfileAuthToken {
  
  inline def apply(token: String, username: String): ProfileAuthToken = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfileAuthToken]
  }
  
  extension [Self <: ProfileAuthToken](x: Self) {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
