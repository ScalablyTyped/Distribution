package typings.node.netMod

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpNetConnectOpts
  extends TcpSocketConnectOpts
     with SocketConstructorOpts
     with NetConnectOpts {
  var timeout: js.UndefOr[Double] = js.undefined
}

object TcpNetConnectOpts {
  @scala.inline
  def apply(
    port: Double,
    allowHalfOpen: js.UndefOr[Boolean] = js.undefined,
    family: Int | Double = null,
    fd: Int | Double = null,
    hints: Int | Double = null,
    host: String = null,
    localAddress: String = null,
    localPort: Int | Double = null,
    lookup: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit = null,
    onread: OnReadOpts = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    writable: js.UndefOr[Boolean] = js.undefined
  ): TcpNetConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen.asInstanceOf[js.Any])
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (localPort != null) __obj.updateDynamic("localPort")(localPort.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(js.Any.fromFunction3(lookup))
    if (onread != null) __obj.updateDynamic("onread")(onread.asInstanceOf[js.Any])
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpNetConnectOpts]
  }
}

