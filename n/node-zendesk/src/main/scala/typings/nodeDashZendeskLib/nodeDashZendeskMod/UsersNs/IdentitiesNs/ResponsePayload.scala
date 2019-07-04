package typings
package nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.IdentitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResponsePayload extends js.Object {
  val identity: ResponseModel
}

object ResponsePayload {
  @scala.inline
  def apply(identity: ResponseModel): ResponsePayload = {
    val __obj = js.Dynamic.literal(identity = identity)
  
    __obj.asInstanceOf[ResponsePayload]
  }
}

