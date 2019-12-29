package typings.passportDashClientDashCert.passportDashClientDashCertMod

import typings.passportDashClientDashCert.passportDashClientDashCertBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends js.Object {
  var passReqToCallback: js.UndefOr[`false`] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(passReqToCallback: `false` = null): StrategyOptions = {
    val __obj = js.Dynamic.literal()
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrategyOptions]
  }
}

