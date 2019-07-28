package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListInvitationsForAuthenticatedUserResponseItem extends js.Object {
  var created_at: String
  var html_url: String
  var id: Double
  var invitee: ReposListInvitationsForAuthenticatedUserResponseItemInvitee
  var inviter: ReposListInvitationsForAuthenticatedUserResponseItemInviter
  var permissions: String
  var repository: ReposListInvitationsForAuthenticatedUserResponseItemRepository
  var url: String
}

object ReposListInvitationsForAuthenticatedUserResponseItem {
  @scala.inline
  def apply(
    created_at: String,
    html_url: String,
    id: Double,
    invitee: ReposListInvitationsForAuthenticatedUserResponseItemInvitee,
    inviter: ReposListInvitationsForAuthenticatedUserResponseItemInviter,
    permissions: String,
    repository: ReposListInvitationsForAuthenticatedUserResponseItemRepository,
    url: String
  ): ReposListInvitationsForAuthenticatedUserResponseItem = {
    val __obj = js.Dynamic.literal(created_at = created_at, html_url = html_url, id = id, invitee = invitee, inviter = inviter, permissions = permissions, repository = repository, url = url)
  
    __obj.asInstanceOf[ReposListInvitationsForAuthenticatedUserResponseItem]
  }
}

