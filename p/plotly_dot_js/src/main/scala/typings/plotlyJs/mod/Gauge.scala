package typings.plotlyJs.mod

import typings.plotlyJs.AnonColor
import typings.plotlyJs.PartialAxisCalendar
import typings.plotlyJs.PartialGaugeBar
import typings.plotlyJs.PartialThreshold
import typings.plotlyJs.plotlyJsStrings.angular
import typings.plotlyJs.plotlyJsStrings.bullet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gauge extends js.Object {
  var axis: PartialAxisCalendar
  var bar: PartialGaugeBar
  var bgcolor: Color
  var bordercolor: Color
  var borderwidth: Double
  var shape: angular | bullet
  var steps: js.Array[AnonColor]
  var threshold: PartialThreshold
}

object Gauge {
  @scala.inline
  def apply(
    axis: PartialAxisCalendar,
    bar: PartialGaugeBar,
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Double,
    shape: angular | bullet,
    steps: js.Array[AnonColor],
    threshold: PartialThreshold
  ): Gauge = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], bar = bar.asInstanceOf[js.Any], bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Gauge]
  }
}

