package typings.node.tlsMod

import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonConnectionOptions extends js.Object {
  /**
    * An array of strings or a Buffer naming possible ALPN protocols.
    * (Protocols should be ordered by their priority.)
    */
  var ALPNProtocols: js.UndefOr[(js.Array[String | Uint8Array]) | Uint8Array] = js.native
  /**
    * SNICallback(servername, cb) <Function> A function that will be
    * called if the client supports SNI TLS extension. Two arguments
    * will be passed when called: servername and cb. SNICallback should
    * invoke cb(null, ctx), where ctx is a SecureContext instance.
    * (tls.createSecureContext(...) can be used to get a proper
    * SecureContext.) If SNICallback wasn't provided the default callback
    * with high-level API will be used (see below).
    */
  var SNICallback: js.UndefOr[
    js.Function2[
      /* servername */ String, 
      /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit], 
      Unit
    ]
  ] = js.native
  /**
    * When enabled, TLS packet trace information is written to `stderr`. This can be
    * used to debug TLS connection problems.
    * @default false
    */
  var enableTrace: js.UndefOr[Boolean] = js.native
  /**
    * If true the server will reject any connection which is not
    * authorized with the list of supplied CAs. This option only has an
    * effect if requestCert is true.
    * @default true
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.native
  /**
    * If true the server will request a certificate from clients that
    * connect and attempt to verify that certificate. Defaults to
    * false.
    */
  var requestCert: js.UndefOr[Boolean] = js.native
  /**
    * An optional TLS context object from tls.createSecureContext()
    */
  var secureContext: js.UndefOr[SecureContext] = js.native
}

object CommonConnectionOptions {
  @scala.inline
  def apply(): CommonConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonConnectionOptions]
  }
  @scala.inline
  implicit class CommonConnectionOptionsOps[Self <: CommonConnectionOptions] (val x: Self) extends AnyVal {
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
    def setALPNProtocolsVarargs(value: (String | Uint8Array)*): Self = this.set("ALPNProtocols", js.Array(value :_*))
    @scala.inline
    def setALPNProtocols(value: (js.Array[String | Uint8Array]) | Uint8Array): Self = this.set("ALPNProtocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteALPNProtocols: Self = this.set("ALPNProtocols", js.undefined)
    @scala.inline
    def setSNICallback(
      value: (/* servername */ String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit
    ): Self = this.set("SNICallback", js.Any.fromFunction2(value))
    @scala.inline
    def deleteSNICallback: Self = this.set("SNICallback", js.undefined)
    @scala.inline
    def setEnableTrace(value: Boolean): Self = this.set("enableTrace", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTrace: Self = this.set("enableTrace", js.undefined)
    @scala.inline
    def setRejectUnauthorized(value: Boolean): Self = this.set("rejectUnauthorized", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectUnauthorized: Self = this.set("rejectUnauthorized", js.undefined)
    @scala.inline
    def setRequestCert(value: Boolean): Self = this.set("requestCert", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestCert: Self = this.set("requestCert", js.undefined)
    @scala.inline
    def setSecureContext(value: SecureContext): Self = this.set("secureContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecureContext: Self = this.set("secureContext", js.undefined)
  }
  
}

