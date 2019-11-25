package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InviteParticipantsOperation extends CommsOperation {
  var participants: js.UndefOr[js.Array[InvitationParticipantInfo]] = js.undefined
}

object InviteParticipantsOperation {
  @scala.inline
  def apply(
    clientContext: String = null,
    id: String = null,
    participants: js.Array[InvitationParticipantInfo] = null,
    resultInfo: ResultInfo = null,
    status: OperationStatus = null
  ): InviteParticipantsOperation = {
    val __obj = js.Dynamic.literal()
    if (clientContext != null) __obj.updateDynamic("clientContext")(clientContext.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (participants != null) __obj.updateDynamic("participants")(participants.asInstanceOf[js.Any])
    if (resultInfo != null) __obj.updateDynamic("resultInfo")(resultInfo.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[InviteParticipantsOperation]
  }
}

