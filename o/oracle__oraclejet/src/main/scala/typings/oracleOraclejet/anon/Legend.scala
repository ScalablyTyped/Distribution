package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Legend extends js.Object {
  var legend: DragEnter
  var plotArea: DragEnter
  var xAxis: DragEnter
  var y2Axis: DragEnter
  var yAxis: DragEnter
}

object Legend {
  @scala.inline
  def apply(legend: DragEnter, plotArea: DragEnter, xAxis: DragEnter, y2Axis: DragEnter, yAxis: DragEnter): Legend = {
    val __obj = js.Dynamic.literal(legend = legend.asInstanceOf[js.Any], plotArea = plotArea.asInstanceOf[js.Any], xAxis = xAxis.asInstanceOf[js.Any], y2Axis = y2Axis.asInstanceOf[js.Any], yAxis = yAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Legend]
  }
}

