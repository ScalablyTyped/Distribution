package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterMarkerLine extends js.Object {
  var autocolorscale: Boolean
  var cauto: Boolean
  var cmax: Double
  var cmin: Double
  var color: Color
  var colorscale: ColorScale
  var reversescale: Boolean
  var width: Double | js.Array[Double]
}

object ScatterMarkerLine {
  @scala.inline
  def apply(
    autocolorscale: Boolean,
    cauto: Boolean,
    cmax: Double,
    cmin: Double,
    color: Color,
    colorscale: ColorScale,
    reversescale: Boolean,
    width: Double | js.Array[Double]
  ): ScatterMarkerLine = {
    val __obj = js.Dynamic.literal(autocolorscale = autocolorscale, cauto = cauto, cmax = cmax, cmin = cmin, color = color.asInstanceOf[js.Any], colorscale = colorscale.asInstanceOf[js.Any], reversescale = reversescale, width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScatterMarkerLine]
  }
}

