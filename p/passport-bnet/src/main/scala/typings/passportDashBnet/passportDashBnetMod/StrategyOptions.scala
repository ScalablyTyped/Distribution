package typings.passportDashBnet.passportDashBnetMod

import typings.passportDashBnet.passportDashBnetBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends _BaseBnetOptions {
  var passReqToCallback: js.UndefOr[`false`] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(clientID: String, clientSecret: String, passReqToCallback: `false` = null, region: String = null): StrategyOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID.asInstanceOf[js.Any], clientSecret = clientSecret.asInstanceOf[js.Any])
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptions]
  }
}

