package typings
package openpgpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Err extends js.Object {
  var err: js.Array[stdLib.Error] | scala.Null
  var keys: js.Array[openpgpLib.openpgpMod.keyNs.Key]
}

object Anon_Err {
  @scala.inline
  def apply(keys: js.Array[openpgpLib.openpgpMod.keyNs.Key], err: js.Array[stdLib.Error] = null): Anon_Err = {
    val __obj = js.Dynamic.literal(keys = keys)
    if (err != null) __obj.updateDynamic("err")(err)
    __obj.asInstanceOf[Anon_Err]
  }
}

