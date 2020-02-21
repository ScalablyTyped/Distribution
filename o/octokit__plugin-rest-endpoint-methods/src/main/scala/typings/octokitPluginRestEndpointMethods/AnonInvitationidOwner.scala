package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvitationidOwner extends js.Object {
  var invitation_id: AnonRequired
  var owner: AnonRequired
  var repo: AnonRequired
}

object AnonInvitationidOwner {
  @scala.inline
  def apply(invitation_id: AnonRequired, owner: AnonRequired, repo: AnonRequired): AnonInvitationidOwner = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInvitationidOwner]
  }
}

