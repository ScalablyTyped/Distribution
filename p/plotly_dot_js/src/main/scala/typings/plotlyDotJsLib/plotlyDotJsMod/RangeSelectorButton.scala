package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelectorButton extends js.Object {
  var count: scala.Double
  var label: java.lang.String
  var step: plotlyDotJsLib.plotlyDotJsLibStrings.second | plotlyDotJsLib.plotlyDotJsLibStrings.minute | plotlyDotJsLib.plotlyDotJsLibStrings.hour | plotlyDotJsLib.plotlyDotJsLibStrings.day | plotlyDotJsLib.plotlyDotJsLibStrings.month | plotlyDotJsLib.plotlyDotJsLibStrings.year | plotlyDotJsLib.plotlyDotJsLibStrings.all
  var stepmode: plotlyDotJsLib.plotlyDotJsLibStrings.backward | plotlyDotJsLib.plotlyDotJsLibStrings.todate
}

object RangeSelectorButton {
  @scala.inline
  def apply(
    count: scala.Double,
    label: java.lang.String,
    step: plotlyDotJsLib.plotlyDotJsLibStrings.second | plotlyDotJsLib.plotlyDotJsLibStrings.minute | plotlyDotJsLib.plotlyDotJsLibStrings.hour | plotlyDotJsLib.plotlyDotJsLibStrings.day | plotlyDotJsLib.plotlyDotJsLibStrings.month | plotlyDotJsLib.plotlyDotJsLibStrings.year | plotlyDotJsLib.plotlyDotJsLibStrings.all,
    stepmode: plotlyDotJsLib.plotlyDotJsLibStrings.backward | plotlyDotJsLib.plotlyDotJsLibStrings.todate
  ): RangeSelectorButton = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("label")(label)
    __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    __obj.updateDynamic("stepmode")(stepmode.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelectorButton]
  }
}

