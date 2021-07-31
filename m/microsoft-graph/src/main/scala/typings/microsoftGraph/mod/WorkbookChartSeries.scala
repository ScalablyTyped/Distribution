package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartSeries
  extends StObject
     with Entity {
  
  // Represents the formatting of a chart series, which includes fill and line formatting. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartSeriesFormat]] = js.undefined
  
  // Represents the name of a series in a chart.
  var name: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Represents a collection of all points in the series. Read-only.
  var points: js.UndefOr[NullableOption[js.Array[WorkbookChartPoint]]] = js.undefined
}
object WorkbookChartSeries {
  
  @scala.inline
  def apply(): WorkbookChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartSeries]
  }
  
  @scala.inline
  implicit class WorkbookChartSeriesMutableBuilder[Self <: WorkbookChartSeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: NullableOption[WorkbookChartSeriesFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatNull: Self = StObject.set(x, "format", null)
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setPoints(value: NullableOption[js.Array[WorkbookChartPoint]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointsNull: Self = StObject.set(x, "points", null)
    
    @scala.inline
    def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    @scala.inline
    def setPointsVarargs(value: WorkbookChartPoint*): Self = StObject.set(x, "points", js.Array(value :_*))
  }
}
