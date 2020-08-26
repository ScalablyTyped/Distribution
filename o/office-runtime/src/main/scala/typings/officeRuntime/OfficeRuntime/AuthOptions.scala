package typings.officeRuntime.OfficeRuntime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for the user experience when Office obtains an access token to the add-in from AAD v. 2.0 with the getAccessToken method.
  * @beta
  */
@js.native
trait AuthOptions extends js.Object {
  /**
    * Allows Office to get an access token silectly or through interactive consent, if one is required.
    * If set to false, Office will silently try to get an access token. If it fails to do so, Office will return a descriptive error.
    * If set to true, Office will show an interactive consent UI after it fails to silently get an access token.
    * The prompt will only allow consent to the AAD profile scope, not to any Microsoft Graph scopes.
    */
  var allowConsentPrompt: js.UndefOr[Boolean] = js.native
  /**
    * Allows Office to get an access token silently provided consent is present or show interactive UI to sign in the user.
    * If set to false, office will silently try to get an access token. If it fails to do so, Office will return a descriptive error.
    * If set to true, Office will show an interactive sign-in UI after it fails to silently get an access token.
    */
  var allowSignInPrompt: js.UndefOr[Boolean] = js.native
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  /**
    * Causes Office to prompt the user to provide the additional factor when the tenancy being targeted by Microsoft Graph requires multifactor
    * authentication. The string value identifies the type of additional factor that is required. In most cases, you won't know at development
    * time whether the user's tenant requires an additional factor or what the string should be. So this option would be used in a "second try"
    * call of getAccessToken after Microsoft Graph has sent an error requesting the additional factor and containing the string that should
    * be used with the authChallenge option.
    */
  var authChallenge: js.UndefOr[String] = js.native
  /**
    * Causes Office to return descriptive error when the add-in wants to access MS Graph and the user/admin has not granted consent to MS Graph scopes.
    * Office only supports consent to graph scopes when the add-in has been deployed by a tenant admin. This information will not be available during development.
    * Setting this option to true will allow Office to inform your add-in beforehand if MS graph access will fail by returning back a descriptive error.
    */
  var forMSGraphAccess: js.UndefOr[Boolean] = js.native
  /**
    * Deprecated
    * Prompts the user to add their Office account (or to switch to it, if it is already added).
    */
  var forceAddAccount: js.UndefOr[Boolean] = js.native
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
    def setAllowConsentPrompt(value: Boolean): Self = this.set("allowConsentPrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowConsentPrompt: Self = this.set("allowConsentPrompt", js.undefined)
    @scala.inline
    def setAllowSignInPrompt(value: Boolean): Self = this.set("allowSignInPrompt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSignInPrompt: Self = this.set("allowSignInPrompt", js.undefined)
    @scala.inline
    def setAsyncContext(value: js.Any): Self = this.set("asyncContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncContext: Self = this.set("asyncContext", js.undefined)
    @scala.inline
    def setAuthChallenge(value: String): Self = this.set("authChallenge", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthChallenge: Self = this.set("authChallenge", js.undefined)
    @scala.inline
    def setForMSGraphAccess(value: Boolean): Self = this.set("forMSGraphAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForMSGraphAccess: Self = this.set("forMSGraphAccess", js.undefined)
    @scala.inline
    def setForceAddAccount(value: Boolean): Self = this.set("forceAddAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceAddAccount: Self = this.set("forceAddAccount", js.undefined)
  }
  
}

