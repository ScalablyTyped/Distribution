package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSelector extends Label {
  var activecolor: java.lang.String
  var borderwidth: scala.Double
  var buttons: js.Array[stdLib.Partial[RangeSelectorButton]]
  var visible: scala.Boolean
  var x: scala.Double
  var xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right
  var y: scala.Double
  var yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
}

object RangeSelector {
  @scala.inline
  def apply(
    activecolor: java.lang.String,
    bgcolor: java.lang.String,
    bordercolor: java.lang.String,
    borderwidth: scala.Double,
    buttons: js.Array[stdLib.Partial[RangeSelectorButton]],
    font: stdLib.Partial[Font],
    visible: scala.Boolean,
    x: scala.Double,
    xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right,
    y: scala.Double,
    yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
  ): RangeSelector = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("activecolor")(activecolor)
    __obj.updateDynamic("bgcolor")(bgcolor)
    __obj.updateDynamic("bordercolor")(bordercolor)
    __obj.updateDynamic("borderwidth")(borderwidth)
    __obj.updateDynamic("buttons")(buttons)
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("visible")(visible)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeSelector]
  }
}

