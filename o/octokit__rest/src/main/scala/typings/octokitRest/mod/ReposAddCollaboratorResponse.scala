package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposAddCollaboratorResponse extends js.Object {
  var created_at: String
  var html_url: String
  var id: Double
  var invitee: ReposAddCollaboratorResponseInvitee
  var inviter: ReposAddCollaboratorResponseInviter
  var permissions: String
  var repository: ReposAddCollaboratorResponseRepository
  var url: String
}

object ReposAddCollaboratorResponse {
  @scala.inline
  def apply(
    created_at: String,
    html_url: String,
    id: Double,
    invitee: ReposAddCollaboratorResponseInvitee,
    inviter: ReposAddCollaboratorResponseInviter,
    permissions: String,
    repository: ReposAddCollaboratorResponseRepository,
    url: String
  ): ReposAddCollaboratorResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposAddCollaboratorResponse]
  }
}

