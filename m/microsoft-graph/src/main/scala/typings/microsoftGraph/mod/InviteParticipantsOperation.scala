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
  
  @scala.inline
  def apply(): InviteParticipantsOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteParticipantsOperation]
  }
  
  @scala.inline
  implicit class InviteParticipantsOperationMutableBuilder[Self <: InviteParticipantsOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParticipants(value: js.Array[InvitationParticipantInfo]): Self = StObject.set(x, "participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParticipantsUndefined: Self = StObject.set(x, "participants", js.undefined)
    
    @scala.inline
    def setParticipantsVarargs(value: InvitationParticipantInfo*): Self = StObject.set(x, "participants", js.Array(value :_*))
  }
}
