package typings.oktaOktaVue.mod.OktaVuePlugin

import typings.oktaOktaVue.anon.AutoRenew
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OktaAuthJsOptions extends OktaOpenIDOptions {
  var authorizeUrl: js.UndefOr[String] = js.native
  var ignoreSignature: js.UndefOr[Boolean] = js.native
  var maxClockSkew: js.UndefOr[Double] = js.native
  var pkce: js.UndefOr[Boolean] = js.native
  var postLogoutRedirectUri: js.UndefOr[String] = js.native
  var tokenManager: js.UndefOr[AutoRenew] = js.native
  var tokenUrl: js.UndefOr[String] = js.native
  var userinfoUrl: js.UndefOr[String] = js.native
}

object OktaAuthJsOptions {
  @scala.inline
  def apply(): OktaAuthJsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OktaAuthJsOptions]
  }
  @scala.inline
  implicit class OktaAuthJsOptionsOps[Self <: OktaAuthJsOptions] (val x: Self) extends AnyVal {
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
    def setAuthorizeUrl(value: String): Self = this.set("authorizeUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizeUrl: Self = this.set("authorizeUrl", js.undefined)
    @scala.inline
    def setIgnoreSignature(value: Boolean): Self = this.set("ignoreSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreSignature: Self = this.set("ignoreSignature", js.undefined)
    @scala.inline
    def setMaxClockSkew(value: Double): Self = this.set("maxClockSkew", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxClockSkew: Self = this.set("maxClockSkew", js.undefined)
    @scala.inline
    def setPkce(value: Boolean): Self = this.set("pkce", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePkce: Self = this.set("pkce", js.undefined)
    @scala.inline
    def setPostLogoutRedirectUri(value: String): Self = this.set("postLogoutRedirectUri", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostLogoutRedirectUri: Self = this.set("postLogoutRedirectUri", js.undefined)
    @scala.inline
    def setTokenManager(value: AutoRenew): Self = this.set("tokenManager", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenManager: Self = this.set("tokenManager", js.undefined)
    @scala.inline
    def setTokenUrl(value: String): Self = this.set("tokenUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTokenUrl: Self = this.set("tokenUrl", js.undefined)
    @scala.inline
    def setUserinfoUrl(value: String): Self = this.set("userinfoUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserinfoUrl: Self = this.set("userinfoUrl", js.undefined)
  }
  
}

