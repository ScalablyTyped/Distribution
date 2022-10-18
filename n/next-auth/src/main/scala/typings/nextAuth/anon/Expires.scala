package typings.nextAuth.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Expires extends StObject {
  
  var expires: js.Date
  
  var sessionToken: String
  
  var userId: String
}
object Expires {
  
  inline def apply(expires: js.Date, sessionToken: String, userId: String): Expires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], sessionToken = sessionToken.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expires]
  }
  
  extension [Self <: Expires](x: Self) {
    
    inline def setExpires(value: js.Date): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setSessionToken(value: String): Self = StObject.set(x, "sessionToken", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
