package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttendanceRecord
  extends StObject
     with Entity {
  
  // List of time periods between joining and leaving a meeting.
  var attendanceIntervals: js.UndefOr[NullableOption[js.Array[AttendanceInterval]]] = js.undefined
  
  // Email address of the user associated with this attendance record.
  var emailAddress: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Identity of the user associated with this attendance record.
  var identity: js.UndefOr[NullableOption[Identity]] = js.undefined
  
  // Role of the attendee. Possible values are: None, Attendee, Presenter, and Organizer.
  var role: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Total duration of the attendances in seconds.
  var totalAttendanceInSeconds: js.UndefOr[NullableOption[Double]] = js.undefined
}
object AttendanceRecord {
  
  inline def apply(): AttendanceRecord = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttendanceRecord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttendanceRecord] (val x: Self) extends AnyVal {
    
    inline def setAttendanceIntervals(value: NullableOption[js.Array[AttendanceInterval]]): Self = StObject.set(x, "attendanceIntervals", value.asInstanceOf[js.Any])
    
    inline def setAttendanceIntervalsNull: Self = StObject.set(x, "attendanceIntervals", null)
    
    inline def setAttendanceIntervalsUndefined: Self = StObject.set(x, "attendanceIntervals", js.undefined)
    
    inline def setAttendanceIntervalsVarargs(value: AttendanceInterval*): Self = StObject.set(x, "attendanceIntervals", js.Array(value*))
    
    inline def setEmailAddress(value: NullableOption[String]): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setEmailAddressNull: Self = StObject.set(x, "emailAddress", null)
    
    inline def setEmailAddressUndefined: Self = StObject.set(x, "emailAddress", js.undefined)
    
    inline def setIdentity(value: NullableOption[Identity]): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
    
    inline def setIdentityNull: Self = StObject.set(x, "identity", null)
    
    inline def setIdentityUndefined: Self = StObject.set(x, "identity", js.undefined)
    
    inline def setRole(value: NullableOption[String]): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setRoleNull: Self = StObject.set(x, "role", null)
    
    inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
    
    inline def setTotalAttendanceInSeconds(value: NullableOption[Double]): Self = StObject.set(x, "totalAttendanceInSeconds", value.asInstanceOf[js.Any])
    
    inline def setTotalAttendanceInSecondsNull: Self = StObject.set(x, "totalAttendanceInSeconds", null)
    
    inline def setTotalAttendanceInSecondsUndefined: Self = StObject.set(x, "totalAttendanceInSeconds", js.undefined)
  }
}
