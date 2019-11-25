package typings.nodeDashZendesk.nodeDashZendeskMod.Macros

import typings.nodeDashZendesk.Anon_Comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplyTicketResponsePayload extends js.Object {
  var result: Anon_Comment
}

object ApplyTicketResponsePayload {
  @scala.inline
  def apply(result: Anon_Comment): ApplyTicketResponsePayload = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplyTicketResponsePayload]
  }
}

