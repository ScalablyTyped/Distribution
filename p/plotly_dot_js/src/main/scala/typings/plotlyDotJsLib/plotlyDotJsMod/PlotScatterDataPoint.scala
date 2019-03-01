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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("curveNumber")(curveNumber)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("pointIndex")(pointIndex)
    __obj.updateDynamic("pointNumber")(pointNumber)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("xaxis")(xaxis)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("yaxis")(yaxis)
    __obj.asInstanceOf[PlotScatterDataPoint]
  }
}

