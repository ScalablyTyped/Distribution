package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChartSeries extends Entity {
  // Represents the formatting of a chart series, which includes fill and line formatting. Read-only.
  var format: js.UndefOr[WorkbookChartSeriesFormat] = js.undefined
  // Represents the name of a series in a chart.
  var name: js.UndefOr[String] = js.undefined
  // Represents a collection of all points in the series. Read-only.
  var points: js.UndefOr[js.Array[WorkbookChartPoint]] = js.undefined
}

object WorkbookChartSeries {
  @scala.inline
  def apply(
    format: WorkbookChartSeriesFormat = null,
    id: String = null,
    name: String = null,
    points: js.Array[WorkbookChartPoint] = null
  ): WorkbookChartSeries = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (id != null) __obj.updateDynamic("id")(id)
    if (name != null) __obj.updateDynamic("name")(name)
    if (points != null) __obj.updateDynamic("points")(points)
    __obj.asInstanceOf[WorkbookChartSeries]
  }
}

