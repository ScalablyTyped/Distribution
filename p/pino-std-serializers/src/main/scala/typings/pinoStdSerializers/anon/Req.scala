package typings.pinoStdSerializers.anon

import typings.pinoStdSerializers.mod.SerializedRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Req extends js.Object {
  var req: SerializedRequest
}

object Req {
  @scala.inline
  def apply(req: SerializedRequest): Req = {
    val __obj = js.Dynamic.literal(req = req.asInstanceOf[js.Any])
    __obj.asInstanceOf[Req]
  }
}

