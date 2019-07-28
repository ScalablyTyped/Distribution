package typings.officeDashJsDashPreview.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for the user experience when Office obtains an access token to the add-in from AAD v. 2.0 with the getAccessTokenAsync method.
  */
trait AuthOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.undefined
  /**
    * Causes Office to prompt the user to provide the additional factor when the tenancy being targeted by Microsoft Graph requires multifactor
    * authentication. The string value identifies the type of additional factor that is required. In most cases, you won't know at development
    * time whether the user's tenant requires an additional factor or what the string should be. So this option would be used in a "second try"
    * call of getAccessTokenAsync after Microsoft Graph has sent an error requesting the additional factor and containing the string that should
    * be used with the authChallenge option.
    */
  var authChallenge: js.UndefOr[String] = js.undefined
  /**
    * Prompts the user to add their Office account (or to switch to it, if it is already added).
    */
  var forceAddAccount: js.UndefOr[Boolean] = js.undefined
  /**
    * Causes Office to display the add-in consent experience. Useful if the add-in's Azure permissions have changed or if the user's consent has
    * been revoked.
    */
  var forceConsent: js.UndefOr[Boolean] = js.undefined
}

object AuthOptions {
  @scala.inline
  def apply(
    asyncContext: js.Any = null,
    authChallenge: String = null,
    forceAddAccount: js.UndefOr[Boolean] = js.undefined,
    forceConsent: js.UndefOr[Boolean] = js.undefined
  ): AuthOptions = {
    val __obj = js.Dynamic.literal()
    if (asyncContext != null) __obj.updateDynamic("asyncContext")(asyncContext)
    if (authChallenge != null) __obj.updateDynamic("authChallenge")(authChallenge)
    if (!js.isUndefined(forceAddAccount)) __obj.updateDynamic("forceAddAccount")(forceAddAccount)
    if (!js.isUndefined(forceConsent)) __obj.updateDynamic("forceConsent")(forceConsent)
    __obj.asInstanceOf[AuthOptions]
  }
}

