package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChartTitle extends Entity {
  
  // Represents the formatting of a chart title, which includes fill and font formatting. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartTitleFormat]] = js.native
  
  // Boolean value representing if the chart title will overlay the chart or not.
  var overlay: js.UndefOr[NullableOption[Boolean]] = js.native
  
  // Represents the title text of a chart.
  var text: js.UndefOr[NullableOption[String]] = js.native
  
  // A boolean value the represents the visibility of a chart title object.
  var visible: js.UndefOr[Boolean] = js.native
}
object WorkbookChartTitle {
  
  @scala.inline
  def apply(): WorkbookChartTitle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartTitle]
  }
  
  @scala.inline
  implicit class WorkbookChartTitleOps[Self <: WorkbookChartTitle] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: NullableOption[WorkbookChartTitleFormat]): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatNull: Self = this.set("format", null)
    
    @scala.inline
    def setOverlay(value: NullableOption[Boolean]): Self = this.set("overlay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    
    @scala.inline
    def setOverlayNull: Self = this.set("overlay", null)
    
    @scala.inline
    def setText(value: NullableOption[String]): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setTextNull: Self = this.set("text", null)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
