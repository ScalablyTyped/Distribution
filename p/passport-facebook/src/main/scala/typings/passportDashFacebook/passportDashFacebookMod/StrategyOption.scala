package typings.passportDashFacebook.passportDashFacebookMod

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
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    if (!js.isUndefined(enableProof)) __obj.updateDynamic("enableProof")(enableProof.asInstanceOf[js.Any])
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOption]
  }
}

