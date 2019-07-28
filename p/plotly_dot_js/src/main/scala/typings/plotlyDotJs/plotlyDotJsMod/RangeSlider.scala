package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSlider extends js.Object {
  var bgcolor: String
  var bordercolor: String
  var borderwidth: Double
  var range: js.Tuple2[Datum, Datum]
  var thickness: Double
  var visible: Boolean
}

object RangeSlider {
  @scala.inline
  def apply(
    bgcolor: String,
    bordercolor: String,
    borderwidth: Double,
    range: js.Tuple2[Datum, Datum],
    thickness: Double,
    visible: Boolean
  ): RangeSlider = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor, bordercolor = bordercolor, borderwidth = borderwidth, range = range, thickness = thickness, visible = visible)
  
    __obj.asInstanceOf[RangeSlider]
  }
}

