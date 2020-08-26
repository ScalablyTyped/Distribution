package typings.passport.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateOptions extends js.Object {
  var assignProperty: js.UndefOr[String] = js.native
  var authInfo: js.UndefOr[Boolean] = js.native
  var failWithError: js.UndefOr[Boolean] = js.native
  var failureFlash: js.UndefOr[String | Boolean] = js.native
  var failureMessage: js.UndefOr[Boolean | String] = js.native
  var failureRedirect: js.UndefOr[String] = js.native
  var passReqToCallback: js.UndefOr[Boolean] = js.native
  var pauseStream: js.UndefOr[Boolean] = js.native
  var prompt: js.UndefOr[String] = js.native
  var scope: js.UndefOr[String | js.Array[String]] = js.native
  var session: js.UndefOr[Boolean] = js.native
  var state: js.UndefOr[String] = js.native
  var successFlash: js.UndefOr[String | Boolean] = js.native
  var successMessage: js.UndefOr[Boolean | String] = js.native
  var successRedirect: js.UndefOr[String] = js.native
  var successReturnToOrRedirect: js.UndefOr[String] = js.native
  var userProperty: js.UndefOr[String] = js.native
}

object AuthenticateOptions {
  @scala.inline
  def apply(): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateOptions]
  }
  @scala.inline
  implicit class AuthenticateOptionsOps[Self <: AuthenticateOptions] (val x: Self) extends AnyVal {
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
    def setAssignProperty(value: String): Self = this.set("assignProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssignProperty: Self = this.set("assignProperty", js.undefined)
    @scala.inline
    def setAuthInfo(value: Boolean): Self = this.set("authInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthInfo: Self = this.set("authInfo", js.undefined)
    @scala.inline
    def setFailWithError(value: Boolean): Self = this.set("failWithError", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailWithError: Self = this.set("failWithError", js.undefined)
    @scala.inline
    def setFailureFlash(value: String | Boolean): Self = this.set("failureFlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureFlash: Self = this.set("failureFlash", js.undefined)
    @scala.inline
    def setFailureMessage(value: Boolean | String): Self = this.set("failureMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureMessage: Self = this.set("failureMessage", js.undefined)
    @scala.inline
    def setFailureRedirect(value: String): Self = this.set("failureRedirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureRedirect: Self = this.set("failureRedirect", js.undefined)
    @scala.inline
    def setPassReqToCallback(value: Boolean): Self = this.set("passReqToCallback", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassReqToCallback: Self = this.set("passReqToCallback", js.undefined)
    @scala.inline
    def setPauseStream(value: Boolean): Self = this.set("pauseStream", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePauseStream: Self = this.set("pauseStream", js.undefined)
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    @scala.inline
    def setScopeVarargs(value: String*): Self = this.set("scope", js.Array(value :_*))
    @scala.inline
    def setScope(value: String | js.Array[String]): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSession(value: Boolean): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    @scala.inline
    def setSuccessFlash(value: String | Boolean): Self = this.set("successFlash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessFlash: Self = this.set("successFlash", js.undefined)
    @scala.inline
    def setSuccessMessage(value: Boolean | String): Self = this.set("successMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessMessage: Self = this.set("successMessage", js.undefined)
    @scala.inline
    def setSuccessRedirect(value: String): Self = this.set("successRedirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessRedirect: Self = this.set("successRedirect", js.undefined)
    @scala.inline
    def setSuccessReturnToOrRedirect(value: String): Self = this.set("successReturnToOrRedirect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessReturnToOrRedirect: Self = this.set("successReturnToOrRedirect", js.undefined)
    @scala.inline
    def setUserProperty(value: String): Self = this.set("userProperty", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProperty: Self = this.set("userProperty", js.undefined)
  }
  
}

