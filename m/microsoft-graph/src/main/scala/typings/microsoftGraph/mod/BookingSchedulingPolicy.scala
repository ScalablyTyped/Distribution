package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingSchedulingPolicy extends StObject {
  
  // True if to allow customers to choose a specific person for the booking.
  var allowStaffSelection: js.UndefOr[Boolean] = js.undefined
  
  // Maximum number of days in advance that a booking can be made. It follows the ISO 8601 format.
  var maximumAdvance: js.UndefOr[String] = js.undefined
  
  // The minimum amount of time before which bookings and cancellations must be made. It follows the ISO 8601 format.
  var minimumLeadTime: js.UndefOr[String] = js.undefined
  
  /**
    * True to notify the business via email when a booking is created or changed. Use the email address specified in the
    * email property of the bookingBusiness entity for the business.
    */
  var sendConfirmationsToOwner: js.UndefOr[Boolean] = js.undefined
  
  // Duration of each time slot, denoted in ISO 8601 format.
  var timeSlotInterval: js.UndefOr[String] = js.undefined
}
object BookingSchedulingPolicy {
  
  inline def apply(): BookingSchedulingPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingSchedulingPolicy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookingSchedulingPolicy] (val x: Self) extends AnyVal {
    
    inline def setAllowStaffSelection(value: Boolean): Self = StObject.set(x, "allowStaffSelection", value.asInstanceOf[js.Any])
    
    inline def setAllowStaffSelectionUndefined: Self = StObject.set(x, "allowStaffSelection", js.undefined)
    
    inline def setMaximumAdvance(value: String): Self = StObject.set(x, "maximumAdvance", value.asInstanceOf[js.Any])
    
    inline def setMaximumAdvanceUndefined: Self = StObject.set(x, "maximumAdvance", js.undefined)
    
    inline def setMinimumLeadTime(value: String): Self = StObject.set(x, "minimumLeadTime", value.asInstanceOf[js.Any])
    
    inline def setMinimumLeadTimeUndefined: Self = StObject.set(x, "minimumLeadTime", js.undefined)
    
    inline def setSendConfirmationsToOwner(value: Boolean): Self = StObject.set(x, "sendConfirmationsToOwner", value.asInstanceOf[js.Any])
    
    inline def setSendConfirmationsToOwnerUndefined: Self = StObject.set(x, "sendConfirmationsToOwner", js.undefined)
    
    inline def setTimeSlotInterval(value: String): Self = StObject.set(x, "timeSlotInterval", value.asInstanceOf[js.Any])
    
    inline def setTimeSlotIntervalUndefined: Self = StObject.set(x, "timeSlotInterval", js.undefined)
  }
}
