package typings
package nodeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ALPNProtocols extends js.Object {
  /**
    * An array of strings or a Buffer naming possible ALPN protocols.
    * (Protocols should be ordered by their priority.) When the server
    * receives both NPN and ALPN extensions from the client, ALPN takes
    * precedence over NPN and the server does not send an NPN extension
    * to the client.
    */
  var ALPNProtocols: js.UndefOr[
    js.Array[java.lang.String] | js.Array[Buffer] | js.Array[stdLib.Uint8Array] | Buffer | stdLib.Uint8Array
  ] = js.undefined
  /**
    * An array of strings or a Buffer naming possible NPN protocols.
    * (Protocols should be ordered by their priority.)
    */
  var NPNProtocols: js.UndefOr[
    js.Array[java.lang.String] | js.Array[Buffer] | js.Array[stdLib.Uint8Array] | Buffer | stdLib.Uint8Array
  ] = js.undefined
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
      /* cb */ js.Function2[/* err */ Error | scala.Null, /* ctx */ nodeLib.tlsMod.SecureContext, scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * If true the TLS socket will be instantiated in server-mode.
    * Defaults to false.
    */
  var isServer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true the server will reject any connection which is not
    * authorized with the list of supplied CAs. This option only has an
    * effect if requestCert is true. Defaults to false.
    */
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true the server will request a certificate from clients that
    * connect and attempt to verify that certificate. Defaults to
    * false.
    */
  var requestCert: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, specifies that the OCSP status request extension will be
    * added to the client hello and an 'OCSPResponse' event will be
    * emitted on the socket before establishing a secure communication
    */
  var requestOCSP: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An optional TLS context object from tls.createSecureContext()
    */
  var secureContext: js.UndefOr[nodeLib.tlsMod.SecureContext] = js.undefined
  /**
    * An optional net.Server instance.
    */
  var server: js.UndefOr[nodeLib.netMod.Server] = js.undefined
  /**
    * An optional Buffer instance containing a TLS session.
    */
  var session: js.UndefOr[Buffer] = js.undefined
}

object Anon_ALPNProtocols {
  @scala.inline
  def apply(
    ALPNProtocols: js.Array[java.lang.String] | js.Array[Buffer] | js.Array[stdLib.Uint8Array] | Buffer | stdLib.Uint8Array = null,
    NPNProtocols: js.Array[java.lang.String] | js.Array[Buffer] | js.Array[stdLib.Uint8Array] | Buffer | stdLib.Uint8Array = null,
    SNICallback: (/* servername */ java.lang.String, /* cb */ js.Function2[/* err */ Error | scala.Null, /* ctx */ nodeLib.tlsMod.SecureContext, scala.Unit]) => scala.Unit = null,
    isServer: js.UndefOr[scala.Boolean] = js.undefined,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    requestCert: js.UndefOr[scala.Boolean] = js.undefined,
    requestOCSP: js.UndefOr[scala.Boolean] = js.undefined,
    secureContext: nodeLib.tlsMod.SecureContext = null,
    server: nodeLib.netMod.Server = null,
    session: Buffer = null
  ): Anon_ALPNProtocols = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (NPNProtocols != null) __obj.updateDynamic("NPNProtocols")(NPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (!js.isUndefined(isServer)) __obj.updateDynamic("isServer")(isServer)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (!js.isUndefined(requestOCSP)) __obj.updateDynamic("requestOCSP")(requestOCSP)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    if (server != null) __obj.updateDynamic("server")(server)
    if (session != null) __obj.updateDynamic("session")(session)
    __obj.asInstanceOf[Anon_ALPNProtocols]
  }
}

