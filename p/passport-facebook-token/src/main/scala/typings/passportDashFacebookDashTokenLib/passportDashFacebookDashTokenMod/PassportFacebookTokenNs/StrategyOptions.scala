package typings
package passportDashFacebookDashTokenLib.passportDashFacebookDashTokenMod.PassportFacebookTokenNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends js.Object {
  var authorizationURL: js.UndefOr[java.lang.String] = js.undefined
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var enableProof: js.UndefOr[scala.Boolean] = js.undefined
  var profileFields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var scopeSeparator: js.UndefOr[java.lang.String] = js.undefined
  var tokenURL: js.UndefOr[java.lang.String] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    authorizationURL: java.lang.String = null,
    enableProof: js.UndefOr[scala.Boolean] = js.undefined,
    profileFields: js.Array[java.lang.String] = null,
    scopeSeparator: java.lang.String = null,
    tokenURL: java.lang.String = null
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

