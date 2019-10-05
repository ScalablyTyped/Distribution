package typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Comments

import typings.nodeDashZendesk.nodeDashZendeskMod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPayload extends PaginablePayload {
  var comments: js.Array[typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Comments.ResponseModel]
}

object ListPayload {
  @scala.inline
  def apply(
    comments: js.Array[typings.nodeDashZendesk.nodeDashZendeskMod.Tickets.Comments.ResponseModel],
    count: Double,
    next_page: Int | Double = null,
    previous_page: Int | Double = null
  ): ListPayload = {
    val __obj = js.Dynamic.literal(comments = comments, count = count)
    if (next_page != null) __obj.updateDynamic("next_page")(next_page.asInstanceOf[js.Any])
    if (previous_page != null) __obj.updateDynamic("previous_page")(previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
}

