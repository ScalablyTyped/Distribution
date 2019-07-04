package typings
package nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPayload
  extends nodeDashZendeskLib.nodeDashZendeskMod.PaginablePayload {
  var comments: js.Array[ResponseModel]
  var organizations: js.Array[
    nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.CommentsNs.OrganizationsNs.ResponseModel
  ]
  var users: js.Array[
    nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.CommentsUsersNs.ResponseModel
  ]
}

object ListPayload {
  @scala.inline
  def apply(
    comments: js.Array[ResponseModel],
    count: scala.Double,
    organizations: js.Array[
      nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs.CommentsNs.OrganizationsNs.ResponseModel
    ],
    users: js.Array[
      nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs.CommentsUsersNs.ResponseModel
    ],
    next_page: scala.Int | scala.Double = null,
    previous_page: scala.Int | scala.Double = null
  ): ListPayload = {
    val __obj = js.Dynamic.literal(comments = comments, count = count, organizations = organizations, users = users)
    if (next_page != null) __obj.updateDynamic("next_page")(next_page.asInstanceOf[js.Any])
    if (previous_page != null) __obj.updateDynamic("previous_page")(previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
}

