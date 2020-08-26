package typings.officeJs.Excel.Interfaces

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
    * Specifies a ChartCategoryLabelLevel enumeration constant referring to
    the level of where the category labels are being sourced from.
    *
    * [Api set: ExcelApi 1.8]
    */
  var categoryLabelLevel: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the type of the chart. See Excel.ChartType for details.
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
    * Specifies the way that blank cells are plotted on a chart.
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
    * Specifies the height, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var height: js.UndefOr[Boolean] = js.native
  /**
    *
    * The unique id of chart.
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
    * Specifies the name of a chart object.
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
    * Specifies the way columns or rows are used as data series on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotBy: js.UndefOr[Boolean] = js.native
  /**
    *
    * True if only visible cells are plotted. False if both visible and hidden cells are plotted.
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
    * Specifies a ChartSeriesNameLevel enumeration constant referring to
    the level of where the series names are being sourced from.
    *
    * [Api set: ExcelApi 1.8]
    */
  var seriesNameLevel: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to display all field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showAllFieldButtons: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies whether to show the data labels when the value is greater than the maximum value on the value axis.
    If value axis became smaller than the size of data points, you can use this property to set whether to show the data labels.
    This property applies to 2-D charts only.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showDataLabelsOverMaximum: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the chart style for the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var style: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the title of the specified chart, including the text, visibility, position, and formatting of the title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartTitleLoadOptions] = js.native
  /**
    *
    * Specifies the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
    *
    * [Api set: ExcelApi 1.1]
    */
  var top: js.UndefOr[Boolean] = js.native
  /**
    *
    * Specifies the width, in points, of the chart object.
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

object ChartLoadOptions {
  @scala.inline
  def apply(): ChartLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartLoadOptions]
  }
  @scala.inline
  implicit class ChartLoadOptionsOps[Self <: ChartLoadOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def set$all(value: Boolean): Self = this.set("$all", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$all: Self = this.set("$all", js.undefined)
    @scala.inline
    def setAxes(value: ChartAxesLoadOptions): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setCategoryLabelLevel(value: Boolean): Self = this.set("categoryLabelLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryLabelLevel: Self = this.set("categoryLabelLevel", js.undefined)
    @scala.inline
    def setChartType(value: Boolean): Self = this.set("chartType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartType: Self = this.set("chartType", js.undefined)
    @scala.inline
    def setDataLabels(value: ChartDataLabelsLoadOptions): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    @scala.inline
    def setDisplayBlanksAs(value: Boolean): Self = this.set("displayBlanksAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayBlanksAs: Self = this.set("displayBlanksAs", js.undefined)
    @scala.inline
    def setFormat(value: ChartAreaFormatLoadOptions): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Boolean): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setId(value: Boolean): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLeft(value: Boolean): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLegend(value: ChartLegendLoadOptions): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setName(value: Boolean): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPivotOptions(value: ChartPivotOptionsLoadOptions): Self = this.set("pivotOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotOptions: Self = this.set("pivotOptions", js.undefined)
    @scala.inline
    def setPlotArea(value: ChartPlotAreaLoadOptions): Self = this.set("plotArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotArea: Self = this.set("plotArea", js.undefined)
    @scala.inline
    def setPlotBy(value: Boolean): Self = this.set("plotBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotBy: Self = this.set("plotBy", js.undefined)
    @scala.inline
    def setPlotVisibleOnly(value: Boolean): Self = this.set("plotVisibleOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotVisibleOnly: Self = this.set("plotVisibleOnly", js.undefined)
    @scala.inline
    def setSeries(value: ChartSeriesCollectionLoadOptions): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSeriesNameLevel(value: Boolean): Self = this.set("seriesNameLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeriesNameLevel: Self = this.set("seriesNameLevel", js.undefined)
    @scala.inline
    def setShowAllFieldButtons(value: Boolean): Self = this.set("showAllFieldButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowAllFieldButtons: Self = this.set("showAllFieldButtons", js.undefined)
    @scala.inline
    def setShowDataLabelsOverMaximum(value: Boolean): Self = this.set("showDataLabelsOverMaximum", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDataLabelsOverMaximum: Self = this.set("showDataLabelsOverMaximum", js.undefined)
    @scala.inline
    def setStyle(value: Boolean): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: ChartTitleLoadOptions): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTop(value: Boolean): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Boolean): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    @scala.inline
    def setWorksheet(value: WorksheetLoadOptions): Self = this.set("worksheet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorksheet: Self = this.set("worksheet", js.undefined)
  }
  
}

