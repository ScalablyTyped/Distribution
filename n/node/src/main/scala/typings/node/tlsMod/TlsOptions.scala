package typings.node.tlsMod

import typings.node.Buffer
import typings.node.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TlsOptions
  extends SecureContextOptions
     with CommonConnectionOptions {
  var handshakeTimeout: js.UndefOr[Double] = js.undefined
  var sessionTimeout: js.UndefOr[Double] = js.undefined
  var ticketKeys: js.UndefOr[Buffer] = js.undefined
}

object TlsOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[java.lang.String | Uint8Array]) | Uint8Array = null,
    SNICallback: (/* servername */ java.lang.String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit = null,
    ca: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    cert: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    crl: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    dhparam: java.lang.String | Buffer = null,
    ecdhCurve: java.lang.String = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    handshakeTimeout: Int | Double = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    key: java.lang.String | Buffer | (js.Array[Buffer | js.Object]) = null,
    maxVersion: SecureVersion = null,
    minVersion: SecureVersion = null,
    passphrase: java.lang.String = null,
    pfx: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer | js.Object]) = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    secureContext: SecureContext = null,
    secureOptions: Int | Double = null,
    secureProtocol: java.lang.String = null,
    sessionIdContext: java.lang.String = null,
    sessionTimeout: Int | Double = null,
    ticketKeys: Buffer = null
  ): TlsOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace)
    if (handshakeTimeout != null) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion)
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (ticketKeys != null) __obj.updateDynamic("ticketKeys")(ticketKeys)
    __obj.asInstanceOf[TlsOptions]
  }
}

