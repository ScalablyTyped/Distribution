package typings.officeUiFabricReact.datePickerBaseMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatePickerState extends js.Object {
  
  var errorMessage: js.UndefOr[String] = js.native
  
  var formattedDate: js.UndefOr[String] = js.native
  
  var isDatePickerShown: js.UndefOr[Boolean] = js.native
  
  var selectedDate: js.UndefOr[Date] = js.native
}
object IDatePickerState {
  
  @scala.inline
  def apply(): IDatePickerState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDatePickerState]
  }
  
  @scala.inline
  implicit class IDatePickerStateOps[Self <: IDatePickerState] (val x: Self) extends AnyVal {
    
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
    def setErrorMessage(value: String): Self = this.set("errorMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorMessage: Self = this.set("errorMessage", js.undefined)
    
    @scala.inline
    def setFormattedDate(value: String): Self = this.set("formattedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedDate: Self = this.set("formattedDate", js.undefined)
    
    @scala.inline
    def setIsDatePickerShown(value: Boolean): Self = this.set("isDatePickerShown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDatePickerShown: Self = this.set("isDatePickerShown", js.undefined)
    
    @scala.inline
    def setSelectedDate(value: Date): Self = this.set("selectedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDate: Self = this.set("selectedDate", js.undefined)
  }
}
