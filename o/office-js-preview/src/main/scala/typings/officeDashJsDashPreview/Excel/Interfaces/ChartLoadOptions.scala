package typings.officeDashJsDashPreview.Excel.Interfaces

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
@js.native
trait ChartLoadOptions extends js.Object {
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents chart axes.
    *
    * [Api set: ExcelApi 1.1]
    */
  var axes: js.UndefOr[ChartAxesLoadOptions] = js.native
  /**
    *
    * Returns or sets a ChartCategoryLabelLevel enumeration constant referring to
    the level of where the category labels are being sourced from. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var categoryLabelLevel: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the type of the chart. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the datalabels on the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsLoadOptions] = js.native
  /**
    *
    * Returns or sets the way that blank cells are plotted on a chart. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var displayBlanksAs: js.UndefOr[Boolean] = js.native
  /**
    *
    * Encapsulates the format properties for the chart area.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAreaFormatLoadOptions] = js.native
  /**
    *
    * Represents the height, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var height: js.UndefOr[Boolean] = js.native
  /**
    *
    * The unique id of chart. Read-only.
    *
    * [Api set: ExcelApi 1.7]
    */
  var id: js.UndefOr[Boolean] = js.native
  /**
    *
    * The distance, in points, from the left side of the chart to the worksheet origin.
    *
    * [Api set: ExcelApi 1.1]
    */
  var left: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the legend for the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var legend: js.UndefOr[ChartLegendLoadOptions] = js.native
  /**
    *
    * Represents the name of a chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.native
  /**
    *
    * Encapsulates the options for a pivot chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pivotOptions: js.UndefOr[ChartPivotOptionsLoadOptions] = js.native
  /**
    *
    * Represents the plotArea for the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotArea: js.UndefOr[ChartPlotAreaLoadOptions] = js.native
  /**
    *
    * Returns or sets the way columns or rows are used as data series on the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotBy: js.UndefOr[Boolean] = js.native
  /**
    *
    * True if only visible cells are plotted. False if both visible and hidden cells are plotted. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotVisibleOnly: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents either a single series or collection of series in the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var series: js.UndefOr[ChartSeriesCollectionLoadOptions] = js.native
  /**
    *
    * Returns or sets a ChartSeriesNameLevel enumeration constant referring to
    the level of where the series names are being sourced from. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var seriesNameLevel: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents whether to display all field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showAllFieldButtons: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents whether to show the data labels when the value is greater than the maximum value on the value axis.
    If value axis became smaller than the size of data points, you can use this property to set whether to show the data labels.
    This property applies to 2-D charts only.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showDataLabelsOverMaximum: js.UndefOr[Boolean] = js.native
  /**
    *
    * Returns or sets the chart style for the chart. Read/Write.
    *
    * [Api set: ExcelApi 1.8]
    */
  var style: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the title of the specified chart, including the text, visibility, position, and formatting of the title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartTitleLoadOptions] = js.native
  /**
    *
    * Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
    *
    * [Api set: ExcelApi 1.1]
    */
  var top: js.UndefOr[Boolean] = js.native
  /**
    *
    * Represents the width, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var width: js.UndefOr[Boolean] = js.native
  /**
    *
    * The worksheet containing the current chart.
    *
    * [Api set: ExcelApi 1.2]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.native
}

