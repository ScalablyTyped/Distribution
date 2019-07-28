package typings.passportDashUniqueDashToken.passportDashUniqueDashTokenMod

import typings.passportDashUniqueDashToken.passportDashUniqueDashTokenNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrategyOptionsWithRequest extends js.Object {
  var failedOnMissing: js.UndefOr[Boolean] = js.undefined
  var passReqToCallback: `true`
  var tokenField: js.UndefOr[String] = js.undefined
  var tokenHeader: js.UndefOr[String] = js.undefined
  var tokenParams: js.UndefOr[String] = js.undefined
  var tokenQuery: js.UndefOr[String] = js.undefined
}

object StrategyOptionsWithRequest {
  @scala.inline
  def apply(
    passReqToCallback: `true`,
    failedOnMissing: js.UndefOr[Boolean] = js.undefined,
    tokenField: String = null,
    tokenHeader: String = null,
    tokenParams: String = null,
    tokenQuery: String = null
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

