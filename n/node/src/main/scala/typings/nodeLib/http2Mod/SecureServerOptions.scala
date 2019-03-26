package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureServerOptions extends SecureServerSessionOptions {
  var allowHTTP1: js.UndefOr[scala.Boolean] = js.undefined
}

object SecureServerOptions {
  @scala.inline
  def apply(
    ALPNProtocols: js.Array[java.lang.String] | js.Array[nodeLib.Buffer] | js.Array[stdLib.Uint8Array] | nodeLib.Buffer | stdLib.Uint8Array = null,
    NPNProtocols: js.Array[java.lang.String] | js.Array[nodeLib.Buffer] | js.Array[stdLib.Uint8Array] | nodeLib.Buffer | stdLib.Uint8Array = null,
    SNICallback: (/* servername */ java.lang.String, /* cb */ js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* ctx */ nodeLib.tlsMod.SecureContext, 
      scala.Unit
    ]) => scala.Unit = null,
    allowHTTP1: js.UndefOr[scala.Boolean] = js.undefined,
    ca: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    cert: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    createConnection: (/* authority */ nodeLib.urlMod.URL, /* option */ SessionOptions) => nodeLib.streamMod.Duplex = null,
    crl: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    dhparam: java.lang.String | nodeLib.Buffer = null,
    ecdhCurve: java.lang.String = null,
    handshakeTimeout: scala.Int | scala.Double = null,
    honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String | nodeLib.Buffer | (js.Array[nodeLib.Buffer | js.Object]) = null,
    maxDeflateDynamicTableSize: scala.Int | scala.Double = null,
    maxReservedRemoteStreams: scala.Int | scala.Double = null,
    maxSendHeaderBlockLength: scala.Int | scala.Double = null,
    maxVersion: nodeLib.tlsMod.SecureVersion = null,
    minVersion: nodeLib.tlsMod.SecureVersion = null,
    paddingStrategy: scala.Int | scala.Double = null,
    passphrase: java.lang.String = null,
    peerMaxConcurrentStreams: scala.Int | scala.Double = null,
    pfx: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer | js.Object]) = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    requestCert: js.UndefOr[scala.Boolean] = js.undefined,
    secureOptions: scala.Int | scala.Double = null,
    secureProtocol: java.lang.String = null,
    selectPadding: (/* frameLen */ scala.Double, /* maxFrameLen */ scala.Double) => scala.Double = null,
    sessionIdContext: java.lang.String = null,
    sessionTimeout: scala.Int | scala.Double = null,
    settings: Settings = null,
    ticketKeys: nodeLib.Buffer = null
  ): SecureServerOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (NPNProtocols != null) __obj.updateDynamic("NPNProtocols")(NPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (!js.isUndefined(allowHTTP1)) __obj.updateDynamic("allowHTTP1")(allowHTTP1)
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (handshakeTimeout != null) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxDeflateDynamicTableSize != null) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.asInstanceOf[js.Any])
    if (maxReservedRemoteStreams != null) __obj.updateDynamic("maxReservedRemoteStreams")(maxReservedRemoteStreams.asInstanceOf[js.Any])
    if (maxSendHeaderBlockLength != null) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion)
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion)
    if (paddingStrategy != null) __obj.updateDynamic("paddingStrategy")(paddingStrategy.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (peerMaxConcurrentStreams != null) __obj.updateDynamic("peerMaxConcurrentStreams")(peerMaxConcurrentStreams.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(js.Any.fromFunction2(selectPadding))
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (ticketKeys != null) __obj.updateDynamic("ticketKeys")(ticketKeys)
    __obj.asInstanceOf[SecureServerOptions]
  }
}

