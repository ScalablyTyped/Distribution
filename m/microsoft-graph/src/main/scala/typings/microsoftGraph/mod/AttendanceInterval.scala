package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttendanceInterval extends StObject {
  
  // Duration of the meeting interval in seconds; that is, the difference between joinDateTime and leaveDateTime.
  var durationInSeconds: js.UndefOr[NullableOption[Double]] = js.undefined
  
  // The time the attendee joined in UTC.
  var joinDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The time the attendee left in UTC.
  var leaveDateTime: js.UndefOr[NullableOption[String]] = js.undefined
}
object AttendanceInterval {
  
  inline def apply(): AttendanceInterval = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttendanceInterval]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttendanceInterval] (val x: Self) extends AnyVal {
    
    inline def setDurationInSeconds(value: NullableOption[Double]): Self = StObject.set(x, "durationInSeconds", value.asInstanceOf[js.Any])
    
    inline def setDurationInSecondsNull: Self = StObject.set(x, "durationInSeconds", null)
    
    inline def setDurationInSecondsUndefined: Self = StObject.set(x, "durationInSeconds", js.undefined)
    
    inline def setJoinDateTime(value: NullableOption[String]): Self = StObject.set(x, "joinDateTime", value.asInstanceOf[js.Any])
    
    inline def setJoinDateTimeNull: Self = StObject.set(x, "joinDateTime", null)
    
    inline def setJoinDateTimeUndefined: Self = StObject.set(x, "joinDateTime", js.undefined)
    
    inline def setLeaveDateTime(value: NullableOption[String]): Self = StObject.set(x, "leaveDateTime", value.asInstanceOf[js.Any])
    
    inline def setLeaveDateTimeNull: Self = StObject.set(x, "leaveDateTime", null)
    
    inline def setLeaveDateTimeUndefined: Self = StObject.set(x, "leaveDateTime", js.undefined)
  }
}
