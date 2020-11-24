package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChartTitleFormat extends Entity {
  
  // Represents the fill format of an object, which includes background formatting information. Read-only.
  var fill: js.UndefOr[NullableOption[WorkbookChartFill]] = js.native
  
  // Represents the font attributes (font name, font size, color, etc.) for the current object. Read-only.
  var font: js.UndefOr[NullableOption[WorkbookChartFont]] = js.native
}
object WorkbookChartTitleFormat {
  
  @scala.inline
  def apply(): WorkbookChartTitleFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartTitleFormat]
  }
  
  @scala.inline
  implicit class WorkbookChartTitleFormatOps[Self <: WorkbookChartTitleFormat] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFill(value: NullableOption[WorkbookChartFill]): Self = this.set("fill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFill: Self = this.set("fill", js.undefined)
    
    @scala.inline
    def setFillNull: Self = this.set("fill", null)
    
    @scala.inline
    def setFont(value: NullableOption[WorkbookChartFont]): Self = this.set("font", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFont: Self = this.set("font", js.undefined)
    
    @scala.inline
    def setFontNull: Self = this.set("font", null)
  }
}
