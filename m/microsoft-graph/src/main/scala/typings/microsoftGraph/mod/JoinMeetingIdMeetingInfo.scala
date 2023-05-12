package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinMeetingIdMeetingInfo
  extends StObject
     with MeetingInfo {
  
  // The ID used to join the meeting.
  var joinMeetingId: js.UndefOr[String] = js.undefined
  
  // The passcode used to join the meeting. Optional.
  var passcode: js.UndefOr[NullableOption[String]] = js.undefined
}
object JoinMeetingIdMeetingInfo {
  
  inline def apply(): JoinMeetingIdMeetingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoinMeetingIdMeetingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JoinMeetingIdMeetingInfo] (val x: Self) extends AnyVal {
    
    inline def setJoinMeetingId(value: String): Self = StObject.set(x, "joinMeetingId", value.asInstanceOf[js.Any])
    
    inline def setJoinMeetingIdUndefined: Self = StObject.set(x, "joinMeetingId", js.undefined)
    
    inline def setPasscode(value: NullableOption[String]): Self = StObject.set(x, "passcode", value.asInstanceOf[js.Any])
    
    inline def setPasscodeNull: Self = StObject.set(x, "passcode", null)
    
    inline def setPasscodeUndefined: Self = StObject.set(x, "passcode", js.undefined)
  }
}
