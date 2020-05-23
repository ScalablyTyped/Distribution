package typings.nodeZendesk.mod.Requests

import typings.nodeZendesk.mod.PaginablePayload
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
    next_page: Double = null.asInstanceOf[Double],
    previous_page: Double = null.asInstanceOf[Double]
  ): ListPayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], previous_page = previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
}

