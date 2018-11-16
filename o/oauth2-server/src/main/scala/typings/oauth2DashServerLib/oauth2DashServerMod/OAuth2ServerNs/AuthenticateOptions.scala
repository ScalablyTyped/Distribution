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

