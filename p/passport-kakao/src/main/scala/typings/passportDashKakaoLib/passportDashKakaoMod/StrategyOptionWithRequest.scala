package typings
package passportDashKakaoLib.passportDashKakaoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionWithRequest extends StrategyOption {
  var passReqToCallback: scala.Boolean
}

object StrategyOptionWithRequest {
  @scala.inline
  def apply(
    callbackURL: java.lang.String,
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: scala.Boolean,
    customHeaders: java.lang.String = null,
    scopeSeparator: java.lang.String = null
  ): StrategyOptionWithRequest = {
    val __obj = js.Dynamic.literal(callbackURL = callbackURL, clientID = clientID, clientSecret = clientSecret, passReqToCallback = passReqToCallback)
    if (customHeaders != null) __obj.updateDynamic("customHeaders")(customHeaders)
    if (scopeSeparator != null) __obj.updateDynamic("scopeSeparator")(scopeSeparator)
    __obj.asInstanceOf[StrategyOptionWithRequest]
  }
}

