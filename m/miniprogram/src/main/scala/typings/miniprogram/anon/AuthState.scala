package typings.miniprogram.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthState extends js.Object {
  
  var authCode: String = js.native
  
  var authState: String = js.native
}
object AuthState {
  
  @scala.inline
  def apply(authCode: String, authState: String): AuthState = {
    val __obj = js.Dynamic.literal(authCode = authCode.asInstanceOf[js.Any], authState = authState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthState]
  }
  
  @scala.inline
  implicit class AuthStateOps[Self <: AuthState] (val x: Self) extends AnyVal {
    
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
    def setAuthState(value: String): Self = this.set("authState", value.asInstanceOf[js.Any])
  }
}
