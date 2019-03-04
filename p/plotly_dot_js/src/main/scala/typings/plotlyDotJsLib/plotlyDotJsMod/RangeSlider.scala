package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeSlider extends js.Object {
  var bgcolor: java.lang.String
  var bordercolor: java.lang.String
  var borderwidth: scala.Double
  var range: js.Tuple2[Datum, Datum]
  var thickness: scala.Double
  var visible: scala.Boolean
}

object RangeSlider {
  @scala.inline
  def apply(
    bgcolor: java.lang.String,
    bordercolor: java.lang.String,
    borderwidth: scala.Double,
    range: js.Tuple2[Datum, Datum],
    thickness: scala.Double,
    visible: scala.Boolean
  ): RangeSlider = {
    val __obj = js.Dynamic.literal(bgcolor = bgcolor, bordercolor = bordercolor, borderwidth = borderwidth, range = range, thickness = thickness, visible = visible)
  
    __obj.asInstanceOf[RangeSlider]
  }
}

