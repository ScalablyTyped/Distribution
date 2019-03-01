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

object AuthorizeOptions {
  @scala.inline
  def apply(
    allowEmptyState: js.UndefOr[scala.Boolean] = js.undefined,
    authenticateHandler: js.Object = null,
    authorizationCodeLifetime: scala.Int | scala.Double = null
  ): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmptyState)) __obj.updateDynamic("allowEmptyState")(allowEmptyState)
    if (authenticateHandler != null) __obj.updateDynamic("authenticateHandler")(authenticateHandler)
    if (authorizationCodeLifetime != null) __obj.updateDynamic("authorizationCodeLifetime")(authorizationCodeLifetime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeOptions]
  }
}

