package typings.oauth2Server.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthorizeOptions extends js.Object {
  /**
    * Allow clients to specify an empty state
    */
  var allowEmptyState: js.UndefOr[Boolean] = js.undefined
  /**
    * The authenticate handler
    */
  var authenticateHandler: js.UndefOr[js.Object] = js.undefined
  /**
    * Lifetime of generated authorization codes in seconds (default = 5 minutes).
    */
  var authorizationCodeLifetime: js.UndefOr[Double] = js.undefined
}

object AuthorizeOptions {
  @scala.inline
  def apply(
    allowEmptyState: js.UndefOr[Boolean] = js.undefined,
    authenticateHandler: js.Object = null,
    authorizationCodeLifetime: Int | Double = null
  ): AuthorizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmptyState)) __obj.updateDynamic("allowEmptyState")(allowEmptyState.asInstanceOf[js.Any])
    if (authenticateHandler != null) __obj.updateDynamic("authenticateHandler")(authenticateHandler.asInstanceOf[js.Any])
    if (authorizationCodeLifetime != null) __obj.updateDynamic("authorizationCodeLifetime")(authorizationCodeLifetime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorizeOptions]
  }
}

