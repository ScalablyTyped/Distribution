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
    val __obj = js.Dynamic.literal(count = count, label = label, step = step.asInstanceOf[js.Any], stepmode = stepmode.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeSelectorButton]
  }
}

