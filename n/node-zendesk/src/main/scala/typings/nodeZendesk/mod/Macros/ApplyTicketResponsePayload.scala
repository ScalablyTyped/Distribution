package typings.nodeZendesk.mod.Macros

import typings.nodeZendesk.anon.Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyTicketResponsePayload extends js.Object {
  var result: Comment
}

object ApplyTicketResponsePayload {
  @scala.inline
  def apply(result: Comment): ApplyTicketResponsePayload = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplyTicketResponsePayload]
  }
}

