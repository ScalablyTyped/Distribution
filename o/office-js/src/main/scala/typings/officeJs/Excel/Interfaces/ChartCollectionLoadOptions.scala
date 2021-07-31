package typings.officeJs.Excel.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  *
  * A collection of all the chart objects on a worksheet.
  *
  * [Api set: ExcelApi 1.1]
  */
trait ChartCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Represents chart axes.
    *
    * [Api set: ExcelApi 1.1]
    */
  var axes: js.UndefOr[ChartAxesLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies a ChartCategoryLabelLevel enumeration constant referring to
    the level of where the category labels are being sourced from.
    *
    * [Api set: ExcelApi 1.8]
    */
  var categoryLabelLevel: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the type of the chart. See Excel.ChartType for details.
    *
    * [Api set: ExcelApi 1.7]
    */
  var chartType: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Represents the datalabels on the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var dataLabels: js.UndefOr[ChartDataLabelsLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the way that blank cells are plotted on a chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var displayBlanksAs: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Encapsulates the format properties for the chart area.
    *
    * [Api set: ExcelApi 1.1]
    */
  var format: js.UndefOr[ChartAreaFormatLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the height, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var height: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The unique id of chart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The distance, in points, from the left side of the chart to the worksheet origin.
    *
    * [Api set: ExcelApi 1.1]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Represents the legend for the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var legend: js.UndefOr[ChartLegendLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the name of a chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Encapsulates the options for a pivot chart.
    *
    * [Api set: ExcelApi 1.9]
    */
  var pivotOptions: js.UndefOr[ChartPivotOptionsLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Represents the plotArea for the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotArea: js.UndefOr[ChartPlotAreaLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the way columns or rows are used as data series on the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotBy: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: True if only visible cells are plotted. False if both visible and hidden cells are plotted.
    *
    * [Api set: ExcelApi 1.8]
    */
  var plotVisibleOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Represents either a single series or collection of series in the chart.
    *
    * [Api set: ExcelApi 1.1]
    */
  var series: js.UndefOr[ChartSeriesCollectionLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies a ChartSeriesNameLevel enumeration constant referring to
    the level of where the series names are being sourced from.
    *
    * [Api set: ExcelApi 1.8]
    */
  var seriesNameLevel: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies whether to display all field buttons on a PivotChart.
    *
    * [Api set: ExcelApi 1.7]
    */
  var showAllFieldButtons: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies whether to show the data labels when the value is greater than the maximum value on the value axis.
    If value axis became smaller than the size of data points, you can use this property to set whether to show the data labels.
    This property applies to 2-D charts only.
    *
    * [Api set: ExcelApi 1.8]
    */
  var showDataLabelsOverMaximum: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the chart style for the chart.
    *
    * [Api set: ExcelApi 1.8]
    */
  var style: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the title of the specified chart, including the text, visibility, position, and formatting of the title.
    *
    * [Api set: ExcelApi 1.1]
    */
  var title: js.UndefOr[ChartTitleLoadOptions] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of the chart area (on a chart).
    *
    * [Api set: ExcelApi 1.1]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: Specifies the width, in points, of the chart object.
    *
    * [Api set: ExcelApi 1.1]
    */
  var width: js.UndefOr[Boolean] = js.undefined
  
  /**
    *
    * For EACH ITEM in the collection: The worksheet containing the current chart.
    *
    * [Api set: ExcelApi 1.2]
    */
  var worksheet: js.UndefOr[WorksheetLoadOptions] = js.undefined
}
object ChartCollectionLoadOptions {
  
  @scala.inline
  def apply(): ChartCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChartCollectionLoadOptions]
  }
  
  @scala.inline
  implicit class ChartCollectionLoadOptionsMutableBuilder[Self <: ChartCollectionLoadOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    @scala.inline
    def setAxes(value: ChartAxesLoadOptions): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    @scala.inline
    def setCategoryLabelLevel(value: Boolean): Self = StObject.set(x, "categoryLabelLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoryLabelLevelUndefined: Self = StObject.set(x, "categoryLabelLevel", js.undefined)
    
    @scala.inline
    def setChartType(value: Boolean): Self = StObject.set(x, "chartType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartTypeUndefined: Self = StObject.set(x, "chartType", js.undefined)
    
    @scala.inline
    def setDataLabels(value: ChartDataLabelsLoadOptions): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setDisplayBlanksAs(value: Boolean): Self = StObject.set(x, "displayBlanksAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayBlanksAsUndefined: Self = StObject.set(x, "displayBlanksAs", js.undefined)
    
    @scala.inline
    def setFormat(value: ChartAreaFormatLoadOptions): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setHeight(value: Boolean): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    @scala.inline
    def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    @scala.inline
    def setLegend(value: ChartLegendLoadOptions): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPivotOptions(value: ChartPivotOptionsLoadOptions): Self = StObject.set(x, "pivotOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPivotOptionsUndefined: Self = StObject.set(x, "pivotOptions", js.undefined)
    
    @scala.inline
    def setPlotArea(value: ChartPlotAreaLoadOptions): Self = StObject.set(x, "plotArea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotAreaUndefined: Self = StObject.set(x, "plotArea", js.undefined)
    
    @scala.inline
    def setPlotBy(value: Boolean): Self = StObject.set(x, "plotBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotByUndefined: Self = StObject.set(x, "plotBy", js.undefined)
    
    @scala.inline
    def setPlotVisibleOnly(value: Boolean): Self = StObject.set(x, "plotVisibleOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlotVisibleOnlyUndefined: Self = StObject.set(x, "plotVisibleOnly", js.undefined)
    
    @scala.inline
    def setSeries(value: ChartSeriesCollectionLoadOptions): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesNameLevel(value: Boolean): Self = StObject.set(x, "seriesNameLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesNameLevelUndefined: Self = StObject.set(x, "seriesNameLevel", js.undefined)
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setShowAllFieldButtons(value: Boolean): Self = StObject.set(x, "showAllFieldButtons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowAllFieldButtonsUndefined: Self = StObject.set(x, "showAllFieldButtons", js.undefined)
    
    @scala.inline
    def setShowDataLabelsOverMaximum(value: Boolean): Self = StObject.set(x, "showDataLabelsOverMaximum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDataLabelsOverMaximumUndefined: Self = StObject.set(x, "showDataLabelsOverMaximum", js.undefined)
    
    @scala.inline
    def setStyle(value: Boolean): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setTitle(value: ChartTitleLoadOptions): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    @scala.inline
    def setWidth(value: Boolean): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWorksheet(value: WorksheetLoadOptions): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
