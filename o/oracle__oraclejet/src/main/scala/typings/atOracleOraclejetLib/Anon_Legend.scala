package typings
package atOracleOraclejetLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Legend extends js.Object {
  var legend: Anon_DataTypesDragEnter
  var plotArea: Anon_DataTypesDragEnter
  var xAxis: Anon_DataTypesDragEnter
  var y2Axis: Anon_DataTypesDragEnter
  var yAxis: Anon_DataTypesDragEnter
}

object Anon_Legend {
  @scala.inline
  def apply(
    legend: Anon_DataTypesDragEnter,
    plotArea: Anon_DataTypesDragEnter,
    xAxis: Anon_DataTypesDragEnter,
    y2Axis: Anon_DataTypesDragEnter,
    yAxis: Anon_DataTypesDragEnter
  ): Anon_Legend = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("legend")(legend)
    __obj.updateDynamic("plotArea")(plotArea)
    __obj.updateDynamic("xAxis")(xAxis)
    __obj.updateDynamic("y2Axis")(y2Axis)
    __obj.updateDynamic("yAxis")(yAxis)
    __obj.asInstanceOf[Anon_Legend]
  }
}

