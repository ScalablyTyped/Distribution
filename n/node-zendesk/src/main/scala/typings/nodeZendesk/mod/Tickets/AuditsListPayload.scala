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
    next_page: Double = null.asInstanceOf[Double],
    previous_page: Double = null.asInstanceOf[Double]
  ): AuditsListPayload = {
    val __obj = js.Dynamic.literal(audits = audits.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], previous_page = previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuditsListPayload]
  }
}

