package typings.passportLocal.mod

import typings.passportLocal.passportLocalBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStrategyOptionsWithRequest extends js.Object {
  var passReqToCallback: `true` = js.native
  var passwordField: js.UndefOr[String] = js.native
  var session: js.UndefOr[Boolean] = js.native
  var usernameField: js.UndefOr[String] = js.native
}

object IStrategyOptionsWithRequest {
  @scala.inline
  def apply(passReqToCallback: `true`): IStrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStrategyOptionsWithRequest]
  }
  @scala.inline
  implicit class IStrategyOptionsWithRequestOps[Self <: IStrategyOptionsWithRequest] (val x: Self) extends AnyVal {
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
    @scala.inline
    def setPasswordField(value: String): Self = this.set("passwordField", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePasswordField: Self = this.set("passwordField", js.undefined)
    @scala.inline
    def setSession(value: Boolean): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setUsernameField(value: String): Self = this.set("usernameField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsernameField: Self = this.set("usernameField", js.undefined)
  }
  
}

