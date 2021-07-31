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
  
  @scala.inline
  def apply(): WorkbookChartGridlinesFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartGridlinesFormat]
  }
  
  @scala.inline
  implicit class WorkbookChartGridlinesFormatMutableBuilder[Self <: WorkbookChartGridlinesFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: NullableOption[WorkbookChartLineFormat]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNull: Self = StObject.set(x, "line", null)
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
