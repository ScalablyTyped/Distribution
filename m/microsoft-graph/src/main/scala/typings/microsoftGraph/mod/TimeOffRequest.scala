package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeOffRequest
  extends StObject
     with ScheduleChangeRequest {
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var endDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  /**
    * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example,
    * midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z
    */
  var startDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The reason for the time off.
  var timeOffReasonId: js.UndefOr[NullableOption[String]] = js.undefined
}
object TimeOffRequest {
  
  inline def apply(): TimeOffRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeOffRequest]
  }
  
  extension [Self <: TimeOffRequest](x: Self) {
    
    inline def setEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "endDateTime", value.asInstanceOf[js.Any])
    
    inline def setEndDateTimeNull: Self = StObject.set(x, "endDateTime", null)
    
    inline def setEndDateTimeUndefined: Self = StObject.set(x, "endDateTime", js.undefined)
    
    inline def setStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "startDateTime", value.asInstanceOf[js.Any])
    
    inline def setStartDateTimeNull: Self = StObject.set(x, "startDateTime", null)
    
    inline def setStartDateTimeUndefined: Self = StObject.set(x, "startDateTime", js.undefined)
    
    inline def setTimeOffReasonId(value: NullableOption[String]): Self = StObject.set(x, "timeOffReasonId", value.asInstanceOf[js.Any])
    
    inline def setTimeOffReasonIdNull: Self = StObject.set(x, "timeOffReasonId", null)
    
    inline def setTimeOffReasonIdUndefined: Self = StObject.set(x, "timeOffReasonId", js.undefined)
  }
}
