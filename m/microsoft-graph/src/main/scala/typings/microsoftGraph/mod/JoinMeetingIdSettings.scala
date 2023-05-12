package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinMeetingIdSettings extends StObject {
  
  // Indicates whether a passcode is required to join a meeting when using joinMeetingId. Optional.
  var isPasscodeRequired: js.UndefOr[NullableOption[Boolean]] = js.undefined
  
  // The meeting ID to be used to join a meeting. Optional. Read-only.
  var joinMeetingId: js.UndefOr[NullableOption[String]] = js.undefined
  
  // The passcode to join a meeting. Optional. Read-only.
  var passcode: js.UndefOr[NullableOption[String]] = js.undefined
}
object JoinMeetingIdSettings {
  
  inline def apply(): JoinMeetingIdSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JoinMeetingIdSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JoinMeetingIdSettings] (val x: Self) extends AnyVal {
    
    inline def setIsPasscodeRequired(value: NullableOption[Boolean]): Self = StObject.set(x, "isPasscodeRequired", value.asInstanceOf[js.Any])
    
    inline def setIsPasscodeRequiredNull: Self = StObject.set(x, "isPasscodeRequired", null)
    
    inline def setIsPasscodeRequiredUndefined: Self = StObject.set(x, "isPasscodeRequired", js.undefined)
    
    inline def setJoinMeetingId(value: NullableOption[String]): Self = StObject.set(x, "joinMeetingId", value.asInstanceOf[js.Any])
    
    inline def setJoinMeetingIdNull: Self = StObject.set(x, "joinMeetingId", null)
    
    inline def setJoinMeetingIdUndefined: Self = StObject.set(x, "joinMeetingId", js.undefined)
    
    inline def setPasscode(value: NullableOption[String]): Self = StObject.set(x, "passcode", value.asInstanceOf[js.Any])
    
    inline def setPasscodeNull: Self = StObject.set(x, "passcode", null)
    
    inline def setPasscodeUndefined: Self = StObject.set(x, "passcode", js.undefined)
  }
}
