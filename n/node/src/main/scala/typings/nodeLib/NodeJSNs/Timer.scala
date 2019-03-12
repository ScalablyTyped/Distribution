package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Timer extends js.Object {
  def ref(): scala.Unit
  def refresh(): scala.Unit
  def unref(): scala.Unit
}

object Timer {
  @scala.inline
  def apply(ref: () => scala.Unit, refresh: () => scala.Unit, unref: () => scala.Unit): Timer = {
    val __obj = js.Dynamic.literal(ref = js.Any.fromFunction0(ref), refresh = js.Any.fromFunction0(refresh), unref = js.Any.fromFunction0(unref))
  
    __obj.asInstanceOf[Timer]
  }
}

