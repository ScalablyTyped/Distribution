package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduleInformation extends js.Object {
  
  /**
    * Represents a merged view of availability of all the items in scheduleItems. The view consists of time slots.
    * Availability during each time slot is indicated with: 0= free, 1= tentative, 2= busy, 3= out of office, 4= working
    * elsewhere.
    */
  var availabilityView: js.UndefOr[NullableOption[String]] = js.native
  
  // Error information from attempting to get the availability of the user, distribution list, or resource.
  var error: js.UndefOr[NullableOption[FreeBusyError]] = js.native
  
  // An SMTP address of the user, distribution list, or resource, identifying an instance of scheduleInformation.
  var scheduleId: js.UndefOr[NullableOption[String]] = js.native
  
  // Contains the items that describe the availability of the user or resource.
  var scheduleItems: js.UndefOr[NullableOption[js.Array[ScheduleItem]]] = js.native
  
  /**
    * The days of the week and hours in a specific time zone that the user works. These are set as part of the user's
    * mailboxSettings.
    */
  var workingHours: js.UndefOr[NullableOption[WorkingHours]] = js.native
}
object ScheduleInformation {
  
  @scala.inline
  def apply(): ScheduleInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleInformation]
  }
  
  @scala.inline
  implicit class ScheduleInformationOps[Self <: ScheduleInformation] (val x: Self) extends AnyVal {
    
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
    def setAvailabilityView(value: NullableOption[String]): Self = this.set("availabilityView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvailabilityView: Self = this.set("availabilityView", js.undefined)
    
    @scala.inline
    def setAvailabilityViewNull: Self = this.set("availabilityView", null)
    
    @scala.inline
    def setError(value: NullableOption[FreeBusyError]): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setErrorNull: Self = this.set("error", null)
    
    @scala.inline
    def setScheduleId(value: NullableOption[String]): Self = this.set("scheduleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleId: Self = this.set("scheduleId", js.undefined)
    
    @scala.inline
    def setScheduleIdNull: Self = this.set("scheduleId", null)
    
    @scala.inline
    def setScheduleItemsVarargs(value: ScheduleItem*): Self = this.set("scheduleItems", js.Array(value :_*))
    
    @scala.inline
    def setScheduleItems(value: NullableOption[js.Array[ScheduleItem]]): Self = this.set("scheduleItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleItems: Self = this.set("scheduleItems", js.undefined)
    
    @scala.inline
    def setScheduleItemsNull: Self = this.set("scheduleItems", null)
    
    @scala.inline
    def setWorkingHours(value: NullableOption[WorkingHours]): Self = this.set("workingHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkingHours: Self = this.set("workingHours", js.undefined)
    
    @scala.inline
    def setWorkingHoursNull: Self = this.set("workingHours", null)
  }
}
