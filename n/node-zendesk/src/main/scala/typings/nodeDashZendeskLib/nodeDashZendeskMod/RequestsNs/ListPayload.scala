package typings
package nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPayload
  extends nodeDashZendeskLib.nodeDashZendeskMod.PaginablePayload {
  val requests: js.Array[ResponseModel]
}

object ListPayload {
  @scala.inline
  def apply(
    count: scala.Double,
    requests: js.Array[ResponseModel],
    next_page: scala.Int | scala.Double = null,
    previous_page: scala.Int | scala.Double = null
  ): ListPayload = {
    val __obj = js.Dynamic.literal(count = count, requests = requests)
    if (next_page != null) __obj.updateDynamic("next_page")(next_page.asInstanceOf[js.Any])
    if (previous_page != null) __obj.updateDynamic("previous_page")(previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
}

