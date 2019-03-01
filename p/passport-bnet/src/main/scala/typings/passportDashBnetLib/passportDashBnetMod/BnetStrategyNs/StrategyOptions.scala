package typings
package passportDashBnetLib.passportDashBnetMod.BnetStrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends _BaseBnetOptions {
  var passReqToCallback: js.UndefOr[passportDashBnetLib.passportDashBnetLibNumbers.`false`] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: passportDashBnetLib.passportDashBnetLibNumbers.`false` = null,
    region: java.lang.String = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("clientSecret")(clientSecret)
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[StrategyOptions]
  }
}

