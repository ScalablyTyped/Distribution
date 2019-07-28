package typings.plotlyDotJs.plotlyDotJsMod

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
    x: Datum,
    xaxis: LayoutAxis,
    y: Datum,
    yaxis: LayoutAxis
  ): PlotDatum = {
    val __obj = js.Dynamic.literal(curveNumber = curveNumber, data = data, pointIndex = pointIndex, pointNumber = pointNumber, x = x.asInstanceOf[js.Any], xaxis = xaxis, y = y.asInstanceOf[js.Any], yaxis = yaxis)
  
    __obj.asInstanceOf[PlotDatum]
  }
}

