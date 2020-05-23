package typings.node.netMod

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.node.netMod.TcpSocketConnectOpts
  - typings.node.netMod.IpcSocketConnectOpts
*/
trait SocketConnectOpts extends js.Object

object SocketConnectOpts {
  @scala.inline
  def TcpSocketConnectOpts(
    port: Double,
    family: js.UndefOr[Double] = js.undefined,
    hints: js.UndefOr[Double] = js.undefined,
    host: String = null,
    localAddress: String = null,
    localPort: js.UndefOr[Double] = js.undefined,
    lookup: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit = null,
    onread: OnReadOpts = null
  ): SocketConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (!js.isUndefined(family)) __obj.updateDynamic("family")(family.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hints)) __obj.updateDynamic("hints")(hints.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (localAddress != null) __obj.updateDynamic("localAddress")(localAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(localPort)) __obj.updateDynamic("localPort")(localPort.get.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(js.Any.fromFunction3(lookup))
    if (onread != null) __obj.updateDynamic("onread")(onread.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOpts]
  }
  @scala.inline
  def IpcSocketConnectOpts(path: String, onread: OnReadOpts = null): SocketConnectOpts = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (onread != null) __obj.updateDynamic("onread")(onread.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocketConnectOpts]
  }
}

