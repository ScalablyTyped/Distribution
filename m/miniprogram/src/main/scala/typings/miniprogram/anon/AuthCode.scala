package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthCode extends StObject {
  
  var authCode: String
  
  var authState: String
}
object AuthCode {
  
  inline def apply(authCode: String, authState: String): AuthCode = {
    val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any], authState = authState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthCode]
  }
  
  extension [Self <: AuthCode](x: Self) {
    
    inline def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
    
    inline def setAuthState(value: String): Self = StObject.set(x, "authState", value.asInstanceOf[js.Any])
  }
}
