package typings.officeUiFabricReact.calendarYearMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICalendarYearState extends js.Object {
  
  var fromYear: Double = js.native
  
  var navigatedYear: js.UndefOr[Double] = js.native
  
  var selectedYear: js.UndefOr[Double] = js.native
}
object ICalendarYearState {
  
  @scala.inline
  def apply(fromYear: Double): ICalendarYearState = {
    val __obj = js.Dynamic.literal(fromYear = fromYear.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICalendarYearState]
  }
  
  @scala.inline
  implicit class ICalendarYearStateOps[Self <: ICalendarYearState] (val x: Self) extends AnyVal {
    
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
    def setFromYear(value: Double): Self = this.set("fromYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigatedYear(value: Double): Self = this.set("navigatedYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigatedYear: Self = this.set("navigatedYear", js.undefined)
    
    @scala.inline
    def setSelectedYear(value: Double): Self = this.set("selectedYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedYear: Self = this.set("selectedYear", js.undefined)
  }
}
