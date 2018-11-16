package typings
package oauth2DashServerLib.oauth2DashServerMod.OAuth2ServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AuthorizeOptions extends js.Object {
  /**
           * Allow clients to specify an empty state
           */
  var allowEmptyState: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * The authenticate handler
           */
  var authenticateHandler: js.UndefOr[js.Object] = js.undefined
  /**
           * Lifetime of generated authorization codes in seconds (default = 5 minutes).
           */
  var authorizationCodeLifetime: js.UndefOr[scala.Double] = js.undefined
}

