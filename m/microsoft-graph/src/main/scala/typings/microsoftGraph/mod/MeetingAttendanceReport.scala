package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeetingAttendanceReport
  extends StObject
     with Entity {
  
  // List of attendance records of an attendance report. Read-only.
  var attendanceRecords: js.UndefOr[NullableOption[js.Array[AttendanceRecord]]] = js.undefined
  
  // UTC time when the meeting ended. Read-only.
  var meetingEndDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // UTC time when the meeting started. Read-only.
  var meetingStartDateTime: js.UndefOr[NullableOption[String]] = js.undefined
  
  // Total number of participants. Read-only.
  var totalParticipantCount: js.UndefOr[NullableOption[Double]] = js.undefined
}
object MeetingAttendanceReport {
  
  inline def apply(): MeetingAttendanceReport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeetingAttendanceReport]
  }
  
  extension [Self <: MeetingAttendanceReport](x: Self) {
    
    inline def setAttendanceRecords(value: NullableOption[js.Array[AttendanceRecord]]): Self = StObject.set(x, "attendanceRecords", value.asInstanceOf[js.Any])
    
    inline def setAttendanceRecordsNull: Self = StObject.set(x, "attendanceRecords", null)
    
    inline def setAttendanceRecordsUndefined: Self = StObject.set(x, "attendanceRecords", js.undefined)
    
    inline def setAttendanceRecordsVarargs(value: AttendanceRecord*): Self = StObject.set(x, "attendanceRecords", js.Array(value*))
    
    inline def setMeetingEndDateTime(value: NullableOption[String]): Self = StObject.set(x, "meetingEndDateTime", value.asInstanceOf[js.Any])
    
    inline def setMeetingEndDateTimeNull: Self = StObject.set(x, "meetingEndDateTime", null)
    
    inline def setMeetingEndDateTimeUndefined: Self = StObject.set(x, "meetingEndDateTime", js.undefined)
    
    inline def setMeetingStartDateTime(value: NullableOption[String]): Self = StObject.set(x, "meetingStartDateTime", value.asInstanceOf[js.Any])
    
    inline def setMeetingStartDateTimeNull: Self = StObject.set(x, "meetingStartDateTime", null)
    
    inline def setMeetingStartDateTimeUndefined: Self = StObject.set(x, "meetingStartDateTime", js.undefined)
    
    inline def setTotalParticipantCount(value: NullableOption[Double]): Self = StObject.set(x, "totalParticipantCount", value.asInstanceOf[js.Any])
    
    inline def setTotalParticipantCountNull: Self = StObject.set(x, "totalParticipantCount", null)
    
    inline def setTotalParticipantCountUndefined: Self = StObject.set(x, "totalParticipantCount", js.undefined)
  }
}
