package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterLine extends js.Object {
  var color: Color
  var dash: Dash
  var shape: plotlyDotJsLib.plotlyDotJsLibStrings.linear | plotlyDotJsLib.plotlyDotJsLibStrings.spline | plotlyDotJsLib.plotlyDotJsLibStrings.hv | plotlyDotJsLib.plotlyDotJsLibStrings.vh | plotlyDotJsLib.plotlyDotJsLibStrings.hvh | plotlyDotJsLib.plotlyDotJsLibStrings.vhv
  var simplify: scala.Boolean
  var smoothing: scala.Double
  var width: scala.Double
}

object ScatterLine {
  @scala.inline
  def apply(
    color: Color,
    dash: Dash,
    shape: plotlyDotJsLib.plotlyDotJsLibStrings.linear | plotlyDotJsLib.plotlyDotJsLibStrings.spline | plotlyDotJsLib.plotlyDotJsLibStrings.hv | plotlyDotJsLib.plotlyDotJsLibStrings.vh | plotlyDotJsLib.plotlyDotJsLibStrings.hvh | plotlyDotJsLib.plotlyDotJsLibStrings.vhv,
    simplify: scala.Boolean,
    smoothing: scala.Double,
    width: scala.Double
  ): ScatterLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.updateDynamic("dash")(dash)
    __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    __obj.updateDynamic("simplify")(simplify)
    __obj.updateDynamic("smoothing")(smoothing)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[ScatterLine]
  }
}

