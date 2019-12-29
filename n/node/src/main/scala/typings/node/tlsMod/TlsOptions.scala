package typings.node.tlsMod

import typings.node.Buffer
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TlsOptions
  extends SecureContextOptions
     with CommonConnectionOptions {
  /**
    * Abort the connection if the SSL/TLS handshake does not finish in the
    * specified number of milliseconds. A 'tlsClientError' is emitted on
    * the tls.Server object whenever a handshake times out. Default:
    * 120000 (120 seconds).
    */
  var handshakeTimeout: js.UndefOr[Double] = js.undefined
  /**
    * The number of seconds after which a TLS session created by the
    * server will no longer be resumable. See Session Resumption for more
    * information. Default: 300.
    */
  var sessionTimeout: js.UndefOr[Double] = js.undefined
  /**
    * 48-bytes of cryptographically strong pseudo-random data.
    */
  var ticketKeys: js.UndefOr[Buffer] = js.undefined
}

object TlsOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[String | Uint8Array]) | Uint8Array = null,
    SNICallback: (/* servername */ String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    handshakeTimeout: Int | Double = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    key: String | Buffer | (js.Array[Buffer | KeyObject]) = null,
    maxVersion: SecureVersion = null,
    minVersion: SecureVersion = null,
    passphrase: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | PxfObject]) = null,
    privateKeyEngine: String = null,
    privateKeyIdentifier: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    secureContext: SecureContext = null,
    secureOptions: Int | Double = null,
    secureProtocol: String = null,
    sessionIdContext: String = null,
    sessionTimeout: Int | Double = null,
    sigalgs: String = null,
    ticketKeys: Buffer = null
  ): TlsOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace.asInstanceOf[js.Any])
    if (handshakeTimeout != null) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (privateKeyEngine != null) __obj.updateDynamic("privateKeyEngine")(privateKeyEngine.asInstanceOf[js.Any])
    if (privateKeyIdentifier != null) __obj.updateDynamic("privateKeyIdentifier")(privateKeyIdentifier.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.asInstanceOf[js.Any])
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert.asInstanceOf[js.Any])
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext.asInstanceOf[js.Any])
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (sigalgs != null) __obj.updateDynamic("sigalgs")(sigalgs.asInstanceOf[js.Any])
    if (ticketKeys != null) __obj.updateDynamic("ticketKeys")(ticketKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[TlsOptions]
  }
}

