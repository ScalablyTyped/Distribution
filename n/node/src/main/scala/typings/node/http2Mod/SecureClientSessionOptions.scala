package typings.node.http2Mod

import typings.node.Buffer
import typings.node.Error
import typings.node.netMod.LookupFunction
import typings.node.netMod.Socket
import typings.node.streamMod.Duplex
import typings.node.tlsMod.ConnectionOptions
import typings.node.tlsMod.PeerCertificate
import typings.node.tlsMod.SecureContext
import typings.node.tlsMod.SecureVersion
import typings.node.urlMod.URL
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureClientSessionOptions
  extends ConnectionOptions
     with ClientSessionOptions

object SecureClientSessionOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[java.lang.String | Uint8Array]) | Uint8Array = null,
    SNICallback: (/* servername */ java.lang.String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit = null,
    ca: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    cert: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    checkServerIdentity: (/* host */ java.lang.String, /* cert */ PeerCertificate) => js.UndefOr[Error] = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    createConnection: (/* authority */ URL, /* option */ SessionOptions) => Duplex = null,
    crl: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    dhparam: java.lang.String | Buffer = null,
    ecdhCurve: java.lang.String = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    host: java.lang.String = null,
    key: java.lang.String | Buffer | (js.Array[Buffer | js.Object]) = null,
    lookup: LookupFunction = null,
    maxDeflateDynamicTableSize: Int | Double = null,
    maxHeaderListPairs: Int | Double = null,
    maxOutstandingPings: Int | Double = null,
    maxReservedRemoteStreams: Int | Double = null,
    maxSendHeaderBlockLength: Int | Double = null,
    maxSessionMemory: Int | Double = null,
    maxVersion: SecureVersion = null,
    minDHSize: Int | Double = null,
    minVersion: SecureVersion = null,
    paddingStrategy: Int | Double = null,
    passphrase: java.lang.String = null,
    path: java.lang.String = null,
    peerMaxConcurrentStreams: Int | Double = null,
    pfx: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer | js.Object]) = null,
    port: Int | Double = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    secureContext: SecureContext = null,
    secureOptions: Int | Double = null,
    secureProtocol: java.lang.String = null,
    selectPadding: (/* frameLen */ Double, /* maxFrameLen */ Double) => Double = null,
    servername: java.lang.String = null,
    session: Buffer = null,
    sessionIdContext: java.lang.String = null,
    settings: Settings = null,
    socket: Socket = null,
    timeout: Int | Double = null
  ): SecureClientSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2(checkServerIdentity))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace)
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup)
    if (maxDeflateDynamicTableSize != null) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.asInstanceOf[js.Any])
    if (maxHeaderListPairs != null) __obj.updateDynamic("maxHeaderListPairs")(maxHeaderListPairs.asInstanceOf[js.Any])
    if (maxOutstandingPings != null) __obj.updateDynamic("maxOutstandingPings")(maxOutstandingPings.asInstanceOf[js.Any])
    if (maxReservedRemoteStreams != null) __obj.updateDynamic("maxReservedRemoteStreams")(maxReservedRemoteStreams.asInstanceOf[js.Any])
    if (maxSendHeaderBlockLength != null) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.asInstanceOf[js.Any])
    if (maxSessionMemory != null) __obj.updateDynamic("maxSessionMemory")(maxSessionMemory.asInstanceOf[js.Any])
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
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(js.Any.fromFunction2(selectPadding))
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (session != null) __obj.updateDynamic("session")(session)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureClientSessionOptions]
  }
}

