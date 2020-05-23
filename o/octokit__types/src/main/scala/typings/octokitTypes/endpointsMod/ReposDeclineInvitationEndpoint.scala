package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposDeclineInvitationEndpoint extends js.Object {
  var invitation_id: Double
}

object ReposDeclineInvitationEndpoint {
  @scala.inline
  def apply(invitation_id: Double): ReposDeclineInvitationEndpoint = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposDeclineInvitationEndpoint]
  }
}

