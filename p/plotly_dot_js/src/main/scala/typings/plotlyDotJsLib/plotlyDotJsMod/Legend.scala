package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Legend extends Label {
  var borderwidth: scala.Double
  var orientation: plotlyDotJsLib.plotlyDotJsLibStrings.v | plotlyDotJsLib.plotlyDotJsLibStrings.h
  var tracegroupgap: scala.Double
  var traceorder: plotlyDotJsLib.plotlyDotJsLibStrings.grouped | plotlyDotJsLib.plotlyDotJsLibStrings.normal | plotlyDotJsLib.plotlyDotJsLibStrings.reversed
  var x: scala.Double
  var xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right
  var y: scala.Double
  var yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
}

object Legend {
  @scala.inline
  def apply(
    bgcolor: java.lang.String,
    bordercolor: java.lang.String,
    borderwidth: scala.Double,
    font: stdLib.Partial[Font],
    orientation: plotlyDotJsLib.plotlyDotJsLibStrings.v | plotlyDotJsLib.plotlyDotJsLibStrings.h,
    tracegroupgap: scala.Double,
    traceorder: plotlyDotJsLib.plotlyDotJsLibStrings.grouped | plotlyDotJsLib.plotlyDotJsLibStrings.normal | plotlyDotJsLib.plotlyDotJsLibStrings.reversed,
    x: scala.Double,
    xanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.left | plotlyDotJsLib.plotlyDotJsLibStrings.center | plotlyDotJsLib.plotlyDotJsLibStrings.right,
    y: scala.Double,
    yanchor: plotlyDotJsLib.plotlyDotJsLibStrings.auto | plotlyDotJsLib.plotlyDotJsLibStrings.top | plotlyDotJsLib.plotlyDotJsLibStrings.middle | plotlyDotJsLib.plotlyDotJsLibStrings.bottom
  ): Legend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bgcolor")(bgcolor)
    __obj.updateDynamic("bordercolor")(bordercolor)
    __obj.updateDynamic("borderwidth")(borderwidth)
    __obj.updateDynamic("font")(font)
    __obj.updateDynamic("orientation")(orientation.asInstanceOf[js.Any])
    __obj.updateDynamic("tracegroupgap")(tracegroupgap)
    __obj.updateDynamic("traceorder")(traceorder.asInstanceOf[js.Any])
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("xanchor")(xanchor.asInstanceOf[js.Any])
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("yanchor")(yanchor.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
}

