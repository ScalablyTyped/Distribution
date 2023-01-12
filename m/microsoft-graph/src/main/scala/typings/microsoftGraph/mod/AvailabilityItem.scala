package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailabilityItem extends StObject {
  
  // The end time of the time slot.
  var endDateTime: js.UndefOr[DateTimeTimeZone] = js.undefined
  
  /**
    * Indicates the service ID in case of 1:n appointments. If the appointment is of type 1:n, this field will be present,
    * otherwise, null.
    */
  var serviceId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The start time of the time slot.
  var startDateTime: js.UndefOr[DateTimeTimeZone] = js.undefined
  
  // The status of the staff member. Possible values are: available, busy, slotsAvailable, outOfOffice, unknownFutureValue.
  var status: js.UndefOr[NullableOption[BookingsAvailabilityStatus]] = js.undefined
}
object AvailabilityItem {
  
  inline def apply(): AvailabilityItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailabilityItem] (val x: Self) extends AnyVal {
    
    inline def setEndDateTime(value: DateTimeTimeZone): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setServiceId(value: NullableOption[String]): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
    
    inline def setServiceIdNull: Self = StObject.set(x, "serviceId", null)
    
    inline def setServiceIdUndefined: Self = StObject.set(x, "serviceId", js.undefined)
    
    inline def setStartDateTime(value: DateTimeTimeZone): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setStatus(value: NullableOption[BookingsAvailabilityStatus]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusNull: Self = StObject.set(x, "status", null)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
