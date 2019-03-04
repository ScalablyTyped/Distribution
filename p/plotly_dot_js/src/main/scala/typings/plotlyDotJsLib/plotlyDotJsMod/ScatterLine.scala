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
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], dash = dash, shape = shape.asInstanceOf[js.Any], simplify = simplify, smoothing = smoothing, width = width)
  
    __obj.asInstanceOf[ScatterLine]
  }
}

