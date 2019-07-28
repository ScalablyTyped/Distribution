package typings.passportDashAuth0.passportDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOption extends js.Object {
  var callbackURL: String
  var clientID: String
  var clientSecret: String
  var domain: String
  var enableProof: js.UndefOr[Boolean] = js.undefined
  var profileFields: js.UndefOr[js.Array[String]] = js.undefined
  var scopeSeparator: js.UndefOr[String] = js.undefined
  var state: js.UndefOr[Boolean] = js.undefined
}

object StrategyOption {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    domain: String,
    enableProof: js.UndefOr[Boolean] = js.undefined,
    profileFields: js.Array[String] = null,
    scopeSeparator: String = null,
    state: js.UndefOr[Boolean] = js.undefined
  ): StrategyOption = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret, domain = domain)
    if (!js.isUndefined(enableProof)) __obj.updateDynamic("enableProof")(enableProof)
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[StrategyOption]
  }
}

