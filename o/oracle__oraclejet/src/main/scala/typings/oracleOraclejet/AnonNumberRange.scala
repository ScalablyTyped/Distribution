package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNumberRange extends js.Object {
  var numberRange: js.UndefOr[AnonHintMessageDetailMessageSummary] = js.undefined
  var required: js.UndefOr[AnonHint] = js.undefined
  var tooltipDecrement: js.UndefOr[String] = js.undefined
  var tooltipIncrement: js.UndefOr[String] = js.undefined
}

object AnonNumberRange {
  @scala.inline
  def apply(
    numberRange: AnonHintMessageDetailMessageSummary = null,
    required: AnonHint = null,
    tooltipDecrement: String = null,
    tooltipIncrement: String = null
  ): AnonNumberRange = {
    val __obj = js.Dynamic.literal()
    if (numberRange != null) __obj.updateDynamic("numberRange")(numberRange.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (tooltipDecrement != null) __obj.updateDynamic("tooltipDecrement")(tooltipDecrement.asInstanceOf[js.Any])
    if (tooltipIncrement != null) __obj.updateDynamic("tooltipIncrement")(tooltipIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonNumberRange]
  }
}

