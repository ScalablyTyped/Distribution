package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParticipantLeftNotification
  extends StObject
     with Entity {
  
  var call: js.UndefOr[NullableOption[Call]] = js.undefined
  
  // ID of the participant under the policy who has left the meeting.
  var participantId: js.UndefOr[String] = js.undefined
}
object ParticipantLeftNotification {
  
  inline def apply(): ParticipantLeftNotification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParticipantLeftNotification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParticipantLeftNotification] (val x: Self) extends AnyVal {
    
    inline def setCall(value: NullableOption[Call]): Self = StObject.set(x, "call", value.asInstanceOf[js.Any])
    
    inline def setCallNull: Self = StObject.set(x, "call", null)
    
    inline def setCallUndefined: Self = StObject.set(x, "call", js.undefined)
    
    inline def setParticipantId(value: String): Self = StObject.set(x, "participantId", value.asInstanceOf[js.Any])
    
    inline def setParticipantIdUndefined: Self = StObject.set(x, "participantId", js.undefined)
  }
}
