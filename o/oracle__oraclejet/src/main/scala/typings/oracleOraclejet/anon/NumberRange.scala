package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberRange extends js.Object {
  var numberRange: js.UndefOr[HintMessageDetail] = js.undefined
  var required: js.UndefOr[Hint] = js.undefined
  var tooltipDecrement: js.UndefOr[String] = js.undefined
  var tooltipIncrement: js.UndefOr[String] = js.undefined
}

object NumberRange {
  @scala.inline
  def apply(
    numberRange: HintMessageDetail = null,
    required: Hint = null,
    tooltipDecrement: String = null,
    tooltipIncrement: String = null
  ): NumberRange = {
    val __obj = js.Dynamic.literal()
    if (numberRange != null) __obj.updateDynamic("numberRange")(numberRange.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (tooltipDecrement != null) __obj.updateDynamic("tooltipDecrement")(tooltipDecrement.asInstanceOf[js.Any])
    if (tooltipIncrement != null) __obj.updateDynamic("tooltipIncrement")(tooltipIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberRange]
  }
}

