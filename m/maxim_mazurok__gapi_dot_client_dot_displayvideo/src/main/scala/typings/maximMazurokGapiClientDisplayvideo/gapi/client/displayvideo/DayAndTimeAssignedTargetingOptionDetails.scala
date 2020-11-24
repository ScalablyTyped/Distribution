package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DayAndTimeAssignedTargetingOptionDetails extends js.Object {
  
  /** Required. The day of the week for this day and time targeting setting. */
  var dayOfWeek: js.UndefOr[String] = js.native
  
  /** Required. The end hour for day and time targeting. Must be between 1 (1 hour after start of day) and 24 (end of day). */
  var endHour: js.UndefOr[Double] = js.native
  
  /** Required. The start hour for day and time targeting. Must be between 0 (start of day) and 23 (1 hour before end of day). */
  var startHour: js.UndefOr[Double] = js.native
  
  /** Required. The mechanism used to determine which timezone to use for this day and time targeting setting. */
  var timeZoneResolution: js.UndefOr[String] = js.native
}
object DayAndTimeAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): DayAndTimeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayAndTimeAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class DayAndTimeAssignedTargetingOptionDetailsOps[Self <: DayAndTimeAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setDayOfWeek(value: String): Self = this.set("dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDayOfWeek: Self = this.set("dayOfWeek", js.undefined)
    
    @scala.inline
    def setEndHour(value: Double): Self = this.set("endHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndHour: Self = this.set("endHour", js.undefined)
    
    @scala.inline
    def setStartHour(value: Double): Self = this.set("startHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartHour: Self = this.set("startHour", js.undefined)
    
    @scala.inline
    def setTimeZoneResolution(value: String): Self = this.set("timeZoneResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeZoneResolution: Self = this.set("timeZoneResolution", js.undefined)
  }
}
