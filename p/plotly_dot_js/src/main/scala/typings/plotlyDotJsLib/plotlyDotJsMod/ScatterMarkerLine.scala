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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autocolorscale")(autocolorscale)
    __obj.updateDynamic("cauto")(cauto)
    __obj.updateDynamic("cmax")(cmax)
    __obj.updateDynamic("cmin")(cmin)
    __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    __obj.updateDynamic("colorscale")(colorscale.asInstanceOf[js.Any])
    __obj.updateDynamic("reversescale")(reversescale)
    __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScatterMarkerLine]
  }
}

