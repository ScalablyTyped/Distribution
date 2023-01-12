package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartGridlinesFormat
  extends StObject
     with Entity {
  
  // Represents chart line formatting. Read-only.
  var line: js.UndefOr[NullableOption[WorkbookChartLineFormat]] = js.undefined
}
object WorkbookChartGridlinesFormat {
  
  inline def apply(): WorkbookChartGridlinesFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartGridlinesFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookChartGridlinesFormat] (val x: Self) extends AnyVal {
    
    inline def setLine(value: NullableOption[WorkbookChartLineFormat]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
