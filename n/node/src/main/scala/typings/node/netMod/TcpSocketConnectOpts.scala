package typings.node.netMod

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TcpSocketConnectOpts
  extends ConnectOpts
     with SocketConnectOpts {
  var family: js.UndefOr[Double] = js.undefined
  var hints: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var localAddress: js.UndefOr[String] = js.undefined
  var localPort: js.UndefOr[Double] = js.undefined
  var lookup: js.UndefOr[LookupFunction] = js.undefined
  var port: Double
}

object TcpSocketConnectOpts {
  @scala.inline
  def apply(
    port: Double,
    family: js.UndefOr[Double] = js.undefined,
    hints: js.UndefOr[Double] = js.undefined,
    host: String = null,
    localAddress: String = null,
    localPort: js.UndefOr[Double] = js.undefined,
    lookup: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit = null,
    onread: OnReadOpts = null
  ): TcpSocketConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hints)) __obj.updateDynamic("hints")(hints.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(localPort)) __obj.updateDynamic("localPort")(localPort.get.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(js.Any.fromFunction3(lookup))
    if (onread != null) __obj.updateDynamic("onread")(onread.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpSocketConnectOpts]
  }
}

