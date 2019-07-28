package typings.plotlyDotJs.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotScatterDataPoint extends js.Object {
  var curveNumber: Double
  var data: PlotData
  var pointIndex: Double
  var pointNumber: Double
  var x: Double
  var xaxis: LayoutAxis
  var y: Double
  var yaxis: LayoutAxis
}

object PlotScatterDataPoint {
  @scala.inline
  def apply(
    curveNumber: Double,
    data: PlotData,
    pointIndex: Double,
    pointNumber: Double,
    x: Double,
    xaxis: LayoutAxis,
    y: Double,
    yaxis: LayoutAxis
  ): PlotScatterDataPoint = {
    val __obj = js.Dynamic.literal(curveNumber = curveNumber, data = data, pointIndex = pointIndex, pointNumber = pointNumber, x = x, xaxis = xaxis, y = y, yaxis = yaxis)
  
    __obj.asInstanceOf[PlotScatterDataPoint]
  }
}

