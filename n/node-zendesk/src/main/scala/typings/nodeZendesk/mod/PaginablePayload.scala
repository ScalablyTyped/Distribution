package typings.nodeZendesk.mod

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
  def apply(
    count: Double,
    next_page: Double = null.asInstanceOf[Double],
    previous_page: Double = null.asInstanceOf[Double]
  ): PaginablePayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], previous_page = previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginablePayload]
  }
}

