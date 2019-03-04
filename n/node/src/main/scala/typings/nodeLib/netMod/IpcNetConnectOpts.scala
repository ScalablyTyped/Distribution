package typings
package nodeLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpcNetConnectOpts
  extends IpcSocketConnectOpts
     with SocketConstructorOpts
     with NetConnectOpts {
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object IpcNetConnectOpts {
  @scala.inline
  def apply(
    path: java.lang.String,
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    fd: scala.Int | scala.Double = null,
    readable: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    writable: js.UndefOr[scala.Boolean] = js.undefined
  ): IpcNetConnectOpts = {
    val __obj = js.Dynamic.literal(path = path)
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[IpcNetConnectOpts]
  }
}

