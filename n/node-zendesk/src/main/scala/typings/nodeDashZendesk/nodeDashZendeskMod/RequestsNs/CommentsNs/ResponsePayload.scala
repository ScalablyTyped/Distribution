package typings.nodeDashZendesk.nodeDashZendeskMod.RequestsNs.CommentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePayload extends js.Object {
  val comment: typings.nodeDashZendesk.nodeDashZendeskMod.RequestsNs.CommentsNs.ResponseModel
}

object ResponsePayload {
  @scala.inline
  def apply(comment: typings.nodeDashZendesk.nodeDashZendeskMod.RequestsNs.CommentsNs.ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(comment = comment)
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

