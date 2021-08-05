package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartAxisFormat
  extends StObject
     with Entity {
  
  // Represents the font attributes (font name, font size, color, etc.) for a chart axis element. Read-only.
  var font: js.UndefOr[NullableOption[WorkbookChartFont]] = js.undefined
  
  // Represents chart line formatting. Read-only.
  var line: js.UndefOr[NullableOption[WorkbookChartLineFormat]] = js.undefined
}
object WorkbookChartAxisFormat {
  
  inline def apply(): WorkbookChartAxisFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxisFormat]
  }
  
  extension [Self <: WorkbookChartAxisFormat](x: Self) {
    
    inline def setFont(value: NullableOption[WorkbookChartFont]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontNull: Self = StObject.set(x, "font", null)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    inline def setLine(value: NullableOption[WorkbookChartLineFormat]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineNull: Self = StObject.set(x, "line", null)
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
