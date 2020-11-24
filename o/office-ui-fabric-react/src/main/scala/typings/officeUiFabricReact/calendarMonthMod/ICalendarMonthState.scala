package typings.officeUiFabricReact.calendarMonthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendarMonthState extends js.Object {
  
  /** State used to show/hide month picker */
  var isYearPickerVisible: js.UndefOr[Boolean] = js.native
}
object ICalendarMonthState {
  
  @scala.inline
  def apply(): ICalendarMonthState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarMonthState]
  }
  
  @scala.inline
  implicit class ICalendarMonthStateOps[Self <: ICalendarMonthState] (val x: Self) extends AnyVal {
    
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
    def setIsYearPickerVisible(value: Boolean): Self = this.set("isYearPickerVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsYearPickerVisible: Self = this.set("isYearPickerVisible", js.undefined)
  }
}
