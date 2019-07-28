package typings.node.tlsMod

import typings.node.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommonConnectionOptions extends js.Object {
  /**
    * An array of strings or a Buffer naming possible ALPN protocols.
    * (Protocols should be ordered by their priority.)
    */
  var ALPNProtocols: js.UndefOr[(js.Array[java.lang.String | Uint8Array]) | Uint8Array] = js.undefined
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
      /* servername */ java.lang.String, 
      /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit], 
      Unit
    ]
  ] = js.undefined
  /**
    * When enabled, TLS packet trace information is written to `stderr`. This can be
    * used to debug TLS connection problems.
    * @default false
    */
  var enableTrace: js.UndefOr[Boolean] = js.undefined
  /**
    * If true the server will reject any connection which is not
    * authorized with the list of supplied CAs. This option only has an
    * effect if requestCert is true.
    * @default true
    */
  var rejectUnauthorized: js.UndefOr[Boolean] = js.undefined
  /**
    * If true the server will request a certificate from clients that
    * connect and attempt to verify that certificate. Defaults to
    * false.
    */
  var requestCert: js.UndefOr[Boolean] = js.undefined
  /**
    * An optional TLS context object from tls.createSecureContext()
    */
  var secureContext: js.UndefOr[SecureContext] = js.undefined
}

object CommonConnectionOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[java.lang.String | Uint8Array]) | Uint8Array = null,
    SNICallback: (/* servername */ java.lang.String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    secureContext: SecureContext = null
  ): CommonConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    __obj.asInstanceOf[CommonConnectionOptions]
  }
}

