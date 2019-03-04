package typings
package meteorDashTypingsLib.MeteorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveQueryHandle extends js.Object {
  def stop(): scala.Unit
}

object LiveQueryHandle {
  @scala.inline
  def apply(stop: js.Function0[scala.Unit]): LiveQueryHandle = {
    val __obj = js.Dynamic.literal(stop = stop)
  
    __obj.asInstanceOf[LiveQueryHandle]
  }
}

