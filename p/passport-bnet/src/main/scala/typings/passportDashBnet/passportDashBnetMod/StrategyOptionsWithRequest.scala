package typings.passportDashBnet.passportDashBnetMod

import typings.passportDashBnet.passportDashBnetBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends _BaseBnetOptions {
  var passReqToCallback: `true`
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(clientID: String, clientSecret: String, passReqToCallback: `true`, region: String = null): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any], passReqToCallback = passReqToCallback.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

