package typings
package nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs.CommentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePayload extends js.Object {
  val comment: ResponseModel
}

object ResponsePayload {
  @scala.inline
  def apply(comment: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(comment = comment)
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

