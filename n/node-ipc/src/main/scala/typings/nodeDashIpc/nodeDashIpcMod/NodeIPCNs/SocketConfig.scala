package typings.nodeDashIpc.nodeDashIpcMod.NodeIPCNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SocketConfig extends js.Object {
  var address: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
}

object SocketConfig {
  @scala.inline
  def apply(address: String = null, port: Int | Double = null): SocketConfig = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConfig]
  }
}

