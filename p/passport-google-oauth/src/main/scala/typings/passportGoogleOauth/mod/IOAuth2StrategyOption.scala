package typings.passportGoogleOauth.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOAuth2StrategyOption extends js.Object {
  var accessType: js.UndefOr[String] = js.native
  var approval_prompt: js.UndefOr[String] = js.native
  var authorizationURL: js.UndefOr[String] = js.native
  var callbackURL: String = js.native
  var clientID: String = js.native
  var clientSecret: String = js.native
  var display: js.UndefOr[String] = js.native
  var hostedDomain: js.UndefOr[String] = js.native
  var loginHint: js.UndefOr[String] = js.native
  var openIDRealm: js.UndefOr[String] = js.native
  var prompt: js.UndefOr[String] = js.native
  var requestVisibleActions: js.UndefOr[String] = js.native
  var tokenURL: js.UndefOr[String] = js.native
  var userID: js.UndefOr[String] = js.native
  var userProfileURL: js.UndefOr[String] = js.native
}

object IOAuth2StrategyOption {
  @scala.inline
  def apply(callbackURL: String, clientID: String, clientSecret: String): IOAuth2StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOAuth2StrategyOption]
  }
  @scala.inline
  implicit class IOAuth2StrategyOptionOps[Self <: IOAuth2StrategyOption] (val x: Self) extends AnyVal {
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
    def setCallbackURL(value: String): Self = this.set("callbackURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientID(value: String): Self = this.set("clientID", value.asInstanceOf[js.Any])
    @scala.inline
    def setClientSecret(value: String): Self = this.set("clientSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessType(value: String): Self = this.set("accessType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessType: Self = this.set("accessType", js.undefined)
    @scala.inline
    def setApproval_prompt(value: String): Self = this.set("approval_prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApproval_prompt: Self = this.set("approval_prompt", js.undefined)
    @scala.inline
    def setAuthorizationURL(value: String): Self = this.set("authorizationURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizationURL: Self = this.set("authorizationURL", js.undefined)
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setHostedDomain(value: String): Self = this.set("hostedDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedDomain: Self = this.set("hostedDomain", js.undefined)
    @scala.inline
    def setLoginHint(value: String): Self = this.set("loginHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoginHint: Self = this.set("loginHint", js.undefined)
    @scala.inline
    def setOpenIDRealm(value: String): Self = this.set("openIDRealm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenIDRealm: Self = this.set("openIDRealm", js.undefined)
    @scala.inline
    def setPrompt(value: String): Self = this.set("prompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrompt: Self = this.set("prompt", js.undefined)
    @scala.inline
    def setRequestVisibleActions(value: String): Self = this.set("requestVisibleActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestVisibleActions: Self = this.set("requestVisibleActions", js.undefined)
    @scala.inline
    def setTokenURL(value: String): Self = this.set("tokenURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenURL: Self = this.set("tokenURL", js.undefined)
    @scala.inline
    def setUserID(value: String): Self = this.set("userID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserID: Self = this.set("userID", js.undefined)
    @scala.inline
    def setUserProfileURL(value: String): Self = this.set("userProfileURL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserProfileURL: Self = this.set("userProfileURL", js.undefined)
  }
  
}

