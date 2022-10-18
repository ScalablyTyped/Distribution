package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** RequestDefaults.auth options */
trait RequestDefaultOptionsAuth extends StObject {
  
  var password: String
  
  var username: String
}
object RequestDefaultOptionsAuth {
  
  inline def apply(password: String, username: String): RequestDefaultOptionsAuth = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestDefaultOptionsAuth]
  }
  
  extension [Self <: RequestDefaultOptionsAuth](x: Self) {
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
