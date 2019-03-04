package typings
package passportDashLinkedinDashOauth2Lib.passportDashLinkedinDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOption extends js.Object {
  var callbackURL: java.lang.String
  var clientID: java.lang.String
  var clientSecret: java.lang.String
  var enableProof: js.UndefOr[scala.Boolean] = js.undefined
  var profileFields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var scopeSeparator: js.UndefOr[java.lang.String] = js.undefined
}

object StrategyOption {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    enableProof: js.UndefOr[scala.Boolean] = js.undefined,
    profileFields: js.Array[java.lang.String] = null,
    scopeSeparator: java.lang.String = null
  ): StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret)
    if (!js.isUndefined(enableProof)) __obj.updateDynamic("enableProof")(enableProof)
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    __obj.asInstanceOf[StrategyOption]
  }
}

