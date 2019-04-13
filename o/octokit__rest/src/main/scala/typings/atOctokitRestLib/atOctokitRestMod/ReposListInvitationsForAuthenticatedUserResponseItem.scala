package typings
package atOctokitRestLib.atOctokitRestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReposListInvitationsForAuthenticatedUserResponseItem extends js.Object {
  var created_at: java.lang.String
  var html_url: java.lang.String
  var id: scala.Double
  var invitee: ReposListInvitationsForAuthenticatedUserResponseItemInvitee
  var inviter: ReposListInvitationsForAuthenticatedUserResponseItemInviter
  var permissions: java.lang.String
  var repository: ReposListInvitationsForAuthenticatedUserResponseItemRepository
  var url: java.lang.String
}

object ReposListInvitationsForAuthenticatedUserResponseItem {
  @scala.inline
  def apply(
    created_at: java.lang.String,
    html_url: java.lang.String,
    id: scala.Double,
    invitee: ReposListInvitationsForAuthenticatedUserResponseItemInvitee,
    inviter: ReposListInvitationsForAuthenticatedUserResponseItemInviter,
    permissions: java.lang.String,
    repository: ReposListInvitationsForAuthenticatedUserResponseItemRepository,
    url: java.lang.String
  ): ReposListInvitationsForAuthenticatedUserResponseItem = {
    val __obj = js.Dynamic.literal(created_at = created_at, html_url = html_url, id = id, invitee = invitee, inviter = inviter, permissions = permissions, repository = repository, url = url)
  
    __obj.asInstanceOf[ReposListInvitationsForAuthenticatedUserResponseItem]
  }
}

