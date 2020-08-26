package typings.passportApple.mod

import typings.passportApple.passportAppleBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateOptionsWithRequest extends AuthenticateOptionsBase {
  var passReqToCallback: `true` = js.native
}

object AuthenticateOptionsWithRequest {
  @scala.inline
  def apply(clientID: String, keyID: String, passReqToCallback: `true`, teamID: String): AuthenticateOptionsWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], keyID = keyID.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any], teamID = teamID.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateOptionsWithRequest]
  }
  @scala.inline
  implicit class AuthenticateOptionsWithRequestOps[Self <: AuthenticateOptionsWithRequest] (val x: Self) extends AnyVal {
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
    def setPassReqToCallback(value: `true`): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
  }
  
}

