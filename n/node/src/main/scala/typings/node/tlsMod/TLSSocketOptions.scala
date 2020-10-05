package typings.node.tlsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TLSSocketOptions
  extends SecureContextOptions
     with CommonConnectionOptions {
  /**
    * If true the TLS socket will be instantiated in server-mode.
    * Defaults to false.
    */
  var isServer: js.UndefOr[Boolean] = js.native
  /**
    * If true, specifies that the OCSP status request extension will be
    * added to the client hello and an 'OCSPResponse' event will be
    * emitted on the socket before establishing a secure communication
    */
  var requestOCSP: js.UndefOr[Boolean] = js.native
  /**
    * An optional net.Server instance.
    */
  var server: js.UndefOr[typings.node.netMod.Server] = js.native
  /**
    * An optional Buffer instance containing a TLS session.
    */
  var session: js.UndefOr[Buffer] = js.native
}

object TLSSocketOptions {
  @scala.inline
  def apply(): TLSSocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLSSocketOptions]
  }
  @scala.inline
  implicit class TLSSocketOptionsOps[Self <: TLSSocketOptions] (val x: Self) extends AnyVal {
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
    def setIsServer(value: Boolean): Self = this.set("isServer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsServer: Self = this.set("isServer", js.undefined)
    @scala.inline
    def setRequestOCSP(value: Boolean): Self = this.set("requestOCSP", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestOCSP: Self = this.set("requestOCSP", js.undefined)
    @scala.inline
    def setServer(value: typings.node.netMod.Server): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServer: Self = this.set("server", js.undefined)
    @scala.inline
    def setSession(value: Buffer): Self = this.set("session", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
  }
  
}

