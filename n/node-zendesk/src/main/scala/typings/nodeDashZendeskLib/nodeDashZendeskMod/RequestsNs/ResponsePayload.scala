package typings
package nodeDashZendeskLib.nodeDashZendeskMod.RequestsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePayload extends js.Object {
  val request: ResponseModel
}

object ResponsePayload {
  @scala.inline
  def apply(request: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(request = request)
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

