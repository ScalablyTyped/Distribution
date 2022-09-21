package typings.officeJsPreview.Excel.Interfaces

import typings.officeJsPreview.Excel.ChartDisplayBlanksAs
import typings.officeJsPreview.Excel.ChartPlotBy
import typings.officeJsPreview.officeJsPreviewStrings.Columns
import typings.officeJsPreview.officeJsPreviewStrings.Interplotted
import typings.officeJsPreview.officeJsPreviewStrings.NotPlotted
import typings.officeJsPreview.officeJsPreviewStrings.Rows
import typings.officeJsPreview.officeJsPreviewStrings.Zero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `chart.toJSON()`. */
trait ChartData extends StObject {
  
  /**
    * Represents chart axes.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var axes: js.UndefOr[ChartAxesData] = js.undefined
  
  /**
    * Specifies a chart category label level enumeration constant, referring to the level of the source category labels.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var categoryLabelLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the type of the chart. See `Excel.ChartType` for details.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 84 */ Any
  ] = js.undefined
  
  /**
    * Represents the data labels on the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsData] = js.undefined
  
  /**
    * Specifies the way that blank cells are plotted on a chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var displayBlanksAs: js.UndefOr[ChartDisplayBlanksAs | NotPlotted | Zero | Interplotted] = js.undefined
  
  /**
    * Encapsulates the format properties for the chart area.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAreaFormatData] = js.undefined
  
  /**
    * Specifies the height, in points, of the chart object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The unique ID of chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * The distance, in points, from the left side of the chart to the worksheet origin.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the legend for the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var legend: js.UndefOr[ChartLegendData] = js.undefined
  
  /**
    * Specifies the name of a chart object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Encapsulates the options for a pivot chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.9]
    */
  var pivotOptions: js.UndefOr[ChartPivotOptionsData] = js.undefined
  
  /**
    * Represents the plot area for the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var plotArea: js.UndefOr[ChartPlotAreaData] = js.undefined
  
  /**
    * Specifies the way columns or rows are used as data series on the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var plotBy: js.UndefOr[ChartPlotBy | Rows | Columns] = js.undefined
  
  /**
    * True if only visible cells are plotted. False if both visible and hidden cells are plotted.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var plotVisibleOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Represents either a single series or collection of series in the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var series: js.UndefOr[js.Array[ChartSeriesData]] = js.undefined
  
  /**
    * Specifies a chart series name level enumeration constant, referring to the level of the source series names.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var seriesNameLevel: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies whether to display all field buttons on a PivotChart.
    *
    * @remarks
    * [Api set: ExcelApi 1.7]
    */
  var showAllFieldButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to show the data labels when the value is greater than the maximum value on the value axis.
    If the value axis becomes smaller than the size of the data points, you can use this property to set whether to show the data labels.
    This property applies to 2-D charts only.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var showDataLabelsOverMaximum: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the chart style for the chart.
    *
    * @remarks
    * [Api set: ExcelApi 1.8]
    */
  var style: js.UndefOr[Double] = js.undefined
  
  /**
    * Represents the title of the specified chart, including the text, visibility, position, and formatting of the title.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartTitleData] = js.undefined
  
  /**
    * Specifies the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies the width, in points, of the chart object.
    *
    * @remarks
    * [Api set: ExcelApi 1.1]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ChartData {
  
  inline def apply(): ChartData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartData]
  }
  
  extension [Self <: ChartData](x: Self) {
    
    inline def setAxes(value: ChartAxesData): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setCategoryLabelLevel(value: Double): Self = StObject.set(x, "categoryLabelLevel", value.asInstanceOf[js.Any])
    
    inline def setCategoryLabelLevelUndefined: Self = StObject.set(x, "categoryLabelLevel", js.undefined)
    
    inline def setChartType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 84 */ Any): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
    
    inline def setChartTypeUndefined: Self = StObject.set(x, "chartType", js.undefined)
    
    inline def setDataLabels(value: ChartDataLabelsData): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    inline def setDisplayBlanksAs(value: ChartDisplayBlanksAs | NotPlotted | Zero | Interplotted): Self = StObject.set(x, "displayBlanksAs", value.asInstanceOf[js.Any])
    
    inline def setDisplayBlanksAsUndefined: Self = StObject.set(x, "displayBlanksAs", js.undefined)
    
    inline def setFormat(value: ChartAreaFormatData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLegend(value: ChartLegendData): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPivotOptions(value: ChartPivotOptionsData): Self = StObject.set(x, "pivotOptions", value.asInstanceOf[js.Any])
    
    inline def setPivotOptionsUndefined: Self = StObject.set(x, "pivotOptions", js.undefined)
    
    inline def setPlotArea(value: ChartPlotAreaData): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    inline def setPlotAreaUndefined: Self = StObject.set(x, "plotArea", js.undefined)
    
    inline def setPlotBy(value: ChartPlotBy | Rows | Columns): Self = StObject.set(x, "plotBy", value.asInstanceOf[js.Any])
    
    inline def setPlotByUndefined: Self = StObject.set(x, "plotBy", js.undefined)
    
    inline def setPlotVisibleOnly(value: Boolean): Self = StObject.set(x, "plotVisibleOnly", value.asInstanceOf[js.Any])
    
    inline def setPlotVisibleOnlyUndefined: Self = StObject.set(x, "plotVisibleOnly", js.undefined)
    
    inline def setSeries(value: js.Array[ChartSeriesData]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesNameLevel(value: Double): Self = StObject.set(x, "seriesNameLevel", value.asInstanceOf[js.Any])
    
    inline def setSeriesNameLevelUndefined: Self = StObject.set(x, "seriesNameLevel", js.undefined)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: ChartSeriesData*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setShowAllFieldButtons(value: Boolean): Self = StObject.set(x, "showAllFieldButtons", value.asInstanceOf[js.Any])
    
    inline def setShowAllFieldButtonsUndefined: Self = StObject.set(x, "showAllFieldButtons", js.undefined)
    
    inline def setShowDataLabelsOverMaximum(value: Boolean): Self = StObject.set(x, "showDataLabelsOverMaximum", value.asInstanceOf[js.Any])
    
    inline def setShowDataLabelsOverMaximumUndefined: Self = StObject.set(x, "showDataLabelsOverMaximum", js.undefined)
    
    inline def setStyle(value: Double): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTitle(value: ChartTitleData): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
