package typings.passportDashAuth0.passportDashAuth0Mod

import typings.passportDashAuth0.passportDashAuth0Booleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionWithRequest extends StrategyOption {
  var passReqToCallback: `true`
}

object StrategyOptionWithRequest {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    domain: String,
    passReqToCallback: `true`,
    enableProof: js.UndefOr[Boolean] = js.undefined,
    profileFields: js.Array[String] = null,
    scopeSeparator: String = null,
    state: js.UndefOr[Boolean] = js.undefined
  ): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL.asInstanceOf[js.Any], clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    if (!js.isUndefined(enableProof)) __obj.updateDynamic("enableProof")(enableProof.asInstanceOf[js.Any])
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields.asInstanceOf[js.Any])
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator.asInstanceOf[js.Any])
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionWithRequest]
  }
}

