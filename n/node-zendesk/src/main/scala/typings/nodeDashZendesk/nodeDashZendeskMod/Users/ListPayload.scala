package typings.nodeDashZendesk.nodeDashZendeskMod.Users

import typings.nodeDashZendesk.nodeDashZendeskMod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPayload extends PaginablePayload {
  var users: js.Array[ResponseModel]
}

object ListPayload {
  @scala.inline
  def apply(
    count: Double,
    users: js.Array[ResponseModel],
    next_page: Int | Double = null,
    previous_page: Int | Double = null
  ): ListPayload = {
    val __obj = js.Dynamic.literal(count = count, users = users)
    if (next_page != null) __obj.updateDynamic("next_page")(next_page.asInstanceOf[js.Any])
    if (previous_page != null) __obj.updateDynamic("previous_page")(previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
}

