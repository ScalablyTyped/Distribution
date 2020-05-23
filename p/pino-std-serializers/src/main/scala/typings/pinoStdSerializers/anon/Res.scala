package typings.pinoStdSerializers.anon

import typings.pinoStdSerializers.mod.SerializedResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Res extends js.Object {
  var res: SerializedResponse
}

object Res {
  @scala.inline
  def apply(res: SerializedResponse): Res = {
    val __obj = js.Dynamic.literal(res = res.asInstanceOf[js.Any])
    __obj.asInstanceOf[Res]
  }
}

