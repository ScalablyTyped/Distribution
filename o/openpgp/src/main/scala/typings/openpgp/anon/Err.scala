package typings.openpgp.anon

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Err extends js.Object {
  var err: js.Array[Error] | Null
  var keys: js.Array[typings.openpgp.mod.key.Key]
}

object Err {
  @scala.inline
  def apply(keys: js.Array[typings.openpgp.mod.key.Key], err: js.Array[Error] = null): Err = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], err = err.asInstanceOf[js.Any])
    __obj.asInstanceOf[Err]
  }
}

