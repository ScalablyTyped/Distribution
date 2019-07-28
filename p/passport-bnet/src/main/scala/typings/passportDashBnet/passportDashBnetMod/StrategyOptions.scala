package typings.passportDashBnet.passportDashBnetMod

import typings.passportDashBnet.passportDashBnetNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends _BaseBnetOptions {
  var passReqToCallback: js.UndefOr[`false`] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(clientID: String, clientSecret: String, passReqToCallback: `false` = null, region: String = null): StrategyOptions = {
    val __obj = js.Dynamic.literal(clientID = clientID, clientSecret = clientSecret)
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[StrategyOptions]
  }
}

