package typings
package passportDashUniqueDashTokenLib.passportDashUniqueDashTokenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends js.Object {
  var failedOnMissing: js.UndefOr[scala.Boolean] = js.undefined
  var passReqToCallback: passportDashUniqueDashTokenLib.passportDashUniqueDashTokenLibNumbers.`true`
  var tokenField: js.UndefOr[java.lang.String] = js.undefined
  var tokenHeader: js.UndefOr[java.lang.String] = js.undefined
  var tokenParams: js.UndefOr[java.lang.String] = js.undefined
  var tokenQuery: js.UndefOr[java.lang.String] = js.undefined
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    passReqToCallback: passportDashUniqueDashTokenLib.passportDashUniqueDashTokenLibNumbers.`true`,
    failedOnMissing: js.UndefOr[scala.Boolean] = js.undefined,
    tokenField: java.lang.String = null,
    tokenHeader: java.lang.String = null,
    tokenParams: java.lang.String = null,
    tokenQuery: java.lang.String = null
  ): StrategyOptionsWithRequest = {
    val __obj = js.Dynamic.literal(passReqToCallback = passReqToCallback)
    if (!js.isUndefined(failedOnMissing)) __obj.updateDynamic("failedOnMissing")(failedOnMissing)
    if (tokenField != null) __obj.updateDynamic("tokenField")(tokenField)
    if (tokenHeader != null) __obj.updateDynamic("tokenHeader")(tokenHeader)
    if (tokenParams != null) __obj.updateDynamic("tokenParams")(tokenParams)
    if (tokenQuery != null) __obj.updateDynamic("tokenQuery")(tokenQuery)
    __obj.asInstanceOf[StrategyOptionsWithRequest]
  }
}

