package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookChartPoint extends Entity {
  
  // Encapsulates the format properties chart point. Read-only.
  var format: js.UndefOr[NullableOption[WorkbookChartPointFormat]] = js.native
  
  // Returns the value of a chart point. Read-only.
  var value: js.UndefOr[NullableOption[_]] = js.native
}
object WorkbookChartPoint {
  
  @scala.inline
  def apply(): WorkbookChartPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookChartPoint]
  }
  
  @scala.inline
  implicit class WorkbookChartPointOps[Self <: WorkbookChartPoint] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: NullableOption[WorkbookChartPointFormat]): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFormatNull: Self = this.set("format", null)
    
    @scala.inline
    def setValue(value: NullableOption[_]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
    
    @scala.inline
    def setValueNull: Self = this.set("value", null)
  }
}
