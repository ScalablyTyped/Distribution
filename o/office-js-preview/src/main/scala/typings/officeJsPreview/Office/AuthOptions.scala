package typings.officeJsPreview.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for the user experience when Office obtains an access token to the add-in from AAD v. 2.0 with the getAccessTokenAsync method.
  */
@js.native
trait AuthOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  /**
    * Causes Office to prompt the user to provide the additional factor when the tenancy being targeted by Microsoft Graph requires multifactor
    * authentication. The string value identifies the type of additional factor that is required. In most cases, you won't know at development
    * time whether the user's tenant requires an additional factor or what the string should be. So this option would be used in a "second try"
    * call of getAccessTokenAsync after Microsoft Graph has sent an error requesting the additional factor and containing the string that should
    * be used with the authChallenge option.
    */
  var authChallenge: js.UndefOr[String] = js.native
  /**
    * Prompts the user to add their Office account (or to switch to it, if it is already added).
    */
  var forceAddAccount: js.UndefOr[Boolean] = js.native
  /**
    * Causes Office to display the add-in consent experience. Useful if the add-in's Azure permissions have changed or if the user's consent has
    * been revoked.
    */
  var forceConsent: js.UndefOr[Boolean] = js.native
}

object AuthOptions {
  @scala.inline
  def apply(): AuthOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuthOptions]
  }
  @scala.inline
  implicit class AuthOptionsOps[Self <: AuthOptions] (val x: Self) extends AnyVal {
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
    def setAsyncContext(value: js.Any): Self = this.set("asyncContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncContext: Self = this.set("asyncContext", js.undefined)
    @scala.inline
    def setAuthChallenge(value: String): Self = this.set("authChallenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthChallenge: Self = this.set("authChallenge", js.undefined)
    @scala.inline
    def setForceAddAccount(value: Boolean): Self = this.set("forceAddAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceAddAccount: Self = this.set("forceAddAccount", js.undefined)
    @scala.inline
    def setForceConsent(value: Boolean): Self = this.set("forceConsent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceConsent: Self = this.set("forceConsent", js.undefined)
  }
  
}

