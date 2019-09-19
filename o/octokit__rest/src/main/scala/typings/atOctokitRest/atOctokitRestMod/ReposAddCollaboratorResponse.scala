package typings.atOctokitRest.atOctokitRestMod

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
    val __obj = js.Dynamic.literal(created_at = created_at, html_url = html_url, id = id, invitee = invitee, inviter = inviter, permissions = permissions, repository = repository, url = url)
  
    __obj.asInstanceOf[ReposAddCollaboratorResponse]
  }
}

