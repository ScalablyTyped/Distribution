package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkbookChartTitleFormat
  extends StObject
     with Entity {
  
  // Represents the fill format of an object, which includes background formatting information. Read-only.
  var fill: js.UndefOr[NullableOption[WorkbookChartFill]] = js.undefined
  
  // Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only.
  var font: js.UndefOr[NullableOption[WorkbookChartFont]] = js.undefined
}
object WorkbookChartTitleFormat {
  
  @scala.inline
  def apply(): WorkbookChartTitleFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartTitleFormat]
  }
  
  @scala.inline
  implicit class WorkbookChartTitleFormatMutableBuilder[Self <: WorkbookChartTitleFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill(value: NullableOption[WorkbookChartFill]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFillNull: Self = StObject.set(x, "fill", null)
    
    @scala.inline
    def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
    
    @scala.inline
    def setFont(value: NullableOption[WorkbookChartFont]): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontNull: Self = StObject.set(x, "font", null)
    
    @scala.inline
    def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
  }
}
