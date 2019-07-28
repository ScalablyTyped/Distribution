package typings.passportDashUniqueDashToken.passportDashUniqueDashTokenMod

import typings.passportDashUniqueDashToken.passportDashUniqueDashTokenNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptions extends js.Object {
  var failedOnMissing: js.UndefOr[Boolean] = js.undefined
  var passReqToCallback: js.UndefOr[`false`] = js.undefined
  var tokenField: js.UndefOr[String] = js.undefined
  var tokenHeader: js.UndefOr[String] = js.undefined
  var tokenParams: js.UndefOr[String] = js.undefined
  var tokenQuery: js.UndefOr[String] = js.undefined
}

object StrategyOptions {
  @scala.inline
  def apply(
    failedOnMissing: js.UndefOr[Boolean] = js.undefined,
    passReqToCallback: `false` = null,
    tokenField: String = null,
    tokenHeader: String = null,
    tokenParams: String = null,
    tokenQuery: String = null
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

