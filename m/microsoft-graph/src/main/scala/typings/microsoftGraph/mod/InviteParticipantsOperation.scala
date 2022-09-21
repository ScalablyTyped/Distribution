package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InviteParticipantsOperation
  extends StObject
     with CommsOperation {
  
  // The participants to invite.
  var participants: js.UndefOr[js.Array[InvitationParticipantInfo]] = js.undefined
}
object InviteParticipantsOperation {
  
  inline def apply(): InviteParticipantsOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteParticipantsOperation]
  }
  
  extension [Self <: InviteParticipantsOperation](x: Self) {
    
    inline def setParticipants(value: js.Array[InvitationParticipantInfo]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    inline def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
    
    inline def setParticipantsVarargs(value: InvitationParticipantInfo*): Self = StObject.set(x, "participants", js.Array(value*))
  }
}
