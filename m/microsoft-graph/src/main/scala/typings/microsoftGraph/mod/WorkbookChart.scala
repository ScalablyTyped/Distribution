package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkbookChart extends Entity {
  // Represents chart axes. Read-only.
  var axes: js.UndefOr[WorkbookChartAxes] = js.undefined
  // Represents the datalabels on the chart. Read-only.
  var dataLabels: js.UndefOr[WorkbookChartDataLabels] = js.undefined
  // Encapsulates the format properties for the chart area. Read-only.
  var format: js.UndefOr[WorkbookChartAreaFormat] = js.undefined
  // Represents the height, in points, of the chart object.
  var height: js.UndefOr[Double] = js.undefined
  // The distance, in points, from the left side of the chart to the worksheet origin.
  var left: js.UndefOr[Double] = js.undefined
  // Represents the legend for the chart. Read-only.
  var legend: js.UndefOr[WorkbookChartLegend] = js.undefined
  // Represents the name of a chart object.
  var name: js.UndefOr[String] = js.undefined
  // Represents either a single series or collection of series in the chart. Read-only.
  var series: js.UndefOr[js.Array[WorkbookChartSeries]] = js.undefined
  /**
    * Represents the title of the specified chart, including the text, visibility, position and formating of the title.
    * Read-only.
    */
  var title: js.UndefOr[WorkbookChartTitle] = js.undefined
  /**
    * Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of
    * the chart area (on a chart).
    */
  var top: js.UndefOr[Double] = js.undefined
  // Represents the width, in points, of the chart object.
  var width: js.UndefOr[Double] = js.undefined
  // The worksheet containing the current chart. Read-only.
  var worksheet: js.UndefOr[WorkbookWorksheet] = js.undefined
}

object WorkbookChart {
  @scala.inline
  def apply(
    axes: WorkbookChartAxes = null,
    dataLabels: WorkbookChartDataLabels = null,
    format: WorkbookChartAreaFormat = null,
    height: js.UndefOr[Double] = js.undefined,
    id: String = null,
    left: js.UndefOr[Double] = js.undefined,
    legend: WorkbookChartLegend = null,
    name: String = null,
    series: js.Array[WorkbookChartSeries] = null,
    title: WorkbookChartTitle = null,
    top: js.UndefOr[Double] = js.undefined,
    width: js.UndefOr[Double] = js.undefined,
    worksheet: WorkbookWorksheet = null
  ): WorkbookChart = {
    val __obj = js.Dynamic.literal()
    if (axes != null) __obj.updateDynamic("axes")(axes.asInstanceOf[js.Any])
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left.get.asInstanceOf[js.Any])
    if (legend != null) __obj.updateDynamic("legend")(legend.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top.get.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkbookChart]
  }
}

