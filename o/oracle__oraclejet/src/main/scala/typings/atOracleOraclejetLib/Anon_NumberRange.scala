package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NumberRange extends js.Object {
  var numberRange: js.UndefOr[Anon_HintMessageDetailMessageSummary] = js.undefined
  var required: js.UndefOr[Anon_Hint] = js.undefined
  var tooltipDecrement: js.UndefOr[java.lang.String] = js.undefined
  var tooltipIncrement: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_NumberRange {
  @scala.inline
  def apply(
    numberRange: Anon_HintMessageDetailMessageSummary = null,
    required: Anon_Hint = null,
    tooltipDecrement: java.lang.String = null,
    tooltipIncrement: java.lang.String = null
  ): Anon_NumberRange = {
    val __obj = js.Dynamic.literal()
    if (numberRange != null) __obj.updateDynamic("numberRange")(numberRange)
    if (required != null) __obj.updateDynamic("required")(required)
    if (tooltipDecrement != null) __obj.updateDynamic("tooltipDecrement")(tooltipDecrement)
    if (tooltipIncrement != null) __obj.updateDynamic("tooltipIncrement")(tooltipIncrement)
    __obj.asInstanceOf[Anon_NumberRange]
  }
}

