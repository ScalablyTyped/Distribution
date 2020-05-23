package typings.nodeZendesk.mod.Tickets.Comments

import typings.nodeZendesk.mod.PaginablePayload
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPayload extends PaginablePayload {
  var comments: js.Array[ResponseModel]
}

object ListPayload {
  @scala.inline
  def apply(
    comments: js.Array[ResponseModel],
    count: Double,
    next_page: Double = null.asInstanceOf[Double],
    previous_page: Double = null.asInstanceOf[Double]
  ): ListPayload = {
    val __obj = js.Dynamic.literal(comments = comments.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], next_page = next_page.asInstanceOf[js.Any], previous_page = previous_page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPayload]
  }
}

