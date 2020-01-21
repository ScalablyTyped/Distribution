package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvalidStep extends js.Object {
  var invalidStep: js.UndefOr[String] = js.undefined
  var maxMin: js.UndefOr[String] = js.undefined
  var noValue: js.UndefOr[String] = js.undefined
  var optionNum: js.UndefOr[String] = js.undefined
  var valueRange: js.UndefOr[String] = js.undefined
}

object AnonInvalidStep {
  @scala.inline
  def apply(
    invalidStep: String = null,
    maxMin: String = null,
    noValue: String = null,
    optionNum: String = null,
    valueRange: String = null
  ): AnonInvalidStep = {
    val __obj = js.Dynamic.literal()
    if (invalidStep != null) __obj.updateDynamic("invalidStep")(invalidStep.asInstanceOf[js.Any])
    if (maxMin != null) __obj.updateDynamic("maxMin")(maxMin.asInstanceOf[js.Any])
    if (noValue != null) __obj.updateDynamic("noValue")(noValue.asInstanceOf[js.Any])
    if (optionNum != null) __obj.updateDynamic("optionNum")(optionNum.asInstanceOf[js.Any])
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonInvalidStep]
  }
}

