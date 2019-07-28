package typings.passportDashFacebookDashToken.passportDashFacebookDashTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends js.Object {
  var authorizationURL: js.UndefOr[String] = js.undefined
  var clientID: String
  var clientSecret: String
  var enableProof: js.UndefOr[Boolean] = js.undefined
  var profileFields: js.UndefOr[js.Array[String]] = js.undefined
  var scopeSeparator: js.UndefOr[String] = js.undefined
  var tokenURL: js.UndefOr[String] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    clientID: String,
    clientSecret: String,
    authorizationURL: String = null,
    enableProof: js.UndefOr[Boolean] = js.undefined,
    profileFields: js.Array[String] = null,
    scopeSeparator: String = null,
    tokenURL: String = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID, clientSecret = clientSecret)
    if (authorizationURL != null) __obj.updateDynamic("authorizationURL")(authorizationURL)
    if (!js.isUndefined(enableProof)) __obj.updateDynamic("enableProof")(enableProof)
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (tokenURL != null) __obj.updateDynamic("tokenURL")(tokenURL)
    __obj.asInstanceOf[StrategyOptions]
  }
}

