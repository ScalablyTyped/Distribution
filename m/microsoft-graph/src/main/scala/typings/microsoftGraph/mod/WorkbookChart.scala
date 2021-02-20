package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChart extends Entity {
  
  // Represents chart axes. Read-only.
  var axes: js.UndefOr[NullableOption[WorkbookChartAxes]] = js.native
  
  // Represents the datalabels on the chart. Read-only.
  var dataLabels: js.UndefOr[NullableOption[WorkbookChartDataLabels]] = js.native
  
  // Encapsulates the format properties for the chart area. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartAreaFormat]] = js.native
  
  // Represents the height, in points, of the chart object.
  var height: js.UndefOr[Double] = js.native
  
  // The distance, in points, from the left side of the chart to the worksheet origin.
  var left: js.UndefOr[Double] = js.native
  
  // Represents the legend for the chart. Read-only.
  var legend: js.UndefOr[NullableOption[WorkbookChartLegend]] = js.native
  
  // Represents the name of a chart object.
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // Represents either a single series or collection of series in the chart. Read-only.
  var series: js.UndefOr[NullableOption[js.Array[WorkbookChartSeries]]] = js.native
  
  /**
    * Represents the title of the specified chart, including the text, visibility, position and formating of the title.
    * Read-only.
    */
  var title: js.UndefOr[NullableOption[WorkbookChartTitle]] = js.native
  
  /**
    * Represents the distance, in points, from the top edge of the object to the top of row 1 (on a worksheet) or the top of
    * the chart area (on a chart).
    */
  var top: js.UndefOr[Double] = js.native
  
  // Represents the width, in points, of the chart object.
  var width: js.UndefOr[Double] = js.native
  
  // The worksheet containing the current chart. Read-only.
  var worksheet: js.UndefOr[NullableOption[WorkbookWorksheet]] = js.native
}
object WorkbookChart {
  
  @scala.inline
  def apply(): WorkbookChart = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChart]
  }
  
  @scala.inline
  implicit class WorkbookChartMutableBuilder[Self <: WorkbookChart] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxes(value: NullableOption[WorkbookChartAxes]): Self = StObject.set(x, "axes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxesNull: Self = StObject.set(x, "axes", null)
    
    @scala.inline
    def setAxesUndefined: Self = StObject.set(x, "axes", js.undefined)
    
    @scala.inline
    def setDataLabels(value: NullableOption[WorkbookChartDataLabels]): Self = StObject.set(x, "dataLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataLabelsNull: Self = StObject.set(x, "dataLabels", null)
    
    @scala.inline
    def setDataLabelsUndefined: Self = StObject.set(x, "dataLabels", js.undefined)
    
    @scala.inline
    def setFormat(value: NullableOption[WorkbookChartAreaFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatNull: Self = StObject.set(x, "format", null)
    
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
    def setLegend(value: NullableOption[WorkbookChartLegend]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLegendNull: Self = StObject.set(x, "legend", null)
    
    @scala.inline
    def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSeries(value: NullableOption[js.Array[WorkbookChartSeries]]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesNull: Self = StObject.set(x, "series", null)
    
    @scala.inline
    def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    @scala.inline
    def setSeriesVarargs(value: WorkbookChartSeries*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: NullableOption[WorkbookChartTitle]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleNull: Self = StObject.set(x, "title", null)
    
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
    
    @scala.inline
    def setWorksheet(value: NullableOption[WorkbookWorksheet]): Self = StObject.set(x, "worksheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorksheetNull: Self = StObject.set(x, "worksheet", null)
    
    @scala.inline
    def setWorksheetUndefined: Self = StObject.set(x, "worksheet", js.undefined)
  }
}
