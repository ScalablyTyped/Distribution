package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListInvitationsResponseItem extends js.Object {
  var created_at: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var invitee: ReposListInvitationsResponseItemInvitee
  var inviter: ReposListInvitationsResponseItemInviter
  var permissions: java.lang.String
  var repository: ReposListInvitationsResponseItemRepository
  var url: java.lang.String
}

object ReposListInvitationsResponseItem {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    invitee: ReposListInvitationsResponseItemInvitee,
    inviter: ReposListInvitationsResponseItemInviter,
    permissions: java.lang.String,
    repository: ReposListInvitationsResponseItemRepository,
    url: java.lang.String
  ): ReposListInvitationsResponseItem = {
    val __obj = js.Dynamic.literal(created_at = created_at, html_url = html_url, id = id, invitee = invitee, inviter = inviter, permissions = permissions, repository = repository, url = url)
  
    __obj.asInstanceOf[ReposListInvitationsResponseItem]
  }
}

