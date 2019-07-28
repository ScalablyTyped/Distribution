package typings.openpgp

import typings.openpgp.openpgpMod.keyNs.Key
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Err extends js.Object {
  var err: js.Array[Error] | Null
  var keys: js.Array[Key]
}

object Anon_Err {
  @scala.inline
  def apply(keys: js.Array[Key], err: js.Array[Error] = null): Anon_Err = {
    val __obj = js.Dynamic.literal(keys = keys)
    if (err != null) __obj.updateDynamic("err")(err)
    __obj.asInstanceOf[Anon_Err]
  }
}

