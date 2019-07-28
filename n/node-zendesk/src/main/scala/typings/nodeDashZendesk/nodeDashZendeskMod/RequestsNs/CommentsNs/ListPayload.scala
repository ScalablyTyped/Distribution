package typings.nodeDashZendesk.nodeDashZendeskMod.RequestsNs.CommentsNs

import typings.nodeDashZendesk.nodeDashZendeskMod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPayload extends PaginablePayload {
  var comments: js.Array[typings.nodeDashZendesk.nodeDashZendeskMod.RequestsNs.CommentsNs.ResponseModel]
  var organizations: js.Array[
    typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.CommentsNs.OrganizationsNs.ResponseModel
  ]
  var users: js.Array[
    typings.nodeDashZendesk.nodeDashZendeskMod.RequestsNs.CommentsNs.CommentsUsersNs.ResponseModel
  ]
}

object ListPayload {
  @scala.inline
  def apply(
    comments: js.Array[typings.nodeDashZendesk.nodeDashZendeskMod.RequestsNs.CommentsNs.ResponseModel],
    count: Double,
    organizations: js.Array[
      typings.nodeDashZendesk.nodeDashZendeskMod.TicketsNs.CommentsNs.OrganizationsNs.ResponseModel
    ],
    users: js.Array[
      typings.nodeDashZendesk.nodeDashZendeskMod.RequestsNs.CommentsNs.CommentsUsersNs.ResponseModel
    ],
    next_page: Int | Double = null,
    previous_page: Int | Double = null
  ): ListPayload = {
    val __obj = js.Dynamic.literal(comments = comments, count = count, organizations = organizations, users = users)
    if (next_page != null) __obj.updateDynamic("next_page")(next_page.asInstanceOf[js.Any])
    if (previous_page != null) __obj.updateDynamic("previous_page")(previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
}

