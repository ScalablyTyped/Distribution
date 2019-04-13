package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposUpdateInvitationResponse extends js.Object {
  var created_at: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var invitee: ReposUpdateInvitationResponseInvitee
  var inviter: ReposUpdateInvitationResponseInviter
  var permissions: java.lang.String
  var repository: ReposUpdateInvitationResponseRepository
  var url: java.lang.String
}

object ReposUpdateInvitationResponse {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    invitee: ReposUpdateInvitationResponseInvitee,
    inviter: ReposUpdateInvitationResponseInviter,
    permissions: java.lang.String,
    repository: ReposUpdateInvitationResponseRepository,
    url: java.lang.String
  ): ReposUpdateInvitationResponse = {
    val __obj = js.Dynamic.literal(created_at = created_at, html_url = html_url, id = id, invitee = invitee, inviter = inviter, permissions = permissions, repository = repository, url = url)
  
    __obj.asInstanceOf[ReposUpdateInvitationResponse]
  }
}

