package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureClientSessionOptions
  extends nodeLib.tlsMod.ConnectionOptions
     with SessionOptions

object SecureClientSessionOptions {
  @scala.inline
  def apply(
    ALPNProtocols: js.Array[java.lang.String] | js.Array[nodeLib.Buffer] | js.Array[stdLib.Uint8Array] | nodeLib.Buffer | stdLib.Uint8Array = null,
    NPNProtocols: js.Array[java.lang.String] | js.Array[nodeLib.Buffer] | js.Array[stdLib.Uint8Array] | nodeLib.Buffer | stdLib.Uint8Array = null,
    ca: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    cert: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    checkServerIdentity: js.Function2[
      /* host */ java.lang.String, 
      /* cert */ nodeLib.tlsMod.PeerCertificate, 
      js.UndefOr[nodeLib.Error]
    ] = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    createConnection: js.Function1[/* option */ SessionOptions, nodeLib.streamMod.Duplex] = null,
    crl: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    dhparam: java.lang.String | nodeLib.Buffer = null,
    ecdhCurve: java.lang.String = null,
    honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    key: java.lang.String | nodeLib.Buffer | (js.Array[nodeLib.Buffer | js.Object]) = null,
    lookup: nodeLib.netMod.LookupFunction = null,
    maxDeflateDynamicTableSize: scala.Int | scala.Double = null,
    maxReservedRemoteStreams: scala.Int | scala.Double = null,
    maxSendHeaderBlockLength: scala.Int | scala.Double = null,
    maxVersion: nodeLib.tlsMod.SecureVersion = null,
    minDHSize: scala.Int | scala.Double = null,
    minVersion: nodeLib.tlsMod.SecureVersion = null,
    paddingStrategy: scala.Int | scala.Double = null,
    passphrase: java.lang.String = null,
    path: java.lang.String = null,
    peerMaxConcurrentStreams: scala.Int | scala.Double = null,
    pfx: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer | js.Object]) = null,
    port: scala.Int | scala.Double = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    secureContext: nodeLib.tlsMod.SecureContext = null,
    secureOptions: scala.Int | scala.Double = null,
    secureProtocol: java.lang.String = null,
    selectPadding: js.Function2[/* frameLen */ scala.Double, /* maxFrameLen */ scala.Double, scala.Double] = null,
    servername: java.lang.String = null,
    session: nodeLib.Buffer = null,
    sessionIdContext: java.lang.String = null,
    settings: Settings = null,
    socket: nodeLib.netMod.Socket = null,
    timeout: scala.Int | scala.Double = null
  ): SecureClientSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (NPNProtocols != null) __obj.updateDynamic("NPNProtocols")(NPNProtocols.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(checkServerIdentity)
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (createConnection != null) __obj.updateDynamic("createConnection")(createConnection)
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup)
    if (maxDeflateDynamicTableSize != null) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.asInstanceOf[js.Any])
    if (maxReservedRemoteStreams != null) __obj.updateDynamic("maxReservedRemoteStreams")(maxReservedRemoteStreams.asInstanceOf[js.Any])
    if (maxSendHeaderBlockLength != null) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion)
    if (minDHSize != null) __obj.updateDynamic("minDHSize")(minDHSize.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion)
    if (paddingStrategy != null) __obj.updateDynamic("paddingStrategy")(paddingStrategy.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (path != null) __obj.updateDynamic("path")(path)
    if (peerMaxConcurrentStreams != null) __obj.updateDynamic("peerMaxConcurrentStreams")(peerMaxConcurrentStreams.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(selectPadding)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (session != null) __obj.updateDynamic("session")(session)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureClientSessionOptions]
  }
}

