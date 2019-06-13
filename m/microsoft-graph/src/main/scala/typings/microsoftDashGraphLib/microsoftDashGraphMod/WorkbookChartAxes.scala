package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartAxes extends Entity {
  /** Represents the category axis in a chart. Read-only. */
  var categoryAxis: js.UndefOr[WorkbookChartAxis] = js.undefined
  /** Represents the series axis of a 3-dimensional chart. Read-only. */
  var seriesAxis: js.UndefOr[WorkbookChartAxis] = js.undefined
  /** Represents the value axis in an axis. Read-only. */
  var valueAxis: js.UndefOr[WorkbookChartAxis] = js.undefined
}

object WorkbookChartAxes {
  @scala.inline
  def apply(
    categoryAxis: WorkbookChartAxis = null,
    id: java.lang.String = null,
    seriesAxis: WorkbookChartAxis = null,
    valueAxis: WorkbookChartAxis = null
  ): WorkbookChartAxes = {
    val __obj = js.Dynamic.literal()
    if (categoryAxis != null) __obj.updateDynamic("categoryAxis")(categoryAxis)
    if (id != null) __obj.updateDynamic("id")(id)
    if (seriesAxis != null) __obj.updateDynamic("seriesAxis")(seriesAxis)
    if (valueAxis != null) __obj.updateDynamic("valueAxis")(valueAxis)
    __obj.asInstanceOf[WorkbookChartAxes]
  }
}

