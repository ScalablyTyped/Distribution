package typings.octokitTypes.endpointsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAcceptInvitationEndpoint extends js.Object {
  var invitation_id: Double
}

object ReposAcceptInvitationEndpoint {
  @scala.inline
  def apply(invitation_id: Double): ReposAcceptInvitationEndpoint = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReposAcceptInvitationEndpoint]
  }
}

