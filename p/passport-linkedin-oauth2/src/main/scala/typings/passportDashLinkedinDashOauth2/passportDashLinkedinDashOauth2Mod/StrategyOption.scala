package typings.passportDashLinkedinDashOauth2.passportDashLinkedinDashOauth2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOption extends js.Object {
  var callbackURL: String
  var clientID: String
  var clientSecret: String
  var enableProof: js.UndefOr[Boolean] = js.undefined
  var profileFields: js.UndefOr[js.Array[String]] = js.undefined
  var scopeSeparator: js.UndefOr[String] = js.undefined
}

object StrategyOption {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    enableProof: js.UndefOr[Boolean] = js.undefined,
    profileFields: js.Array[String] = null,
    scopeSeparator: String = null
  ): StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret)
    if (!js.isUndefined(enableProof)) __obj.updateDynamic("enableProof")(enableProof)
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    __obj.asInstanceOf[StrategyOption]
  }
}

