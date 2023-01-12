package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookingStaffMember
  extends StObject
     with Entity {
  
  /**
    * True means that if the staff member is a Microsoft 365 user, the Bookings API would verify the staff member's
    * availability in their personal calendar in Microsoft 365, before making a booking.
    */
  var availabilityIsAffectedByPersonalCalendar: js.UndefOr[Boolean] = js.undefined
  
  // The display name is suitable for human-readable interfaces.
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the staff member. This can be in the same Microsoft 365 tenant as the business, or in a different
    * email domain. This email address can be used if the sendConfirmationsToOwner property is set to true in the scheduling
    * policy of the business. Required.
    */
  var emailAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The role of the staff member in the business. Possible values are: guest, administrator, viewer, externalGuest,
    * unknownFutureValue, scheduler and member. Note that you must use the Prefer: include-unknown-enum-members request
    * header to get the following value(s) in this evolvable enum: scheduler, member. Required.
    */
  var role: js.UndefOr[BookingStaffRole] = js.undefined
  
  // The time zone of the staff member. For a list of possible values, see dateTimeTimeZone.
  var timeZone: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * True means the staff member's availability is as specified in the businessHours property of the business. False means
    * the availability is determined by the staff member's workingHours property setting.
    */
  var useBusinessHours: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The range of hours each day of the week that the staff member is available for booking. By default, they are
    * initialized to be the same as the businessHours property of the business.
    */
  var workingHours: js.UndefOr[NullableOption[js.Array[BookingWorkHours]]] = js.undefined
}
object BookingStaffMember {
  
  inline def apply(): BookingStaffMember = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookingStaffMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BookingStaffMember] (val x: Self) extends AnyVal {
    
    inline def setAvailabilityIsAffectedByPersonalCalendar(value: Boolean): Self = StObject.set(x, "availabilityIsAffectedByPersonalCalendar", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityIsAffectedByPersonalCalendarUndefined: Self = StObject.set(x, "availabilityIsAffectedByPersonalCalendar", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setRole(value: BookingStaffRole): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTimeZone(value: NullableOption[String]): Self = StObject.set(x, "timeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneNull: Self = StObject.set(x, "timeZone", null)
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "timeZone", js.undefined)
    
    inline def setUseBusinessHours(value: Boolean): Self = StObject.set(x, "useBusinessHours", value.asInstanceOf[js.Any])
    
    inline def setUseBusinessHoursUndefined: Self = StObject.set(x, "useBusinessHours", js.undefined)
    
    inline def setWorkingHours(value: NullableOption[js.Array[BookingWorkHours]]): Self = StObject.set(x, "workingHours", value.asInstanceOf[js.Any])
    
    inline def setWorkingHoursNull: Self = StObject.set(x, "workingHours", null)
    
    inline def setWorkingHoursUndefined: Self = StObject.set(x, "workingHours", js.undefined)
    
    inline def setWorkingHoursVarargs(value: BookingWorkHours*): Self = StObject.set(x, "workingHours", js.Array(value*))
  }
}
