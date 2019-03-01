package typings
package passportDashClientDashCertLib.passportDashClientDashCertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends js.Object {
  var passReqToCallback: js.UndefOr[passportDashClientDashCertLib.passportDashClientDashCertLibNumbers.`false`] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    passReqToCallback: passportDashClientDashCertLib.passportDashClientDashCertLibNumbers.`false` = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal()
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    __obj.asInstanceOf[StrategyOptions]
  }
}

