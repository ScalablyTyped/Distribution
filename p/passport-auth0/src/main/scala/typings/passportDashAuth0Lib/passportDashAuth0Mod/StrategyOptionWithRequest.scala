package typings
package passportDashAuth0Lib.passportDashAuth0Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionWithRequest extends StrategyOption {
  var passReqToCallback: passportDashAuth0Lib.passportDashAuth0LibNumbers.`true`
}

object StrategyOptionWithRequest {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    domain: java.lang.String,
    passReqToCallback: passportDashAuth0Lib.passportDashAuth0LibNumbers.`true`,
    enableProof: js.UndefOr[scala.Boolean] = js.undefined,
    profileFields: js.Array[java.lang.String] = null,
    scopeSeparator: java.lang.String = null,
    state: js.UndefOr[scala.Boolean] = js.undefined
  ): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret, domain = domain, passReqToCallback = passReqToCallback)
    if (!js.isUndefined(enableProof)) __obj.updateDynamic("enableProof")(enableProof)
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[StrategyOptionWithRequest]
  }
}

