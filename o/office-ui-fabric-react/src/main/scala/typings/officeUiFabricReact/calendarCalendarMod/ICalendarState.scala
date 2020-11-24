package typings.officeUiFabricReact.calendarCalendarMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendarState extends js.Object {
  
  /** State used to show/hide day picker */
  var isDayPickerVisible: js.UndefOr[Boolean] = js.native
  
  /** State used to show/hide month picker */
  var isMonthPickerVisible: js.UndefOr[Boolean] = js.native
  
  /** The currently focused date in the day picker, but not necessarily selected */
  var navigatedDayDate: js.UndefOr[Date] = js.native
  
  /** The currently focused date in the month picker, but not necessarily selected */
  var navigatedMonthDate: js.UndefOr[Date] = js.native
  
  /** The currently selected date in the calendar */
  var selectedDate: js.UndefOr[Date] = js.native
}
object ICalendarState {
  
  @scala.inline
  def apply(): ICalendarState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICalendarState]
  }
  
  @scala.inline
  implicit class ICalendarStateOps[Self <: ICalendarState] (val x: Self) extends AnyVal {
    
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
    def setIsDayPickerVisible(value: Boolean): Self = this.set("isDayPickerVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDayPickerVisible: Self = this.set("isDayPickerVisible", js.undefined)
    
    @scala.inline
    def setIsMonthPickerVisible(value: Boolean): Self = this.set("isMonthPickerVisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMonthPickerVisible: Self = this.set("isMonthPickerVisible", js.undefined)
    
    @scala.inline
    def setNavigatedDayDate(value: Date): Self = this.set("navigatedDayDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigatedDayDate: Self = this.set("navigatedDayDate", js.undefined)
    
    @scala.inline
    def setNavigatedMonthDate(value: Date): Self = this.set("navigatedMonthDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigatedMonthDate: Self = this.set("navigatedMonthDate", js.undefined)
    
    @scala.inline
    def setSelectedDate(value: Date): Self = this.set("selectedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedDate: Self = this.set("selectedDate", js.undefined)
  }
}
