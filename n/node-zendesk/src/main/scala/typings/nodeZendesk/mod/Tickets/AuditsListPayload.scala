package typings.nodeZendesk.mod.Tickets

import typings.nodeZendesk.mod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditsListPayload extends PaginablePayload {
  val audits: js.Array[Audit]
}

object AuditsListPayload {
  @scala.inline
  def apply(
    audits: js.Array[Audit],
    count: Double,
    next_page: Int | Double = null,
    previous_page: Int | Double = null
  ): AuditsListPayload = {
    val __obj = js.Dynamic.literal(audits = audits.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any])
    if (next_page != null) __obj.updateDynamic("next_page")(next_page.asInstanceOf[js.Any])
    if (previous_page != null) __obj.updateDynamic("previous_page")(previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditsListPayload]
  }
}

