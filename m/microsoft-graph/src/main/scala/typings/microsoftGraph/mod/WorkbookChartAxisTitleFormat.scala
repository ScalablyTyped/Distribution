package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartAxisTitleFormat
  extends StObject
     with Entity {
  
  // Represents the font attributes, such as font name, font size, color, etc. of chart axis title object. Read-only.
  var font: js.UndefOr[NullableOption[WorkbookChartFont]] = js.undefined
}
object WorkbookChartAxisTitleFormat {
  
  inline def apply(): WorkbookChartAxisTitleFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxisTitleFormat]
  }
  
  extension [Self <: WorkbookChartAxisTitleFormat](x: Self) {
    
    inline def setFont(value: NullableOption[WorkbookChartFont]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontNull: Self = StObject.set(x, "font", null)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
