package typings
package nodeLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpNetConnectOpts
  extends TcpSocketConnectOpts
     with SocketConstructorOpts
     with NetConnectOpts {
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object TcpNetConnectOpts {
  @scala.inline
  def apply(
    port: scala.Double,
    allowHalfOpen: js.UndefOr[scala.Boolean] = js.undefined,
    family: scala.Int | scala.Double = null,
    fd: scala.Int | scala.Double = null,
    hints: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    localAddress: java.lang.String = null,
    localPort: scala.Int | scala.Double = null,
    lookup: LookupFunction = null,
    readable: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null,
    writable: js.UndefOr[scala.Boolean] = js.undefined
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

