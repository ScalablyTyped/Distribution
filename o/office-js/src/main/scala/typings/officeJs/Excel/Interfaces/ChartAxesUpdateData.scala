package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface for updating data on the ChartAxes object, for use in `chartAxes.set({ ... })`. */
trait ChartAxesUpdateData extends js.Object {
  /**
    *
    * Represents the category axis in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var categoryAxis: js.UndefOr[ChartAxisUpdateData] = js.undefined
  /**
    *
    * Represents the series axis of a 3-dimensional chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var seriesAxis: js.UndefOr[ChartAxisUpdateData] = js.undefined
  /**
    *
    * Represents the value axis in an axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueAxis: js.UndefOr[ChartAxisUpdateData] = js.undefined
}

object ChartAxesUpdateData {
  @scala.inline
  def apply(
    categoryAxis: ChartAxisUpdateData = null,
    seriesAxis: ChartAxisUpdateData = null,
    valueAxis: ChartAxisUpdateData = null
  ): ChartAxesUpdateData = {
    val __obj = js.Dynamic.literal()
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis.asInstanceOf[js.Any])
    if (seriesAxis != null) __obj.updateDynamic("seriesAxis")(seriesAxis.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxesUpdateData]
  }
}

