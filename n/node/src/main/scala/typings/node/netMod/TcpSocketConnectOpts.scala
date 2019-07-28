package typings.node.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpSocketConnectOpts extends SocketConnectOpts {
  var family: js.UndefOr[Double] = js.undefined
  var hints: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var localPort: js.UndefOr[Double] = js.undefined
  var lookup: js.UndefOr[LookupFunction] = js.undefined
  var port: Double
}

object TcpSocketConnectOpts {
  @scala.inline
  def apply(
    port: Double,
    family: Int | Double = null,
    hints: Int | Double = null,
    host: java.lang.String = null,
    localAddress: java.lang.String = null,
    localPort: Int | Double = null,
    lookup: LookupFunction = null
  ): TcpSocketConnectOpts = {
    val __obj = js.Dynamic.literal(port = port)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (localPort != null) __obj.updateDynamic("localPort")(localPort.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup)
    __obj.asInstanceOf[TcpSocketConnectOpts]
  }
}

