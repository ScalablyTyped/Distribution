package typings.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpcNetConnectOpts
  extends IpcSocketConnectOpts
     with SocketConstructorOpts
     with NetConnectOpts {
  var timeout: js.UndefOr[Double] = js.undefined
}

object IpcNetConnectOpts {
  @scala.inline
  def apply(
    path: String,
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    fd: js.UndefOr[Double] = js.undefined,
    onread: OnReadOpts = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    writable: js.UndefOr[Boolean] = js.undefined
  ): IpcNetConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fd)) __obj.updateDynamic("fd")(fd.get.asInstanceOf[js.Any])
    if (onread != null) __obj.updateDynamic("onread")(onread.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IpcNetConnectOpts]
  }
}

