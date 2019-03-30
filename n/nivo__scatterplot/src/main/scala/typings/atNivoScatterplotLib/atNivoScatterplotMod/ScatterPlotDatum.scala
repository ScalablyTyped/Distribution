package typings
package atNivoScatterplotLib.atNivoScatterplotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScatterPlotDatum extends js.Object {
  var color: java.lang.String
  var id: java.lang.String | scala.Double
  var serie: java.lang.String
  var x: java.lang.String | scala.Double
  var y: java.lang.String | scala.Double
}

object ScatterPlotDatum {
  @scala.inline
  def apply(
    color: java.lang.String,
    id: java.lang.String | scala.Double,
    serie: java.lang.String,
    x: java.lang.String | scala.Double,
    y: java.lang.String | scala.Double
  ): ScatterPlotDatum = {
    val __obj = js.Dynamic.literal(color = color, id = id.asInstanceOf[js.Any], serie = serie, x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ScatterPlotDatum]
  }
}

