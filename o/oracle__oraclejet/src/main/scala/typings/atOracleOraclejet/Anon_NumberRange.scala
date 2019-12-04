package typings.atOracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NumberRange extends js.Object {
  var numberRange: js.UndefOr[Anon_HintMessageDetailMessageSummary] = js.undefined
  var required: js.UndefOr[Anon_Hint] = js.undefined
  var tooltipDecrement: js.UndefOr[String] = js.undefined
  var tooltipIncrement: js.UndefOr[String] = js.undefined
}

object Anon_NumberRange {
  @scala.inline
  def apply(
    numberRange: Anon_HintMessageDetailMessageSummary = null,
    required: Anon_Hint = null,
    tooltipDecrement: String = null,
    tooltipIncrement: String = null
  ): Anon_NumberRange = {
    val __obj = js.Dynamic.literal()
    if (numberRange != null) __obj.updateDynamic("numberRange")(numberRange.asInstanceOf[js.Any])
    if (required != null) __obj.updateDynamic("required")(required.asInstanceOf[js.Any])
    if (tooltipDecrement != null) __obj.updateDynamic("tooltipDecrement")(tooltipDecrement.asInstanceOf[js.Any])
    if (tooltipIncrement != null) __obj.updateDynamic("tooltipIncrement")(tooltipIncrement.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NumberRange]
  }
}

