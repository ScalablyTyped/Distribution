package typings.oauth2Implicit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthResult extends js.Object {
  var accessToken: String = js.native
  var state: AuthState = js.native
}

object AuthResult {
  @scala.inline
  def apply(accessToken: String, state: AuthState): AuthResult = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthResult]
  }
  @scala.inline
  implicit class AuthResultOps[Self <: AuthResult] (val x: Self) extends AnyVal {
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
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: AuthState): Self = this.set("state", value.asInstanceOf[js.Any])
  }
  
}

