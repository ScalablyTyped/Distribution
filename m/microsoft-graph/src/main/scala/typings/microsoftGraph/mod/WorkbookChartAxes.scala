package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartAxes
  extends StObject
     with Entity {
  
  // Represents the category axis in a chart. Read-only.
  var categoryAxis: js.UndefOr[NullableOption[WorkbookChartAxis]] = js.undefined
  
  // Represents the series axis of a 3-dimensional chart. Read-only.
  var seriesAxis: js.UndefOr[NullableOption[WorkbookChartAxis]] = js.undefined
  
  // Represents the value axis in an axis. Read-only.
  var valueAxis: js.UndefOr[NullableOption[WorkbookChartAxis]] = js.undefined
}
object WorkbookChartAxes {
  
  inline def apply(): WorkbookChartAxes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookChartAxes] (val x: Self) extends AnyVal {
    
    inline def setCategoryAxis(value: NullableOption[WorkbookChartAxis]): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
    
    inline def setCategoryAxisNull: Self = StObject.set(x, "categoryAxis", null)
    
    inline def setCategoryAxisUndefined: Self = StObject.set(x, "categoryAxis", js.undefined)
    
    inline def setSeriesAxis(value: NullableOption[WorkbookChartAxis]): Self = StObject.set(x, "seriesAxis", value.asInstanceOf[js.Any])
    
    inline def setSeriesAxisNull: Self = StObject.set(x, "seriesAxis", null)
    
    inline def setSeriesAxisUndefined: Self = StObject.set(x, "seriesAxis", js.undefined)
    
    inline def setValueAxis(value: NullableOption[WorkbookChartAxis]): Self = StObject.set(x, "valueAxis", value.asInstanceOf[js.Any])
    
    inline def setValueAxisNull: Self = StObject.set(x, "valueAxis", null)
    
    inline def setValueAxisUndefined: Self = StObject.set(x, "valueAxis", js.undefined)
  }
}
