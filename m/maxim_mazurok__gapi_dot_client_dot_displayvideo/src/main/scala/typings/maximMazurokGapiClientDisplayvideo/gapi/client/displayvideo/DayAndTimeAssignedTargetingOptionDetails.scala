package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DayAndTimeAssignedTargetingOptionDetails extends StObject {
  
  /** Required. The day of the week for this day and time targeting setting. */
  var dayOfWeek: js.UndefOr[String] = js.undefined
  
  /** Required. The end hour for day and time targeting. Must be between 1 (1 hour after start of day) and 24 (end of day). */
  var endHour: js.UndefOr[Double] = js.undefined
  
  /** Required. The start hour for day and time targeting. Must be between 0 (start of day) and 23 (1 hour before end of day). */
  var startHour: js.UndefOr[Double] = js.undefined
  
  /** Required. The mechanism used to determine which timezone to use for this day and time targeting setting. */
  var timeZoneResolution: js.UndefOr[String] = js.undefined
}
object DayAndTimeAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): DayAndTimeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DayAndTimeAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class DayAndTimeAssignedTargetingOptionDetailsMutableBuilder[Self <: DayAndTimeAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDayOfWeek(value: String): Self = StObject.set(x, "dayOfWeek", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDayOfWeekUndefined: Self = StObject.set(x, "dayOfWeek", js.undefined)
    
    @scala.inline
    def setEndHour(value: Double): Self = StObject.set(x, "endHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndHourUndefined: Self = StObject.set(x, "endHour", js.undefined)
    
    @scala.inline
    def setStartHour(value: Double): Self = StObject.set(x, "startHour", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartHourUndefined: Self = StObject.set(x, "startHour", js.undefined)
    
    @scala.inline
    def setTimeZoneResolution(value: String): Self = StObject.set(x, "timeZoneResolution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeZoneResolutionUndefined: Self = StObject.set(x, "timeZoneResolution", js.undefined)
  }
}
