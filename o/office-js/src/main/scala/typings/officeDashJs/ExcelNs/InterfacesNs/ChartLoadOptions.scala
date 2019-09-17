package typings.officeDashJs.ExcelNs.InterfacesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents a chart object in a workbook.
  To learn more about the Chart object model, see {@link https://docs.microsoft.com/office/dev/add-ins/excel/excel-add-ins-charts | Work with charts using the Excel JavaScript API}.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents chart axes.
    *
    * [Api set: ExcelApi 1.1]
    */
  var axes: js.UndefOr[ChartAxesLoadOptions] = js.undefined
  /**
    *
    * Returns or sets a ChartCategoryLabelLevel enumeration constant referring to
    the level of where the category labels are being sourced from. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var categoryLabelLevel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the type of the chart. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the datalabels on the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsLoadOptions] = js.undefined
  /**
    *
    * Returns or sets the way that blank cells are plotted on a chart. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var displayBlanksAs: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Encapsulates the format properties for the chart area.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAreaFormatLoadOptions] = js.undefined
  /**
    *
    * Represents the height, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The unique id of chart. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The distance, in points, from the left side of the chart to the worksheet origin.
    *
    * [Api set: ExcelApi 1.1]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the legend for the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var legend: js.UndefOr[ChartLegendLoadOptions] = js.undefined
  /**
    *
    * Represents the name of a chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Encapsulates the options for a pivot chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pivotOptions: js.UndefOr[ChartPivotOptionsLoadOptions] = js.undefined
  /**
    *
    * Represents the plotArea for the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotArea: js.UndefOr[ChartPlotAreaLoadOptions] = js.undefined
  /**
    *
    * Returns or sets the way columns or rows are used as data series on the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotBy: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * True if only visible cells are plotted. False if both visible and hidden cells are plotted. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotVisibleOnly: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents either a single series or collection of series in the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var series: js.UndefOr[ChartSeriesCollectionLoadOptions] = js.undefined
  /**
    *
    * Returns or sets a ChartSeriesNameLevel enumeration constant referring to
    the level of where the series names are being sourced from. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var seriesNameLevel: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents whether to display all field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showAllFieldButtons: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents whether to show the data labels when the value is greater than the maximum value on the value axis.
    If value axis became smaller than the size of data points, you can use this property to set whether to show the data labels.
    This property applies to 2-D charts only.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showDataLabelsOverMaximum: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Returns or sets the chart style for the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the title of the specified chart, including the text, visibility, position, and formatting of the title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartTitleLoadOptions] = js.undefined
  /**
    *
    * Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
    *
    * [Api set: ExcelApi 1.1]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Represents the width, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var width: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * The worksheet containing the current chart.
    *
    * [Api set: ExcelApi 1.2]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}

object ChartLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    axes: ChartAxesLoadOptions = null,
    categoryLabelLevel: js.UndefOr[Boolean] = js.undefined,
    chartType: js.UndefOr[Boolean] = js.undefined,
    dataLabels: ChartDataLabelsLoadOptions = null,
    displayBlanksAs: js.UndefOr[Boolean] = js.undefined,
    format: ChartAreaFormatLoadOptions = null,
    height: js.UndefOr[Boolean] = js.undefined,
    id: js.UndefOr[Boolean] = js.undefined,
    left: js.UndefOr[Boolean] = js.undefined,
    legend: ChartLegendLoadOptions = null,
    name: js.UndefOr[Boolean] = js.undefined,
    pivotOptions: ChartPivotOptionsLoadOptions = null,
    plotArea: ChartPlotAreaLoadOptions = null,
    plotBy: js.UndefOr[Boolean] = js.undefined,
    plotVisibleOnly: js.UndefOr[Boolean] = js.undefined,
    series: ChartSeriesCollectionLoadOptions = null,
    seriesNameLevel: js.UndefOr[Boolean] = js.undefined,
    showAllFieldButtons: js.UndefOr[Boolean] = js.undefined,
    showDataLabelsOverMaximum: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[Boolean] = js.undefined,
    title: ChartTitleLoadOptions = null,
    top: js.UndefOr[Boolean] = js.undefined,
    width: js.UndefOr[Boolean] = js.undefined,
    worksheet: WorksheetLoadOptions = null
  ): ChartLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all)
    if (axes != null) __obj.updateDynamic("axes")(axes)
    if (!js.isUndefined(categoryLabelLevel)) __obj.updateDynamic("categoryLabelLevel")(categoryLabelLevel)
    if (!js.isUndefined(chartType)) __obj.updateDynamic("chartType")(chartType)
    if (dataLabels != null) __obj.updateDynamic("dataLabels")(dataLabels)
    if (!js.isUndefined(displayBlanksAs)) __obj.updateDynamic("displayBlanksAs")(displayBlanksAs)
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height)
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(left)) __obj.updateDynamic("left")(left)
    if (legend != null) __obj.updateDynamic("legend")(legend)
    if (!js.isUndefined(name)) __obj.updateDynamic("name")(name)
    if (pivotOptions != null) __obj.updateDynamic("pivotOptions")(pivotOptions)
    if (plotArea != null) __obj.updateDynamic("plotArea")(plotArea)
    if (!js.isUndefined(plotBy)) __obj.updateDynamic("plotBy")(plotBy)
    if (!js.isUndefined(plotVisibleOnly)) __obj.updateDynamic("plotVisibleOnly")(plotVisibleOnly)
    if (series != null) __obj.updateDynamic("series")(series)
    if (!js.isUndefined(seriesNameLevel)) __obj.updateDynamic("seriesNameLevel")(seriesNameLevel)
    if (!js.isUndefined(showAllFieldButtons)) __obj.updateDynamic("showAllFieldButtons")(showAllFieldButtons)
    if (!js.isUndefined(showDataLabelsOverMaximum)) __obj.updateDynamic("showDataLabelsOverMaximum")(showDataLabelsOverMaximum)
    if (!js.isUndefined(style)) __obj.updateDynamic("style")(style)
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(top)) __obj.updateDynamic("top")(top)
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width)
    if (worksheet != null) __obj.updateDynamic("worksheet")(worksheet)
    __obj.asInstanceOf[ChartLoadOptions]
  }
}

