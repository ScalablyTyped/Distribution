package typings
package nodeLib.netMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpSocketConnectOpts extends SocketConnectOpts {
  var family: js.UndefOr[scala.Double] = js.undefined
  var hints: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var localAddress: js.UndefOr[java.lang.String] = js.undefined
  var localPort: js.UndefOr[scala.Double] = js.undefined
  var lookup: js.UndefOr[LookupFunction] = js.undefined
  var port: scala.Double
}

object TcpSocketConnectOpts {
  @scala.inline
  def apply(
    port: scala.Double,
    family: scala.Int | scala.Double = null,
    hints: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    localAddress: java.lang.String = null,
    localPort: scala.Int | scala.Double = null,
    lookup: LookupFunction = null
  ): TcpSocketConnectOpts = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("port")(port)
    if (family != null) __obj.updateDynamic("family")(family.asInstanceOf[js.Any])
    if (hints != null) __obj.updateDynamic("hints")(hints.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress)
    if (localPort != null) __obj.updateDynamic("localPort")(localPort.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup)
    __obj.asInstanceOf[TcpSocketConnectOpts]
  }
}

