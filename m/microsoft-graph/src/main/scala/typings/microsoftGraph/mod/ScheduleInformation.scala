package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleInformation extends StObject {
  
  /**
    * Represents a merged view of availability of all the items in scheduleItems. The view consists of time slots.
    * Availability during each time slot is indicated with: 0= free, 1= tentative, 2= busy, 3= out of office, 4= working
    * elsewhere.
    */
  var availabilityView: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Error information from attempting to get the availability of the user, distribution list, or resource.
  var error: js.UndefOr[NullableOption[FreeBusyError]] = js.undefined
  
  // An SMTP address of the user, distribution list, or resource, identifying an instance of scheduleInformation.
  var scheduleId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Contains the items that describe the availability of the user or resource.
  var scheduleItems: js.UndefOr[NullableOption[js.Array[ScheduleItem]]] = js.undefined
  
  /**
    * The days of the week and hours in a specific time zone that the user works. These are set as part of the user's
    * mailboxSettings.
    */
  var workingHours: js.UndefOr[NullableOption[WorkingHours]] = js.undefined
}
object ScheduleInformation {
  
  inline def apply(): ScheduleInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleInformation]
  }
  
  extension [Self <: ScheduleInformation](x: Self) {
    
    inline def setAvailabilityView(value: NullableOption[String]): Self = StObject.set(x, "availabilityView", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityViewNull: Self = StObject.set(x, "availabilityView", null)
    
    inline def setAvailabilityViewUndefined: Self = StObject.set(x, "availabilityView", js.undefined)
    
    inline def setError(value: NullableOption[FreeBusyError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setScheduleId(value: NullableOption[String]): Self = StObject.set(x, "scheduleId", value.asInstanceOf[js.Any])
    
    inline def setScheduleIdNull: Self = StObject.set(x, "scheduleId", null)
    
    inline def setScheduleIdUndefined: Self = StObject.set(x, "scheduleId", js.undefined)
    
    inline def setScheduleItems(value: NullableOption[js.Array[ScheduleItem]]): Self = StObject.set(x, "scheduleItems", value.asInstanceOf[js.Any])
    
    inline def setScheduleItemsNull: Self = StObject.set(x, "scheduleItems", null)
    
    inline def setScheduleItemsUndefined: Self = StObject.set(x, "scheduleItems", js.undefined)
    
    inline def setScheduleItemsVarargs(value: ScheduleItem*): Self = StObject.set(x, "scheduleItems", js.Array(value :_*))
    
    inline def setWorkingHours(value: NullableOption[WorkingHours]): Self = StObject.set(x, "workingHours", value.asInstanceOf[js.Any])
    
    inline def setWorkingHoursNull: Self = StObject.set(x, "workingHours", null)
    
    inline def setWorkingHoursUndefined: Self = StObject.set(x, "workingHours", js.undefined)
  }
}
