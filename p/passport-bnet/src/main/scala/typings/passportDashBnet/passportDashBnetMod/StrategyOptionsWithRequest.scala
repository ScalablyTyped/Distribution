package typings.passportDashBnet.passportDashBnetMod

import typings.passportDashBnet.passportDashBnetNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends _BaseBnetOptions {
  var passReqToCallback: `true`
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(clientID: String, clientSecret: String, passReqToCallback: `true`, region: String = null): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID, clientSecret = clientSecret, passReqToCallback = passReqToCallback)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

