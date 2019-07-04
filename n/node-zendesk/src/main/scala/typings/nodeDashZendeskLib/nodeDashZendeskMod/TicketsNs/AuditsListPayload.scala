package typings
package nodeDashZendeskLib.nodeDashZendeskMod.TicketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuditsListPayload
  extends nodeDashZendeskLib.nodeDashZendeskMod.PaginablePayload {
  val audits: js.Array[Audit]
}

object AuditsListPayload {
  @scala.inline
  def apply(
    audits: js.Array[Audit],
    count: scala.Double,
    next_page: scala.Int | scala.Double = null,
    previous_page: scala.Int | scala.Double = null
  ): AuditsListPayload = {
    val __obj = js.Dynamic.literal(audits = audits, count = count)
    if (next_page != null) __obj.updateDynamic("next_page")(next_page.asInstanceOf[js.Any])
    if (previous_page != null) __obj.updateDynamic("previous_page")(previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditsListPayload]
  }
}

