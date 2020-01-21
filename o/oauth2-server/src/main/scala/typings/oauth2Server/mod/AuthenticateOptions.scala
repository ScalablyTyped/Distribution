package typings.oauth2Server.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticateOptions extends js.Object {
  /**
    * Set the X-Accepted-OAuth-Scopes HTTP header on response objects.
    */
  var addAcceptedScopesHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Set the X-OAuth-Scopes HTTP header on response objects.
    */
  var addAuthorizedScopesHeader: js.UndefOr[Boolean] = js.undefined
  /**
    * Allow clients to pass bearer tokens in the query string of a request.
    */
  var allowBearerTokensInQueryString: js.UndefOr[Boolean] = js.undefined
  /**
    * The scope(s) to authenticate.
    */
  var scope: js.UndefOr[String | js.Array[String]] = js.undefined
}

object AuthenticateOptions {
  @scala.inline
  def apply(
    addAcceptedScopesHeader: js.UndefOr[Boolean] = js.undefined,
    addAuthorizedScopesHeader: js.UndefOr[Boolean] = js.undefined,
    allowBearerTokensInQueryString: js.UndefOr[Boolean] = js.undefined,
    scope: String | js.Array[String] = null
  ): AuthenticateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(addAcceptedScopesHeader)) __obj.updateDynamic("addAcceptedScopesHeader")(addAcceptedScopesHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(addAuthorizedScopesHeader)) __obj.updateDynamic("addAuthorizedScopesHeader")(addAuthorizedScopesHeader.asInstanceOf[js.Any])
    if (!js.isUndefined(allowBearerTokensInQueryString)) __obj.updateDynamic("allowBearerTokensInQueryString")(allowBearerTokensInQueryString.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticateOptions]
  }
}

