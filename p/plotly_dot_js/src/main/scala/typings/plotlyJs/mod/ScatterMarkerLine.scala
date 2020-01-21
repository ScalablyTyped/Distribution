package typings.plotlyJs.mod

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
    val __obj = js.Dynamic.literal(autocolorscale = autocolorscale.asInstanceOf[js.Any], cauto = cauto.asInstanceOf[js.Any], cmax = cmax.asInstanceOf[js.Any], cmin = cmin.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], colorscale = colorscale.asInstanceOf[js.Any], reversescale = reversescale.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScatterMarkerLine]
  }
}

