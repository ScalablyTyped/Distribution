package typings
package nodeDashZendeskLib.nodeDashZendeskMod.UsersNs.IdentitiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePayload extends js.Object {
  val identity: UpdateModel
}

object UpdatePayload {
  @scala.inline
  def apply(identity: UpdateModel): UpdatePayload = {
    val __obj = js.Dynamic.literal(identity = identity)
  
    __obj.asInstanceOf[UpdatePayload]
  }
}

