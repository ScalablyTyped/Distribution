package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChart
  extends StObject
     with Entity {
  
  // Represents chart axes. Read-only.
  var axes: js.UndefOr[NullableOption[WorkbookChartAxes]] = js.undefined
  
  // Represents the datalabels on the chart. Read-only.
  var dataLabels: js.UndefOr[NullableOption[WorkbookChartDataLabels]] = js.undefined
  
  // Encapsulates the format properties for the chart area. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartAreaFormat]] = js.undefined
  
  // Represents the height, in points, of the chart object.
  var height: js.UndefOr[Double] = js.undefined
  
  // The distance, in points, from the left side of the chart to the worksheet origin.
  var left: js.UndefOr[Double] = js.undefined
  
  // Represents the legend for the chart. Read-only.
  var legend: js.UndefOr[NullableOption[WorkbookChartLegend]] = js.undefined
  
  // Represents the name of a chart object.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Represents either a single series or collection of series in the chart. Read-only.
  var series: js.UndefOr[NullableOption[js.Array[WorkbookChartSeries]]] = js.undefined
  
  /**
    * Represents the title of the specified chart, including the text, visibility, position and formating of the title.
    * Read-only.
    */
  var title: js.UndefOr[NullableOption[WorkbookChartTitle]] = js.undefined
  
  /**
    * Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of
    * the chart area (on a chart).
    */
  var top: js.UndefOr[Double] = js.undefined
  
  // Represents the width, in points, of the chart object.
  var width: js.UndefOr[Double] = js.undefined
  
  // The worksheet containing the current chart. Read-only.
  var worksheet: js.UndefOr[NullableOption[WorkbookWorksheet]] = js.undefined
}
object WorkbookChart {
  
  inline def apply(): WorkbookChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChart]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookChart] (val x: Self) extends AnyVal {
    
    inline def setAxes(value: NullableOption[WorkbookChartAxes]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    inline def setAxesNull: Self = StObject.set(x, "axes", null)
    
    inline def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    inline def setDataLabels(value: NullableOption[WorkbookChartDataLabels]): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    inline def setDataLabelsNull: Self = StObject.set(x, "dataLabels", null)
    
    inline def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    inline def setFormat(value: NullableOption[WorkbookChartAreaFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setLegend(value: NullableOption[WorkbookChartLegend]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendNull: Self = StObject.set(x, "legend", null)
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSeries(value: NullableOption[js.Array[WorkbookChartSeries]]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesNull: Self = StObject.set(x, "series", null)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: WorkbookChartSeries*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setTitle(value: NullableOption[WorkbookChartTitle]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    inline def setWorksheet(value: NullableOption[WorkbookWorksheet]): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    inline def setWorksheetNull: Self = StObject.set(x, "worksheet", null)
    
    inline def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
