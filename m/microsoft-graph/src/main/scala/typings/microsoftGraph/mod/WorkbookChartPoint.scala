package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartPoint
  extends StObject
     with Entity {
  
  // Encapsulates the format properties chart point. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartPointFormat]] = js.undefined
  
  // Returns the value of a chart point. Read-only.
  var value: js.UndefOr[NullableOption[Any]] = js.undefined
}
object WorkbookChartPoint {
  
  inline def apply(): WorkbookChartPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartPoint]
  }
  
  extension [Self <: WorkbookChartPoint](x: Self) {
    
    inline def setFormat(value: NullableOption[WorkbookChartPointFormat]): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatNull: Self = StObject.set(x, "format", null)
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setValue(value: NullableOption[Any]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
