package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartDataLabelFormat
  extends StObject
     with Entity {
  
  // Represents the fill format of the current chart data label. Read-only.
  var fill: js.UndefOr[NullableOption[WorkbookChartFill]] = js.undefined
  
  // Represents the font attributes (font name, font size, color, etc.) for a chart data label. Read-only.
  var font: js.UndefOr[NullableOption[WorkbookChartFont]] = js.undefined
}
object WorkbookChartDataLabelFormat {
  
  inline def apply(): WorkbookChartDataLabelFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartDataLabelFormat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WorkbookChartDataLabelFormat] (val x: Self) extends AnyVal {
    
    inline def setFill(value: NullableOption[WorkbookChartFill]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    inline def setFillNull: Self = StObject.set(x, "fill", null)
    
    inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    inline def setFont(value: NullableOption[WorkbookChartFont]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    inline def setFontNull: Self = StObject.set(x, "font", null)
    
    inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
