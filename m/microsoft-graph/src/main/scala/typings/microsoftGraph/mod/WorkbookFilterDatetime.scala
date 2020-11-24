package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkbookFilterDatetime extends js.Object {
  
  var date: js.UndefOr[NullableOption[String]] = js.native
  
  var specificity: js.UndefOr[String] = js.native
}
object WorkbookFilterDatetime {
  
  @scala.inline
  def apply(): WorkbookFilterDatetime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkbookFilterDatetime]
  }
  
  @scala.inline
  implicit class WorkbookFilterDatetimeOps[Self <: WorkbookFilterDatetime] (val x: Self) extends AnyVal {
    
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
    def setDate(value: NullableOption[String]): Self = this.set("date", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDate: Self = this.set("date", js.undefined)
    
    @scala.inline
    def setDateNull: Self = this.set("date", null)
    
    @scala.inline
    def setSpecificity(value: String): Self = this.set("specificity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpecificity: Self = this.set("specificity", js.undefined)
  }
}
