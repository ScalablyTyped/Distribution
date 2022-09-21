package typings.miniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAuthCodeCallbackValue extends StObject {
  
  var authCode: String
  
  var authErrorScopes: Any
  
  var authSuccessScopes: js.Array[String]
}
object GetAuthCodeCallbackValue {
  
  inline def apply(authCode: String, authErrorScopes: Any, authSuccessScopes: js.Array[String]): GetAuthCodeCallbackValue = {
    val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any], authErrorScopes = authErrorScopes.asInstanceOf[js.Any], authSuccessScopes = authSuccessScopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAuthCodeCallbackValue]
  }
  
  extension [Self <: GetAuthCodeCallbackValue](x: Self) {
    
    inline def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
    
    inline def setAuthErrorScopes(value: Any): Self = StObject.set(x, "authErrorScopes", value.asInstanceOf[js.Any])
    
    inline def setAuthSuccessScopes(value: js.Array[String]): Self = StObject.set(x, "authSuccessScopes", value.asInstanceOf[js.Any])
    
    inline def setAuthSuccessScopesVarargs(value: String*): Self = StObject.set(x, "authSuccessScopes", js.Array(value*))
  }
}
