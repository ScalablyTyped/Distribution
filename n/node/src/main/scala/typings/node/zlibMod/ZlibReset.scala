package typings.node.zlibMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ZlibReset extends js.Object {
  def reset(): Unit
}

object ZlibReset {
  @scala.inline
  def apply(reset: () => Unit): ZlibReset = {
    val __obj = js.Dynamic.literal(reset = js.Any.fromFunction0(reset))
  
    __obj.asInstanceOf[ZlibReset]
  }
}

