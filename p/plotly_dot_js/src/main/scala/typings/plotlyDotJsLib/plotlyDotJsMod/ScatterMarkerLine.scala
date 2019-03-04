package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterMarkerLine extends js.Object {
  var autocolorscale: scala.Boolean
  var cauto: scala.Boolean
  var cmax: scala.Double
  var cmin: scala.Double
  var color: Color
  var colorscale: java.lang.String | js.Array[java.lang.String]
  var reversescale: scala.Boolean
  var width: scala.Double | js.Array[scala.Double]
}

object ScatterMarkerLine {
  @scala.inline
  def apply(
    autocolorscale: scala.Boolean,
    cauto: scala.Boolean,
    cmax: scala.Double,
    cmin: scala.Double,
    color: Color,
    colorscale: java.lang.String | js.Array[java.lang.String],
    reversescale: scala.Boolean,
    width: scala.Double | js.Array[scala.Double]
  ): ScatterMarkerLine = {
    val __obj = js.Dynamic.literal(autocolorscale = autocolorscale, cauto = cauto, cmax = cmax, cmin = cmin, color = color.asInstanceOf[js.Any], colorscale = colorscale.asInstanceOf[js.Any], reversescale = reversescale, width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScatterMarkerLine]
  }
}

