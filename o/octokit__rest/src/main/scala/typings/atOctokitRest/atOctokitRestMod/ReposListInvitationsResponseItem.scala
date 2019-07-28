package typings.atOctokitRest.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListInvitationsResponseItem extends js.Object {
  var created_at: String
  var html_url: String
  var id: Double
  var invitee: ReposListInvitationsResponseItemInvitee
  var inviter: ReposListInvitationsResponseItemInviter
  var permissions: String
  var repository: ReposListInvitationsResponseItemRepository
  var url: String
}

object ReposListInvitationsResponseItem {
  @scala.inline
  def apply(
    created_at: String,
    html_url: String,
    id: Double,
    invitee: ReposListInvitationsResponseItemInvitee,
    inviter: ReposListInvitationsResponseItemInviter,
    permissions: String,
    repository: ReposListInvitationsResponseItemRepository,
    url: String
  ): ReposListInvitationsResponseItem = {
    val __obj = js.Dynamic.literal(created_at = created_at, html_url = html_url, id = id, invitee = invitee, inviter = inviter, permissions = permissions, repository = repository, url = url)
  
    __obj.asInstanceOf[ReposListInvitationsResponseItem]
  }
}

