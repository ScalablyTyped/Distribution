package typings.passportDashLinkedinDashOauth2.passportDashLinkedinDashOauth2Mod

import typings.passportDashLinkedinDashOauth2.passportDashLinkedinDashOauth2Numbers.`true`
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
    passReqToCallback: `true`,
    enableProof: js.UndefOr[Boolean] = js.undefined,
    profileFields: js.Array[String] = null,
    scopeSeparator: String = null
  ): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret, passReqToCallback = passReqToCallback)
    if (!js.isUndefined(enableProof)) __obj.updateDynamic("enableProof")(enableProof)
    if (profileFields != null) __obj.updateDynamic("profileFields")(profileFields)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    __obj.asInstanceOf[StrategyOptionWithRequest]
  }
}

