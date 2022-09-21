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
  
  inline def apply(): WorkbookChartSeries = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartSeries]
  }
  
  extension [Self <: WorkbookChartSeries](x: Self) {
    
    inline def setFormat(value: NullableOption[WorkbookChartSeriesFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPoints(value: NullableOption[js.Array[WorkbookChartPoint]]): Self = StObject.set(x, "points", value.asInstanceOf[js.Any])
    
    inline def setPointsNull: Self = StObject.set(x, "points", null)
    
    inline def setPointsUndefined: Self = StObject.set(x, "points", js.undefined)
    
    inline def setPointsVarargs(value: WorkbookChartPoint*): Self = StObject.set(x, "points", js.Array(value*))
  }
}
