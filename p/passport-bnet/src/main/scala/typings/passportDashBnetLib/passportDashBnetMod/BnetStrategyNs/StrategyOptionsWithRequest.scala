package typings
package passportDashBnetLib.passportDashBnetMod.BnetStrategyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends _BaseBnetOptions {
  var passReqToCallback: passportDashBnetLib.passportDashBnetLibNumbers.`true`
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    clientID: java.lang.String,
    clientSecret: java.lang.String,
    passReqToCallback: passportDashBnetLib.passportDashBnetLibNumbers.`true`,
    region: java.lang.String = null
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clientID")(clientID)
    __obj.updateDynamic("clientSecret")(clientSecret)
    __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

