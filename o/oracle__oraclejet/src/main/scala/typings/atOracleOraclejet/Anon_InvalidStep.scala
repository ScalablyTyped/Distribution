package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InvalidStep extends js.Object {
  var invalidStep: js.UndefOr[String] = js.undefined
  var maxMin: js.UndefOr[String] = js.undefined
  var noValue: js.UndefOr[String] = js.undefined
  var optionNum: js.UndefOr[String] = js.undefined
  var valueRange: js.UndefOr[String] = js.undefined
}

object Anon_InvalidStep {
  @scala.inline
  def apply(
    invalidStep: String = null,
    maxMin: String = null,
    noValue: String = null,
    optionNum: String = null,
    valueRange: String = null
  ): Anon_InvalidStep = {
    val __obj = js.Dynamic.literal()
    if (invalidStep != null) __obj.updateDynamic("invalidStep")(invalidStep)
    if (maxMin != null) __obj.updateDynamic("maxMin")(maxMin)
    if (noValue != null) __obj.updateDynamic("noValue")(noValue)
    if (optionNum != null) __obj.updateDynamic("optionNum")(optionNum)
    if (valueRange != null) __obj.updateDynamic("valueRange")(valueRange)
    __obj.asInstanceOf[Anon_InvalidStep]
  }
}

