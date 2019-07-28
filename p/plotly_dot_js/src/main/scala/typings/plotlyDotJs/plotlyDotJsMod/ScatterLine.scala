package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsStrings.hv
import typings.plotlyDotJs.plotlyDotJsStrings.hvh
import typings.plotlyDotJs.plotlyDotJsStrings.linear
import typings.plotlyDotJs.plotlyDotJsStrings.spline
import typings.plotlyDotJs.plotlyDotJsStrings.vh
import typings.plotlyDotJs.plotlyDotJsStrings.vhv
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterLine extends js.Object {
  var color: Color
  var dash: Dash
  var shape: linear | spline | hv | vh | hvh | vhv
  var simplify: Boolean
  var smoothing: Double
  var width: Double
}

object ScatterLine {
  @scala.inline
  def apply(
    color: Color,
    dash: Dash,
    shape: linear | spline | hv | vh | hvh | vhv,
    simplify: Boolean,
    smoothing: Double,
    width: Double
  ): ScatterLine = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], dash = dash, shape = shape.asInstanceOf[js.Any], simplify = simplify, smoothing = smoothing, width = width)
  
    __obj.asInstanceOf[ScatterLine]
  }
}

