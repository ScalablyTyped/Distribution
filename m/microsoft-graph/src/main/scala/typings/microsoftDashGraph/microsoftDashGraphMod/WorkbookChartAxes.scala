package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartAxes extends Entity {
  // Represents the category axis in a chart. Read-only.
  var categoryAxis: js.UndefOr[WorkbookChartAxis] = js.undefined
  // Represents the series axis of a 3-dimensional chart. Read-only.
  var seriesAxis: js.UndefOr[WorkbookChartAxis] = js.undefined
  // Represents the value axis in an axis. Read-only.
  var valueAxis: js.UndefOr[WorkbookChartAxis] = js.undefined
}

object WorkbookChartAxes {
  @scala.inline
  def apply(
    categoryAxis: WorkbookChartAxis = null,
    id: String = null,
    seriesAxis: WorkbookChartAxis = null,
    valueAxis: WorkbookChartAxis = null
  ): WorkbookChartAxes = {
    val __obj = js.Dynamic.literal()
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (seriesAxis != null) __obj.updateDynamic("seriesAxis")(seriesAxis.asInstanceOf[js.Any])
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookChartAxes]
  }
}

