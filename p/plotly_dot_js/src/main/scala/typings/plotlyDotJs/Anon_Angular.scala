package typings.plotlyDotJs

import typings.plotlyDotJs.plotlyDotJsMod.Color
import typings.plotlyDotJs.plotlyDotJsStrings.angular
import typings.plotlyDotJs.plotlyDotJsStrings.bullet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Angular extends js.Object {
  var axis: Anon_Range
  var bar: Anon_ColorLine
  var bgcolor: Color
  var bordercolor: Color
  var borderwidth: Double
  var shape: angular | bullet
  var threshold: Anon_Line
}

object Anon_Angular {
  @scala.inline
  def apply(
    axis: Anon_Range,
    bar: Anon_ColorLine,
    bgcolor: Color,
    bordercolor: Color,
    borderwidth: Double,
    shape: angular | bullet,
    threshold: Anon_Line
  ): Anon_Angular = {
    val __obj = js.Dynamic.literal(axis = axis, bar = bar, bgcolor = bgcolor.asInstanceOf[js.Any], bordercolor = bordercolor.asInstanceOf[js.Any], borderwidth = borderwidth, shape = shape.asInstanceOf[js.Any], threshold = threshold)
  
    __obj.asInstanceOf[Anon_Angular]
  }
}

