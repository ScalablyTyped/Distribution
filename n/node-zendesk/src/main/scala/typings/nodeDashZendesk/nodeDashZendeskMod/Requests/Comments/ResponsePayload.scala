package typings.nodeDashZendesk.nodeDashZendeskMod.Requests.Comments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePayload extends js.Object {
  val comment: ResponseModel
}

object ResponsePayload {
  @scala.inline
  def apply(comment: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

