package typings.plotlyJs.mod

import typings.plotlyJs.AnonLine
import typings.plotlyJs.AnonRange
import typings.plotlyJs.AnonThickness
import typings.plotlyJs.PartialAxis
import typings.plotlyJs.plotlyJsStrings.angular
import typings.plotlyJs.plotlyJsStrings.bullet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gauge extends js.Object {
  var axis: PartialAxis
  var bar: AnonLine
  var bgcolor: Color
  var bordercolor: Color
  var borderwidth: Double
  var shape: angular | bullet
  var steps: js.Array[AnonRange]
  var threshold: AnonThickness
}

object Gauge {
  @scala.inline
  def apply(
    axis: PartialAxis,
    bar: AnonLine,
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Double,
    shape: angular | bullet,
    steps: js.Array[AnonRange],
    threshold: AnonThickness
  ): Gauge = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], bar = bar.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Gauge]
  }
}

