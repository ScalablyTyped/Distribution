package typings.passportGoogleOauth20.mod

import typings.passport.mod.AuthenticateOptions
import typings.passportGoogleOauth20.passportGoogleOauth20Strings.offline
import typings.passportGoogleOauth20.passportGoogleOauth20Strings.online
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthenticateOptionsGoogle extends AuthenticateOptions {
  var accessType: js.UndefOr[offline | online] = js.native
  var display: js.UndefOr[String] = js.native
  var hd: js.UndefOr[String] = js.native
  var hostedDomain: js.UndefOr[String] = js.native
  var includeGrantedScopes: js.UndefOr[Boolean] = js.native
  var loginHint: js.UndefOr[String] = js.native
  var openIDRealm: js.UndefOr[js.Any] = js.native
  var requestVisibleActions: js.UndefOr[js.Any] = js.native
}

object AuthenticateOptionsGoogle {
  @scala.inline
  def apply(): AuthenticateOptionsGoogle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthenticateOptionsGoogle]
  }
  @scala.inline
  implicit class AuthenticateOptionsGoogleOps[Self <: AuthenticateOptionsGoogle] (val x: Self) extends AnyVal {
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
    def setAccessType(value: offline | online): Self = this.set("accessType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessType: Self = this.set("accessType", js.undefined)
    @scala.inline
    def setDisplay(value: String): Self = this.set("display", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    @scala.inline
    def setHd(value: String): Self = this.set("hd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHd: Self = this.set("hd", js.undefined)
    @scala.inline
    def setHostedDomain(value: String): Self = this.set("hostedDomain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHostedDomain: Self = this.set("hostedDomain", js.undefined)
    @scala.inline
    def setIncludeGrantedScopes(value: Boolean): Self = this.set("includeGrantedScopes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeGrantedScopes: Self = this.set("includeGrantedScopes", js.undefined)
    @scala.inline
    def setLoginHint(value: String): Self = this.set("loginHint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoginHint: Self = this.set("loginHint", js.undefined)
    @scala.inline
    def setOpenIDRealm(value: js.Any): Self = this.set("openIDRealm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOpenIDRealm: Self = this.set("openIDRealm", js.undefined)
    @scala.inline
    def setRequestVisibleActions(value: js.Any): Self = this.set("requestVisibleActions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestVisibleActions: Self = this.set("requestVisibleActions", js.undefined)
  }
  
}

