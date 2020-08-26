package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.ChartDisplayBlanksAs
import typings.officeJs.Excel.ChartPlotBy
import typings.officeJs.officeJsStrings.Columns
import typings.officeJs.officeJsStrings.Interplotted
import typings.officeJs.officeJsStrings.NotPlotted
import typings.officeJs.officeJsStrings.Rows
import typings.officeJs.officeJsStrings.Zero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `chart.toJSON()`. */
@js.native
trait ChartData extends js.Object {
  /**
    *
    * Represents chart axes.
    *
    * [Api set: ExcelApi 1.1]
    */
  var axes: js.UndefOr[ChartAxesData] = js.native
  /**
    *
    * Specifies a ChartCategoryLabelLevel enumeration constant referring to
    the level of where the category labels are being sourced from.
    *
    * [Api set: ExcelApi 1.8]
    */
  var categoryLabelLevel: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies the type of the chart. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 84 */ js.Any
  ] = js.native
  /**
    *
    * Represents the datalabels on the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsData] = js.native
  /**
    *
    * Specifies the way that blank cells are plotted on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var displayBlanksAs: js.UndefOr[ChartDisplayBlanksAs | NotPlotted | Zero | Interplotted] = js.native
  /**
    *
    * Encapsulates the format properties for the chart area.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAreaFormatData] = js.native
  /**
    *
    * Specifies the height, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var height: js.UndefOr[Double] = js.native
  /**
    *
    * The unique id of chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var id: js.UndefOr[String] = js.native
  /**
    *
    * The distance, in points, from the left side of the chart to the worksheet origin.
    *
    * [Api set: ExcelApi 1.1]
    */
  var left: js.UndefOr[Double] = js.native
  /**
    *
    * Represents the legend for the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var legend: js.UndefOr[ChartLegendData] = js.native
  /**
    *
    * Specifies the name of a chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.native
  /**
    *
    * Encapsulates the options for a pivot chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pivotOptions: js.UndefOr[ChartPivotOptionsData] = js.native
  /**
    *
    * Represents the plotArea for the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotArea: js.UndefOr[ChartPlotAreaData] = js.native
  /**
    *
    * Specifies the way columns or rows are used as data series on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotBy: js.UndefOr[ChartPlotBy | Rows | Columns] = js.native
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
  var series: js.UndefOr[js.Array[ChartSeriesData]] = js.native
  /**
    *
    * Specifies a ChartSeriesNameLevel enumeration constant referring to
    the level of where the series names are being sourced from.
    *
    * [Api set: ExcelApi 1.8]
    */
  var seriesNameLevel: js.UndefOr[Double] = js.native
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
  var style: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies the title of the specified chart, including the text, visibility, position, and formatting of the title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartTitleData] = js.native
  /**
    *
    * Specifies the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
    *
    * [Api set: ExcelApi 1.1]
    */
  var top: js.UndefOr[Double] = js.native
  /**
    *
    * Specifies the width, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var width: js.UndefOr[Double] = js.native
}

object ChartData {
  @scala.inline
  def apply(): ChartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartData]
  }
  @scala.inline
  implicit class ChartDataOps[Self <: ChartData] (val x: Self) extends AnyVal {
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
    def setAxes(value: ChartAxesData): Self = this.set("axes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxes: Self = this.set("axes", js.undefined)
    @scala.inline
    def setCategoryLabelLevel(value: Double): Self = this.set("categoryLabelLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryLabelLevel: Self = this.set("categoryLabelLevel", js.undefined)
    @scala.inline
    def setChartType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 84 */ js.Any): Self = this.set("chartType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartType: Self = this.set("chartType", js.undefined)
    @scala.inline
    def setDataLabels(value: ChartDataLabelsData): Self = this.set("dataLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataLabels: Self = this.set("dataLabels", js.undefined)
    @scala.inline
    def setDisplayBlanksAs(value: ChartDisplayBlanksAs | NotPlotted | Zero | Interplotted): Self = this.set("displayBlanksAs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayBlanksAs: Self = this.set("displayBlanksAs", js.undefined)
    @scala.inline
    def setFormat(value: ChartAreaFormatData): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setLegend(value: ChartLegendData): Self = this.set("legend", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLegend: Self = this.set("legend", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPivotOptions(value: ChartPivotOptionsData): Self = this.set("pivotOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePivotOptions: Self = this.set("pivotOptions", js.undefined)
    @scala.inline
    def setPlotArea(value: ChartPlotAreaData): Self = this.set("plotArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotArea: Self = this.set("plotArea", js.undefined)
    @scala.inline
    def setPlotBy(value: ChartPlotBy | Rows | Columns): Self = this.set("plotBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotBy: Self = this.set("plotBy", js.undefined)
    @scala.inline
    def setPlotVisibleOnly(value: Boolean): Self = this.set("plotVisibleOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlotVisibleOnly: Self = this.set("plotVisibleOnly", js.undefined)
    @scala.inline
    def setSeriesVarargs(value: ChartSeriesData*): Self = this.set("series", js.Array(value :_*))
    @scala.inline
    def setSeries(value: js.Array[ChartSeriesData]): Self = this.set("series", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeries: Self = this.set("series", js.undefined)
    @scala.inline
    def setSeriesNameLevel(value: Double): Self = this.set("seriesNameLevel", value.asInstanceOf[js.Any])
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
    def setStyle(value: Double): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTitle(value: ChartTitleData): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTop: Self = this.set("top", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

