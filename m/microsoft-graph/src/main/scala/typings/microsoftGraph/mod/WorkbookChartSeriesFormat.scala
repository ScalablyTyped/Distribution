package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartSeriesFormat
  extends StObject
     with Entity {
  
  // Represents the fill format of a chart series, which includes background formating information. Read-only.
  var fill: js.UndefOr[NullableOption[WorkbookChartFill]] = js.undefined
  
  // Represents line formatting. Read-only.
  var line: js.UndefOr[NullableOption[WorkbookChartLineFormat]] = js.undefined
}
object WorkbookChartSeriesFormat {
  
  inline def apply(): WorkbookChartSeriesFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartSeriesFormat]
  }
  
  extension [Self <: WorkbookChartSeriesFormat](x: Self) {
    
    inline def setFill(value: NullableOption[WorkbookChartFill]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillNull: Self = StObject.set(x, "fill", null)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setLine(value: NullableOption[WorkbookChartLineFormat]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
