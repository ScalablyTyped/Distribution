package typings.octokitRest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateInvitationResponse extends js.Object {
  var created_at: String
  var html_url: String
  var id: Double
  var invitee: ReposUpdateInvitationResponseInvitee
  var inviter: ReposUpdateInvitationResponseInviter
  var permissions: String
  var repository: ReposUpdateInvitationResponseRepository
  var url: String
}

object ReposUpdateInvitationResponse {
  @scala.inline
  def apply(
    created_at: String,
    html_url: String,
    id: Double,
    invitee: ReposUpdateInvitationResponseInvitee,
    inviter: ReposUpdateInvitationResponseInviter,
    permissions: String,
    repository: ReposUpdateInvitationResponseRepository,
    url: String
  ): ReposUpdateInvitationResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at.asInstanceOf[js.Any], html_url = html_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], invitee = invitee.asInstanceOf[js.Any], inviter = inviter.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReposUpdateInvitationResponse]
  }
}

