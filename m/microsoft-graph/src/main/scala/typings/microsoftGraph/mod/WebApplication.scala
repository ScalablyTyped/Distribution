package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebApplication extends js.Object {
  // Home page or landing page of the application.
  var homePageUrl: js.UndefOr[String] = js.native
  // Specifies whether this web application can request tokens using the OAuth 2.0 implicit flow.
  var implicitGrantSettings: js.UndefOr[ImplicitGrantSettings] = js.native
  /**
    * Specifies the URL that will be used by Microsoft's authorization service to logout an user using front-channel,
    * back-channel or SAML logout protocols.
    */
  var logoutUrl: js.UndefOr[String] = js.native
  /**
    * Specifies the URLs where user tokens are sent for sign-in, or the redirect URIs where OAuth 2.0 authorization codes and
    * access tokens are sent.
    */
  var redirectUris: js.UndefOr[js.Array[String]] = js.native
}

object WebApplication {
  @scala.inline
  def apply(): WebApplication = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebApplication]
  }
  @scala.inline
  implicit class WebApplicationOps[Self <: WebApplication] (val x: Self) extends AnyVal {
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
    def setHomePageUrl(value: String): Self = this.set("homePageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHomePageUrl: Self = this.set("homePageUrl", js.undefined)
    @scala.inline
    def setImplicitGrantSettings(value: ImplicitGrantSettings): Self = this.set("implicitGrantSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplicitGrantSettings: Self = this.set("implicitGrantSettings", js.undefined)
    @scala.inline
    def setLogoutUrl(value: String): Self = this.set("logoutUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogoutUrl: Self = this.set("logoutUrl", js.undefined)
    @scala.inline
    def setRedirectUrisVarargs(value: String*): Self = this.set("redirectUris", js.Array(value :_*))
    @scala.inline
    def setRedirectUris(value: js.Array[String]): Self = this.set("redirectUris", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedirectUris: Self = this.set("redirectUris", js.undefined)
  }
  
}

