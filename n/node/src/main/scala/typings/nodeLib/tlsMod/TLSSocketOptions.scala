package typings
package nodeLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TLSSocketOptions
  extends SecureContextOptions
     with CommonConnectionOptions {
  /**
    * If true the TLS socket will be instantiated in server-mode.
    * Defaults to false.
    */
  var isServer: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If true, specifies that the OCSP status request extension will be
    * added to the client hello and an 'OCSPResponse' event will be
    * emitted on the socket before establishing a secure communication
    */
  var requestOCSP: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An optional net.Server instance.
    */
  var server: js.UndefOr[nodeLib.netMod.Server] = js.undefined
  /**
    * An optional Buffer instance containing a TLS session.
    */
  var session: js.UndefOr[nodeLib.Buffer] = js.undefined
}

object TLSSocketOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[java.lang.String | stdLib.Uint8Array]) | stdLib.Uint8Array = null,
    SNICallback: (/* servername */ java.lang.String, /* cb */ js.Function2[/* err */ nodeLib.Error | scala.Null, /* ctx */ SecureContext, scala.Unit]) => scala.Unit = null,
    ca: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    cert: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    crl: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    dhparam: java.lang.String | nodeLib.Buffer = null,
    ecdhCurve: java.lang.String = null,
    enableTrace: js.UndefOr[scala.Boolean] = js.undefined,
    honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined,
    isServer: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String | nodeLib.Buffer | (js.Array[nodeLib.Buffer | js.Object]) = null,
    maxVersion: SecureVersion = null,
    minVersion: SecureVersion = null,
    passphrase: java.lang.String = null,
    pfx: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer | js.Object]) = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    requestCert: js.UndefOr[scala.Boolean] = js.undefined,
    requestOCSP: js.UndefOr[scala.Boolean] = js.undefined,
    secureContext: SecureContext = null,
    secureOptions: scala.Int | scala.Double = null,
    secureProtocol: java.lang.String = null,
    server: nodeLib.netMod.Server = null,
    session: nodeLib.Buffer = null,
    sessionIdContext: java.lang.String = null
  ): TLSSocketOptions = {
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
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (!js.isUndefined(isServer)) __obj.updateDynamic("isServer")(isServer)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion)
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (!js.isUndefined(requestOCSP)) __obj.updateDynamic("requestOCSP")(requestOCSP)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (server != null) __obj.updateDynamic("server")(server)
    if (session != null) __obj.updateDynamic("session")(session)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    __obj.asInstanceOf[TLSSocketOptions]
  }
}

