package typings.miniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthCode extends js.Object {
  
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
  implicit class AuthCodeOps[Self <: AuthCode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAuthCode(value: String): Self = this.set("authCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthErrorScopes(value: js.Any): Self = this.set("authErrorScopes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthSuccessScopesVarargs(value: String*): Self = this.set("authSuccessScopes", js.Array(value :_*))
    
    @scala.inline
    def setAuthSuccessScopes(value: js.Array[String]): Self = this.set("authSuccessScopes", value.asInstanceOf[js.Any])
  }
}
