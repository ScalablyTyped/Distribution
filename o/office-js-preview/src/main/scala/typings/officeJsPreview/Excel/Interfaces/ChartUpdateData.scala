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

/** An interface for updating data on the Chart object, for use in `chart.set({ ... })`. */
trait ChartUpdateData extends StObject {
  
  /**
    *
    * Represents chart axes.
    *
    * [Api set: ExcelApi 1.1]
    */
  var axes: js.UndefOr[ChartAxesUpdateData] = js.undefined
  
  /**
    *
    * Specifies a ChartCategoryLabelLevel enumeration constant referring to
    the level of where the category labels are being sourced from.
    *
    * [Api set: ExcelApi 1.8]
    */
  var categoryLabelLevel: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the type of the chart. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 84 */ js.Any
  ] = js.undefined
  
  /**
    *
    * Represents the datalabels on the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsUpdateData] = js.undefined
  
  /**
    *
    * Specifies the way that blank cells are plotted on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var displayBlanksAs: js.UndefOr[ChartDisplayBlanksAs | NotPlotted | Zero | Interplotted] = js.undefined
  
  /**
    *
    * Encapsulates the format properties for the chart area.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAreaFormatUpdateData] = js.undefined
  
  /**
    *
    * Specifies the height, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * The distance, in points, from the left side of the chart to the worksheet origin.
    *
    * [Api set: ExcelApi 1.1]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Represents the legend for the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var legend: js.UndefOr[ChartLegendUpdateData] = js.undefined
  
  /**
    *
    * Specifies the name of a chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    *
    * Encapsulates the options for a pivot chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pivotOptions: js.UndefOr[ChartPivotOptionsUpdateData] = js.undefined
  
  /**
    *
    * Represents the plotArea for the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotArea: js.UndefOr[ChartPlotAreaUpdateData] = js.undefined
  
  /**
    *
    * Specifies the way columns or rows are used as data series on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotBy: js.UndefOr[ChartPlotBy | Rows | Columns] = js.undefined
  
  /**
    *
    * True if only visible cells are plotted. False if both visible and hidden cells are plotted.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotVisibleOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies a ChartSeriesNameLevel enumeration constant referring to
    the level of where the series names are being sourced from.
    *
    * [Api set: ExcelApi 1.8]
    */
  var seriesNameLevel: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies whether to display all field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showAllFieldButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies whether to show the data labels when the value is greater than the maximum value on the value axis.
    If value axis became smaller than the size of data points, you can use this property to set whether to show the data labels.
    This property applies to 2-D charts only.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showDataLabelsOverMaximum: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * Specifies the chart style for the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var style: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the title of the specified chart, including the text, visibility, position, and formatting of the title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartTitleUpdateData] = js.undefined
  
  /**
    *
    * Specifies the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
    *
    * [Api set: ExcelApi 1.1]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    *
    * Specifies the width, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var width: js.UndefOr[Double] = js.undefined
}
object ChartUpdateData {
  
  @scala.inline
  def apply(): ChartUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartUpdateData]
  }
  
  @scala.inline
  implicit class ChartUpdateDataMutableBuilder[Self <: ChartUpdateData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxes(value: ChartAxesUpdateData): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    @scala.inline
    def setCategoryLabelLevel(value: Double): Self = StObject.set(x, "categoryLabelLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryLabelLevelUndefined: Self = StObject.set(x, "categoryLabelLevel", js.undefined)
    
    @scala.inline
    def setChartType(value: /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 84 */ js.Any): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartTypeUndefined: Self = StObject.set(x, "chartType", js.undefined)
    
    @scala.inline
    def setDataLabels(value: ChartDataLabelsUpdateData): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setDisplayBlanksAs(value: ChartDisplayBlanksAs | NotPlotted | Zero | Interplotted): Self = StObject.set(x, "displayBlanksAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayBlanksAsUndefined: Self = StObject.set(x, "displayBlanksAs", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartAreaFormatUpdateData): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLegend(value: ChartLegendUpdateData): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPivotOptions(value: ChartPivotOptionsUpdateData): Self = StObject.set(x, "pivotOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotOptionsUndefined: Self = StObject.set(x, "pivotOptions", js.undefined)
    
    @scala.inline
    def setPlotArea(value: ChartPlotAreaUpdateData): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotAreaUndefined: Self = StObject.set(x, "plotArea", js.undefined)
    
    @scala.inline
    def setPlotBy(value: ChartPlotBy | Rows | Columns): Self = StObject.set(x, "plotBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotByUndefined: Self = StObject.set(x, "plotBy", js.undefined)
    
    @scala.inline
    def setPlotVisibleOnly(value: Boolean): Self = StObject.set(x, "plotVisibleOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotVisibleOnlyUndefined: Self = StObject.set(x, "plotVisibleOnly", js.undefined)
    
    @scala.inline
    def setSeriesNameLevel(value: Double): Self = StObject.set(x, "seriesNameLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesNameLevelUndefined: Self = StObject.set(x, "seriesNameLevel", js.undefined)
    
    @scala.inline
    def setShowAllFieldButtons(value: Boolean): Self = StObject.set(x, "showAllFieldButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAllFieldButtonsUndefined: Self = StObject.set(x, "showAllFieldButtons", js.undefined)
    
    @scala.inline
    def setShowDataLabelsOverMaximum(value: Boolean): Self = StObject.set(x, "showDataLabelsOverMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDataLabelsOverMaximumUndefined: Self = StObject.set(x, "showDataLabelsOverMaximum", js.undefined)
    
    @scala.inline
    def setStyle(value: Double): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: ChartTitleUpdateData): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
