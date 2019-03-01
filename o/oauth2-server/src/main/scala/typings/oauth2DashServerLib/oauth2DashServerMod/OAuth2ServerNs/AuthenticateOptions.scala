package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateOptions extends js.Object {
  /**
    * Set the X-Accepted-OAuth-Scopes HTTP header on response objects.
    */
  var addAcceptedScopesHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Set the X-OAuth-Scopes HTTP header on response objects.
    */
  var addAuthorizedScopesHeader: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allow clients to pass bearer tokens in the query string of a request.
    */
  var allowBearerTokensInQueryString: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The scope(s) to authenticate.
    */
  var scope: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
}

object AuthenticateOptions {
  @scala.inline
  def apply(
    addAcceptedScopesHeader: js.UndefOr[scala.Boolean] = js.undefined,
    addAuthorizedScopesHeader: js.UndefOr[scala.Boolean] = js.undefined,
    allowBearerTokensInQueryString: js.UndefOr[scala.Boolean] = js.undefined,
    scope: java.lang.String | js.Array[java.lang.String] = null
  ): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addAcceptedScopesHeader)) __obj.updateDynamic("addAcceptedScopesHeader")(addAcceptedScopesHeader)
    if (!js.isUndefined(addAuthorizedScopesHeader)) __obj.updateDynamic("addAuthorizedScopesHeader")(addAuthorizedScopesHeader)
    if (!js.isUndefined(allowBearerTokensInQueryString)) __obj.updateDynamic("allowBearerTokensInQueryString")(allowBearerTokensInQueryString)
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateOptions]
  }
}

