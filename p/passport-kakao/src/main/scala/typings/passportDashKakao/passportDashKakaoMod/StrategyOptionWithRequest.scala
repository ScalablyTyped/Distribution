package typings.passportDashKakao.passportDashKakaoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionWithRequest extends StrategyOption {
  var passReqToCallback: Boolean
}

object StrategyOptionWithRequest {
  @scala.inline
  def apply(
    callbackURL: String,
    clientID: String,
    clientSecret: String,
    passReqToCallback: Boolean,
    customHeaders: String = null,
    scopeSeparator: String = null
  ): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret, passReqToCallback = passReqToCallback)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    __obj.asInstanceOf[StrategyOptionWithRequest]
  }
}

