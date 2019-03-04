package typings
package plotlyDotJsLib.plotlyDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlotScatterDataPoint extends js.Object {
  var curveNumber: scala.Double
  var data: PlotData
  var pointIndex: scala.Double
  var pointNumber: scala.Double
  var x: scala.Double
  var xaxis: LayoutAxis
  var y: scala.Double
  var yaxis: LayoutAxis
}

object PlotScatterDataPoint {
  @scala.inline
  def apply(
    curveNumber: scala.Double,
    data: PlotData,
    pointIndex: scala.Double,
    pointNumber: scala.Double,
    x: scala.Double,
    xaxis: LayoutAxis,
    y: scala.Double,
    yaxis: LayoutAxis
  ): PlotScatterDataPoint = {
    val __obj = js.Dynamic.literal(curveNumber = curveNumber, data = data, pointIndex = pointIndex, pointNumber = pointNumber, x = x, xaxis = xaxis, y = y, yaxis = yaxis)
  
    __obj.asInstanceOf[PlotScatterDataPoint]
  }
}

