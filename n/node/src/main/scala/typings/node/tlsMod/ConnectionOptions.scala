package typings.node.tlsMod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.netMod.LookupFunction
import typings.node.netMod.Socket
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionOptions
  extends SecureContextOptions
     with CommonConnectionOptions {
   // Establish secure connection on a given socket rather than creating a new socket
  var checkServerIdentity: js.UndefOr[js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]]] = js.native
  var host: js.UndefOr[String] = js.native
  var lookup: js.UndefOr[LookupFunction] = js.native
  var minDHSize: js.UndefOr[Double] = js.native
  var path: js.UndefOr[String] = js.native
  var port: js.UndefOr[Double] = js.native
  /**
    * When negotiating TLS-PSK (pre-shared keys), this function is called
    * with optional identity `hint` provided by the server or `null`
    * in case of TLS 1.3 where `hint` was removed.
    * It will be necessary to provide a custom `tls.checkServerIdentity()`
    * for the connection as the default one will try to check hostname/IP
    * of the server against the certificate but that's not applicable for PSK
    * because there won't be a certificate present.
    * More information can be found in the RFC 4279.
    *
    * @param hint message sent from the server to help client
    * decide which identity to use during negotiation.
    * Always `null` if TLS 1.3 is used.
    * @returns Return `null` to stop the negotiation process. `psk` must be
    * compatible with the selected cipher's digest.
    * `identity` must use UTF-8 encoding.
    */
  var pskCallback: js.UndefOr[js.Function1[/* hint */ String | Null, PSKCallbackNegotation | Null]] = js.native
  var servername: js.UndefOr[String] = js.native
   // SNI TLS Extension
  var session: js.UndefOr[Buffer] = js.native
   // Creates unix socket connection to path. If this option is specified, `host` and `port` are ignored.
  var socket: js.UndefOr[Socket] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object ConnectionOptions {
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
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
    def setCheckServerIdentity(value: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[Error]): Self = this.set("checkServerIdentity", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCheckServerIdentity: Self = this.set("checkServerIdentity", js.undefined)
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    @scala.inline
    def setLookup(
      value: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit
    ): Self = this.set("lookup", js.Any.fromFunction3(value))
    @scala.inline
    def deleteLookup: Self = this.set("lookup", js.undefined)
    @scala.inline
    def setMinDHSize(value: Double): Self = this.set("minDHSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinDHSize: Self = this.set("minDHSize", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setPskCallback(value: /* hint */ String | Null => PSKCallbackNegotation | Null): Self = this.set("pskCallback", js.Any.fromFunction1(value))
    @scala.inline
    def deletePskCallback: Self = this.set("pskCallback", js.undefined)
    @scala.inline
    def setServername(value: String): Self = this.set("servername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServername: Self = this.set("servername", js.undefined)
    @scala.inline
    def setSession(value: Buffer): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    @scala.inline
    def setSocket(value: Socket): Self = this.set("socket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocket: Self = this.set("socket", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

