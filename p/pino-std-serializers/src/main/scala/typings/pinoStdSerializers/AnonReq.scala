package typings.pinoStdSerializers

import typings.pinoStdSerializers.mod.SerializedRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReq extends js.Object {
  var req: SerializedRequest
}

object AnonReq {
  @scala.inline
  def apply(req: SerializedRequest): AnonReq = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReq]
  }
}

