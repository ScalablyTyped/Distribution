package typings.plotlyJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotDatum extends js.Object {
  var curveNumber: Double
  var data: PlotData
  var pointIndex: Double
  var pointNumber: Double
  var x: Datum
  var xaxis: LayoutAxis
  var y: Datum
  var yaxis: LayoutAxis
}

object PlotDatum {
  @scala.inline
  def apply(
    curveNumber: Double,
    data: PlotData,
    pointIndex: Double,
    pointNumber: Double,
    xaxis: LayoutAxis,
    yaxis: LayoutAxis,
    x: Datum = null,
    y: Datum = null
  ): PlotDatum = {
    val __obj = js.Dynamic.literal(curveNumber = curveNumber.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], pointIndex = pointIndex.asInstanceOf[js.Any], pointNumber = pointNumber.asInstanceOf[js.Any], xaxis = xaxis.asInstanceOf[js.Any], yaxis = yaxis.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlotDatum]
  }
}

