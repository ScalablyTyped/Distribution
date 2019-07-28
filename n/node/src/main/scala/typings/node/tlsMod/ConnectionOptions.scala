package typings.node.tlsMod

import typings.node.Buffer
import typings.node.Error
import typings.node.netMod.LookupFunction
import typings.node.netMod.Socket
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions
  extends SecureContextOptions
     with CommonConnectionOptions {
   // Establish secure connection on a given socket rather than creating a new socket
  var checkServerIdentity: js.UndefOr[
    js.Function2[/* host */ java.lang.String, /* cert */ PeerCertificate, js.UndefOr[Error]]
  ] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var lookup: js.UndefOr[LookupFunction] = js.undefined
  var minDHSize: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var servername: js.UndefOr[java.lang.String] = js.undefined
   // SNI TLS Extension
  var session: js.UndefOr[Buffer] = js.undefined
   // Creates unix socket connection to path. If this option is specified, `host` and `port` are ignored.
  var socket: js.UndefOr[Socket] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[java.lang.String | Uint8Array]) | Uint8Array = null,
    SNICallback: (/* servername */ java.lang.String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit = null,
    ca: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    cert: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    checkServerIdentity: (/* host */ java.lang.String, /* cert */ PeerCertificate) => js.UndefOr[Error] = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    crl: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    dhparam: java.lang.String | Buffer = null,
    ecdhCurve: java.lang.String = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    host: java.lang.String = null,
    key: java.lang.String | Buffer | (js.Array[Buffer | js.Object]) = null,
    lookup: LookupFunction = null,
    maxVersion: SecureVersion = null,
    minDHSize: Int | Double = null,
    minVersion: SecureVersion = null,
    passphrase: java.lang.String = null,
    path: java.lang.String = null,
    pfx: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer | js.Object]) = null,
    port: Int | Double = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    secureContext: SecureContext = null,
    secureOptions: Int | Double = null,
    secureProtocol: java.lang.String = null,
    servername: java.lang.String = null,
    session: Buffer = null,
    sessionIdContext: java.lang.String = null,
    socket: Socket = null,
    timeout: Int | Double = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2(checkServerIdentity))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace)
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup)
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion)
    if (minDHSize != null) __obj.updateDynamic("minDHSize")(minDHSize.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (session != null) __obj.updateDynamic("session")(session)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

