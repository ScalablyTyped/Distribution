package typings.node.netMod

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
    host: java.lang.String = null,
    localAddress: java.lang.String = null,
    localPort: Int | Double = null,
    lookup: LookupFunction = null,
    readable: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null,
    writable: js.UndefOr[Boolean] = js.undefined
  ): TcpNetConnectOpts = {
    val __obj = js.Dynamic.literal(port = port)
    if (!js.isUndefined(allowHalfOpen)) __obj.updateDynamic("allowHalfOpen")(allowHalfOpen)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (fd != null) __obj.updateDynamic("fd")(fd.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (localPort != null) __obj.updateDynamic("localPort")(localPort.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup)
    if (!js.isUndefined(readable)) __obj.updateDynamic("readable")(readable)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (!js.isUndefined(writable)) __obj.updateDynamic("writable")(writable)
    __obj.asInstanceOf[TcpNetConnectOpts]
  }
}

