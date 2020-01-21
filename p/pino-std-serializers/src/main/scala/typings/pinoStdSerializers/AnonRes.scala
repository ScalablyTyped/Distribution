package typings.pinoStdSerializers

import typings.pinoStdSerializers.mod.SerializedResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRes extends js.Object {
  var res: SerializedResponse
}

object AnonRes {
  @scala.inline
  def apply(res: SerializedResponse): AnonRes = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRes]
  }
}

