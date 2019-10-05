package typings.nodeDashZendesk.nodeDashZendeskMod.Requests

import typings.nodeDashZendesk.nodeDashZendeskMod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPayload extends PaginablePayload {
  val requests: js.Array[ResponseModel]
}

object ListPayload {
  @scala.inline
  def apply(
    count: Double,
    requests: js.Array[ResponseModel],
    next_page: Int | Double = null,
    previous_page: Int | Double = null
  ): ListPayload = {
    val __obj = js.Dynamic.literal(count = count, requests = requests)
    if (next_page != null) __obj.updateDynamic("next_page")(next_page.asInstanceOf[js.Any])
    if (previous_page != null) __obj.updateDynamic("previous_page")(previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
}

