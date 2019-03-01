package typings
package nodeDashIpcLib.nodeDashIpcMod.NodeIPCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketConfig extends js.Object {
  var address: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
}

object SocketConfig {
  @scala.inline
  def apply(address: java.lang.String = null, port: scala.Int | scala.Double = null): SocketConfig = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConfig]
  }
}

