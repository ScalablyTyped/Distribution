package typings.openpgp

import typings.openpgp.mod.key.Key
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonErr extends js.Object {
  var err: js.Array[Error] | Null
  var keys: js.Array[Key]
}

object AnonErr {
  @scala.inline
  def apply(keys: js.Array[Key], err: js.Array[Error] = null): AnonErr = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any])
    if (err != null) __obj.updateDynamic("err")(err.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonErr]
  }
}

