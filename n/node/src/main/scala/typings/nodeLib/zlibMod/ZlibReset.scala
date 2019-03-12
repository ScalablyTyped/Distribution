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
  def apply(reset: () => scala.Unit): ZlibReset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[ZlibReset]
  }
}

