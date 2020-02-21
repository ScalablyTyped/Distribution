package typings.octokitPluginRestEndpointMethods

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonInvitationidOwnerPermissions extends js.Object {
  var invitation_id: AnonRequired
  var owner: AnonRequired
  var permissions: AnonEnum
  var repo: AnonRequired
}

object AnonInvitationidOwnerPermissions {
  @scala.inline
  def apply(invitation_id: AnonRequired, owner: AnonRequired, permissions: AnonEnum, repo: AnonRequired): AnonInvitationidOwnerPermissions = {
    val __obj = js.Dynamic.literal(invitation_id = invitation_id.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repo = repo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonInvitationidOwnerPermissions]
  }
}

