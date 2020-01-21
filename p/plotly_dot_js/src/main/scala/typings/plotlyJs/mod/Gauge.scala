package typings.plotlyJs.mod

import typings.plotlyJs.AnonColorLine
import typings.plotlyJs.AnonColorRange
import typings.plotlyJs.AnonLine
import typings.plotlyJs.plotlyJsStrings.angular
import typings.plotlyJs.plotlyJsStrings.bullet
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gauge extends js.Object {
  var axis: Partial[Axis]
  var bar: AnonColorLine
  var bgcolor: Color
  var bordercolor: Color
  var borderwidth: Double
  var shape: angular | bullet
  var steps: js.Array[AnonColorRange]
  var threshold: AnonLine
}

object Gauge {
  @scala.inline
  def apply(
    axis: Partial[Axis],
    bar: AnonColorLine,
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Double,
    shape: angular | bullet,
    steps: js.Array[AnonColorRange],
    threshold: AnonLine
  ): Gauge = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], bar = bar.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Gauge]
  }
}

