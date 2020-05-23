package typings.officeJsPreview.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chartAxes.toJSON()`. */
trait ChartAxesData extends js.Object {
  /**
    *
    * Represents the category axis in a chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var categoryAxis: js.UndefOr[ChartAxisData] = js.undefined
  /**
    *
    * Represents the series axis of a 3-dimensional chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var seriesAxis: js.UndefOr[ChartAxisData] = js.undefined
  /**
    *
    * Represents the value axis in an axis.
    *
    * [Api set: ExcelApi 1.1]
    */
  var valueAxis: js.UndefOr[ChartAxisData] = js.undefined
}

object ChartAxesData {
  @scala.inline
  def apply(
    categoryAxis: ChartAxisData = null,
    seriesAxis: ChartAxisData = null,
    valueAxis: ChartAxisData = null
  ): ChartAxesData = {
    val __obj = js.Dynamic.literal()
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis.asInstanceOf[js.Any])
    if (seriesAxis != null) __obj.updateDynamic("seriesAxis")(seriesAxis.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartAxesData]
  }
}

