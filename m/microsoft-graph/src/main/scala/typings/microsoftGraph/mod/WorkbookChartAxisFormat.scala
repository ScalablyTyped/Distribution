package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChartAxisFormat extends Entity {
  
  // Represents the font attributes (font name, font size, color, etc.) for a chart axis element. Read-only.
  var font: js.UndefOr[NullableOption[WorkbookChartFont]] = js.native
  
  // Represents chart line formatting. Read-only.
  var line: js.UndefOr[NullableOption[WorkbookChartLineFormat]] = js.native
}
object WorkbookChartAxisFormat {
  
  @scala.inline
  def apply(): WorkbookChartAxisFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxisFormat]
  }
  
  @scala.inline
  implicit class WorkbookChartAxisFormatMutableBuilder[Self <: WorkbookChartAxisFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: NullableOption[WorkbookChartFont]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontNull: Self = StObject.set(x, "font", null)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
    
    @scala.inline
    def setLine(value: NullableOption[WorkbookChartLineFormat]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineNull: Self = StObject.set(x, "line", null)
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
  }
}
