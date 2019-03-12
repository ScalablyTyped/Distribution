package typings
package meteorLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveQueryHandle extends js.Object {
  def stop(): scala.Unit
}

object LiveQueryHandle {
  @scala.inline
  def apply(stop: () => scala.Unit): LiveQueryHandle = {
    val __obj = js.Dynamic.literal(stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[LiveQueryHandle]
  }
}

