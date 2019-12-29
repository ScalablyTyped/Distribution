package typings.node.tlsMod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.netMod.LookupFunction
import typings.node.netMod.Socket
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions
  extends SecureContextOptions
     with CommonConnectionOptions {
   // Establish secure connection on a given socket rather than creating a new socket
  var checkServerIdentity: js.UndefOr[js.Function2[/* host */ String, /* cert */ PeerCertificate, js.UndefOr[Error]]] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var lookup: js.UndefOr[LookupFunction] = js.undefined
  var minDHSize: js.UndefOr[Double] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var servername: js.UndefOr[String] = js.undefined
   // SNI TLS Extension
  var session: js.UndefOr[Buffer] = js.undefined
   // Creates unix socket connection to path. If this option is specified, `host` and `port` are ignored.
  var socket: js.UndefOr[Socket] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[String | Uint8Array]) | Uint8Array = null,
    SNICallback: (/* servername */ String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    checkServerIdentity: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[Error] = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    key: String | Buffer | (js.Array[Buffer | KeyObject]) = null,
    lookup: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit = null,
    maxVersion: SecureVersion = null,
    minDHSize: Int | Double = null,
    minVersion: SecureVersion = null,
    passphrase: String = null,
    path: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | PxfObject]) = null,
    port: Int | Double = null,
    privateKeyEngine: String = null,
    privateKeyIdentifier: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    secureContext: SecureContext = null,
    secureOptions: Int | Double = null,
    secureProtocol: String = null,
    servername: String = null,
    session: Buffer = null,
    sessionIdContext: String = null,
    sigalgs: String = null,
    socket: Socket = null,
    timeout: Int | Double = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2(checkServerIdentity))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(js.Any.fromFunction3(lookup))
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (minDHSize != null) __obj.updateDynamic("minDHSize")(minDHSize.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (privateKeyEngine != null) __obj.updateDynamic("privateKeyEngine")(privateKeyEngine.asInstanceOf[js.Any])
    if (privateKeyIdentifier != null) __obj.updateDynamic("privateKeyIdentifier")(privateKeyIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert.asInstanceOf[js.Any])
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (sigalgs != null) __obj.updateDynamic("sigalgs")(sigalgs.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionOptions]
  }
}

