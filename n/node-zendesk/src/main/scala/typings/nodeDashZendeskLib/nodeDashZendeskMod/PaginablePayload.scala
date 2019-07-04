package typings
package nodeDashZendeskLib.nodeDashZendeskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginablePayload extends js.Object {
  var count: scala.Double
  var next_page: scala.Double | scala.Null
  var previous_page: scala.Double | scala.Null
}

object PaginablePayload {
  @scala.inline
  def apply(
    count: scala.Double,
    next_page: scala.Int | scala.Double = null,
    previous_page: scala.Int | scala.Double = null
  ): PaginablePayload = {
    val __obj = js.Dynamic.literal(count = count)
    if (next_page != null) __obj.updateDynamic("next_page")(next_page.asInstanceOf[js.Any])
    if (previous_page != null) __obj.updateDynamic("previous_page")(previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginablePayload]
  }
}

