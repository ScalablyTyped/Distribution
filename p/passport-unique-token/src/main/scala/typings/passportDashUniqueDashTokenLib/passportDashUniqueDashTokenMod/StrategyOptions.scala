package typings
package passportDashUniqueDashTokenLib.passportDashUniqueDashTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends js.Object {
  var failedOnMissing: js.UndefOr[scala.Boolean] = js.undefined
  var passReqToCallback: js.UndefOr[passportDashUniqueDashTokenLib.passportDashUniqueDashTokenLibNumbers.`false`] = js.undefined
  var tokenField: js.UndefOr[java.lang.String] = js.undefined
  var tokenHeader: js.UndefOr[java.lang.String] = js.undefined
  var tokenParams: js.UndefOr[java.lang.String] = js.undefined
  var tokenQuery: js.UndefOr[java.lang.String] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    failedOnMissing: js.UndefOr[scala.Boolean] = js.undefined,
    passReqToCallback: passportDashUniqueDashTokenLib.passportDashUniqueDashTokenLibNumbers.`false` = null,
    tokenField: java.lang.String = null,
    tokenHeader: java.lang.String = null,
    tokenParams: java.lang.String = null,
    tokenQuery: java.lang.String = null
  ): StrategyOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(failedOnMissing)) __obj.updateDynamic("failedOnMissing")(failedOnMissing)
    if (passReqToCallback != null) __obj.updateDynamic("passReqToCallback")(passReqToCallback)
    if (tokenField != null) __obj.updateDynamic("tokenField")(tokenField)
    if (tokenHeader != null) __obj.updateDynamic("tokenHeader")(tokenHeader)
    if (tokenParams != null) __obj.updateDynamic("tokenParams")(tokenParams)
    if (tokenQuery != null) __obj.updateDynamic("tokenQuery")(tokenQuery)
    __obj.asInstanceOf[StrategyOptions]
  }
}

