package typings.nodeDashZendesk.nodeDashZendeskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginablePayload extends js.Object {
  var count: Double
  var next_page: Double | Null
  var previous_page: Double | Null
}

object PaginablePayload {
  @scala.inline
  def apply(count: Double, next_page: Int | Double = null, previous_page: Int | Double = null): PaginablePayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (next_page != null) __obj.updateDynamic("next_page")(next_page.asInstanceOf[js.Any])
    if (previous_page != null) __obj.updateDynamic("previous_page")(previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginablePayload]
  }
}

