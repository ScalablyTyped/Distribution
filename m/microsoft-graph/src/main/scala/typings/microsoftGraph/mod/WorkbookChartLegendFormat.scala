package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChartLegendFormat extends Entity {
  
  // Represents the fill format of an object, which includes background formating information. Read-only.
  var fill: js.UndefOr[NullableOption[WorkbookChartFill]] = js.native
  
  // Represents the font attributes such as font name, font size, color, etc. of a chart legend. Read-only.
  var font: js.UndefOr[NullableOption[WorkbookChartFont]] = js.native
}
object WorkbookChartLegendFormat {
  
  @scala.inline
  def apply(): WorkbookChartLegendFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartLegendFormat]
  }
  
  @scala.inline
  implicit class WorkbookChartLegendFormatMutableBuilder[Self <: WorkbookChartLegendFormat] (val x: Self) extends AnyVal {
    
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
