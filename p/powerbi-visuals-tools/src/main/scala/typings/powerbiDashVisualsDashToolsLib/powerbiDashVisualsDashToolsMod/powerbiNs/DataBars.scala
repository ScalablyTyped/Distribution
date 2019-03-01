package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataBars extends _StructuralObjectValue {
  var axisColor: Fill
  var hideText: scala.Boolean
  var maxValue: js.UndefOr[scala.Double] = js.undefined
  var minValue: js.UndefOr[scala.Double] = js.undefined
  var negativeColor: Fill
  var positiveColor: Fill
  var reverseDirection: scala.Boolean
}

object DataBars {
  @scala.inline
  def apply(
    axisColor: Fill,
    hideText: scala.Boolean,
    negativeColor: Fill,
    positiveColor: Fill,
    reverseDirection: scala.Boolean,
    maxValue: scala.Int | scala.Double = null,
    minValue: scala.Int | scala.Double = null
  ): DataBars = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("axisColor")(axisColor)
    __obj.updateDynamic("hideText")(hideText)
    __obj.updateDynamic("negativeColor")(negativeColor)
    __obj.updateDynamic("positiveColor")(positiveColor)
    __obj.updateDynamic("reverseDirection")(reverseDirection)
    if (maxValue != null) __obj.updateDynamic("maxValue")(maxValue.asInstanceOf[js.Any])
    if (minValue != null) __obj.updateDynamic("minValue")(minValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataBars]
  }
}

