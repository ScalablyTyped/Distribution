package typings.nodeZendesk.mod.Users.Identities

import typings.nodeZendesk.mod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPayload extends PaginablePayload {
  val identities: js.Array[ResponseModel]
}

object ListPayload {
  @scala.inline
  def apply(
    count: Double,
    identities: js.Array[ResponseModel],
    next_page: Double = null.asInstanceOf[Double],
    previous_page: Double = null.asInstanceOf[Double]
  ): ListPayload = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], identities = identities.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], previous_page = previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
}

