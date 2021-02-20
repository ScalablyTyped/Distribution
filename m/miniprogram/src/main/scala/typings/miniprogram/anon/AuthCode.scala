package typings.miniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthCode extends StObject {
  
  var authCode: String = js.native
  
  var authErrorScopes: js.Any = js.native
  
  var authSuccessScopes: js.Array[String] = js.native
}
object AuthCode {
  
  @scala.inline
  def apply(authCode: String, authErrorScopes: js.Any, authSuccessScopes: js.Array[String]): AuthCode = {
    val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any], authErrorScopes = authErrorScopes.asInstanceOf[js.Any], authSuccessScopes = authSuccessScopes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthCode]
  }
  
  @scala.inline
  implicit class AuthCodeMutableBuilder[Self <: AuthCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthCode(value: String): Self = StObject.set(x, "authCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthErrorScopes(value: js.Any): Self = StObject.set(x, "authErrorScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthSuccessScopes(value: js.Array[String]): Self = StObject.set(x, "authSuccessScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthSuccessScopesVarargs(value: String*): Self = StObject.set(x, "authSuccessScopes", js.Array(value :_*))
  }
}
