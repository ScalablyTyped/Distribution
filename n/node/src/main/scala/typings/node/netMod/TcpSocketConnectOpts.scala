package typings.node.netMod

import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TcpSocketConnectOpts
  extends ConnectOpts
     with SocketConnectOpts {
  var family: js.UndefOr[Double] = js.native
  var hints: js.UndefOr[Double] = js.native
  var host: js.UndefOr[String] = js.native
  var localAddress: js.UndefOr[String] = js.native
  var localPort: js.UndefOr[Double] = js.native
  var lookup: js.UndefOr[LookupFunction] = js.native
  var port: Double = js.native
}

object TcpSocketConnectOpts {
  @scala.inline
  def apply(port: Double): TcpSocketConnectOpts = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TcpSocketConnectOpts]
  }
  @scala.inline
  implicit class TcpSocketConnectOptsOps[Self <: TcpSocketConnectOpts] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setFamily(value: Double): Self = this.set("family", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamily: Self = this.set("family", js.undefined)
    @scala.inline
    def setHints(value: Double): Self = this.set("hints", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHints: Self = this.set("hints", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setLocalAddress(value: String): Self = this.set("localAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalAddress: Self = this.set("localAddress", js.undefined)
    @scala.inline
    def setLocalPort(value: Double): Self = this.set("localPort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalPort: Self = this.set("localPort", js.undefined)
    @scala.inline
    def setLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = this.set("lookup", js.Any.fromFunction3(value))
    @scala.inline
    def deleteLookup: Self = this.set("lookup", js.undefined)
  }
  
}

