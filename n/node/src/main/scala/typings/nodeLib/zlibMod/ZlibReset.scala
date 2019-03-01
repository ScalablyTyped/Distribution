package typings
package nodeLib.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibReset extends js.Object {
  def reset(): scala.Unit
}

object ZlibReset {
  @scala.inline
  def apply(reset: js.Function0[scala.Unit]): ZlibReset = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("reset")(reset)
    __obj.asInstanceOf[ZlibReset]
  }
}

