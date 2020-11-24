package typings.officeJs.Excel.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the WorksheetCustomProperty object, for use in `worksheetCustomProperty.set({ ... })`. */
@js.native
trait WorksheetCustomPropertyUpdateData extends js.Object {
  
  /**
    *
    * Gets or sets the value of the custom property.
    *
    * [Api set: ExcelApi 1.12]
    */
  var value: js.UndefOr[String] = js.native
}
object WorksheetCustomPropertyUpdateData {
  
  @scala.inline
  def apply(): WorksheetCustomPropertyUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorksheetCustomPropertyUpdateData]
  }
  
  @scala.inline
  implicit class WorksheetCustomPropertyUpdateDataOps[Self <: WorksheetCustomPropertyUpdateData] (val x: Self) extends AnyVal {
    
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
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
