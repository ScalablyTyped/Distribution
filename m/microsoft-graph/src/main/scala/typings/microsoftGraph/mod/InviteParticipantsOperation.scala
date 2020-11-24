package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InviteParticipantsOperation extends CommsOperation {
  
  // The participants to invite.
  var participants: js.UndefOr[js.Array[InvitationParticipantInfo]] = js.native
}
object InviteParticipantsOperation {
  
  @scala.inline
  def apply(): InviteParticipantsOperation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InviteParticipantsOperation]
  }
  
  @scala.inline
  implicit class InviteParticipantsOperationOps[Self <: InviteParticipantsOperation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParticipantsVarargs(value: InvitationParticipantInfo*): Self = this.set("participants", js.Array(value :_*))
    
    @scala.inline
    def setParticipants(value: js.Array[InvitationParticipantInfo]): Self = this.set("participants", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParticipants: Self = this.set("participants", js.undefined)
  }
}
