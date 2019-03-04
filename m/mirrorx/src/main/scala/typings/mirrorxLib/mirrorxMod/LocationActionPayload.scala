package typings
package mirrorxLib.mirrorxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationActionPayload extends js.Object {
  var args: js.UndefOr[js.Array[_]] = js.undefined
  var method: java.lang.String
}

object LocationActionPayload {
  @scala.inline
  def apply(method: java.lang.String, args: js.Array[_] = null): LocationActionPayload = {
    val __obj = js.Dynamic.literal(method = method)
    if (args != null) __obj.updateDynamic("args")(args)
    __obj.asInstanceOf[LocationActionPayload]
  }
}

