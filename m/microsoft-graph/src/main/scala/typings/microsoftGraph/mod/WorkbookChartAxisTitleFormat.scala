package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChartAxisTitleFormat extends Entity {
  
  // Represents the font attributes, such as font name, font size, color, etc. of chart axis title object. Read-only.
  var font: js.UndefOr[NullableOption[WorkbookChartFont]] = js.native
}
object WorkbookChartAxisTitleFormat {
  
  @scala.inline
  def apply(): WorkbookChartAxisTitleFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartAxisTitleFormat]
  }
  
  @scala.inline
  implicit class WorkbookChartAxisTitleFormatMutableBuilder[Self <: WorkbookChartAxisTitleFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFont(value: NullableOption[WorkbookChartFont]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontNull: Self = StObject.set(x, "font", null)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
