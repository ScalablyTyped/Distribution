package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.Anon_ColorLine
import typings.plotlyDotJs.Anon_ColorRange
import typings.plotlyDotJs.Anon_Line
import typings.plotlyDotJs.plotlyDotJsStrings.angular
import typings.plotlyDotJs.plotlyDotJsStrings.bullet
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gauge extends js.Object {
  var axis: Partial[Axis]
  var bar: Anon_ColorLine
  var bgcolor: Color
  var bordercolor: Color
  var borderwidth: Double
  var shape: angular | bullet
  var steps: js.Array[Anon_ColorRange]
  var threshold: Anon_Line
}

object Gauge {
  @scala.inline
  def apply(
    axis: Partial[Axis],
    bar: Anon_ColorLine,
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Double,
    shape: angular | bullet,
    steps: js.Array[Anon_ColorRange],
    threshold: Anon_Line
  ): Gauge = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], bar = bar.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Gauge]
  }
}

