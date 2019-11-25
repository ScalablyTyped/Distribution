package typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities

import typings.nodeDashZendesk.nodeDashZendeskMod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPayload extends PaginablePayload {
  val identities: js.Array[typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ResponseModel]
}

object ListPayload {
  @scala.inline
  def apply(
    count: Double,
    identities: js.Array[typings.nodeDashZendesk.nodeDashZendeskMod.Users.Identities.ResponseModel],
    next_page: Int | Double = null,
    previous_page: Int | Double = null
  ): ListPayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any])
    if (next_page != null) __obj.updateDynamic("next_page")(next_page.asInstanceOf[js.Any])
    if (previous_page != null) __obj.updateDynamic("previous_page")(previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
}

