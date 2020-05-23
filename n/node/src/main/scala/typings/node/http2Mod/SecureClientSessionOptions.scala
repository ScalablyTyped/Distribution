package typings.node.http2Mod

import typings.node.Buffer
import typings.node.NodeJS.ErrnoException
import typings.node.dnsMod.LookupOneOptions
import typings.node.netMod.Socket
import typings.node.nodeStrings.httpColon
import typings.node.nodeStrings.httpsColon
import typings.node.streamMod.Duplex
import typings.node.tlsMod.ConnectionOptions
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PSKCallbackNegotation
import typings.node.tlsMod.PeerCertificate
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureContext
import typings.node.tlsMod.SecureVersion
import typings.node.urlMod.URL_
import typings.std.Error
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
    ALPNProtocols: (js.Array[String | Uint8Array]) | Uint8Array = null,
    SNICallback: (/* servername */ String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    checkServerIdentity: (/* host */ String, /* cert */ PeerCertificate) => js.UndefOr[Error] = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    createConnection: (/* authority */ URL_, /* option */ SessionOptions) => Duplex = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    key: String | Buffer | (js.Array[Buffer | KeyObject]) = null,
    lookup: (/* hostname */ String, /* options */ LookupOneOptions, /* callback */ js.Function3[/* err */ ErrnoException | Null, /* address */ String, /* family */ Double, Unit]) => Unit = null,
    maxDeflateDynamicTableSize: js.UndefOr[Double] = js.undefined,
    maxHeaderListPairs: js.UndefOr[Double] = js.undefined,
    maxOutstandingPings: js.UndefOr[Double] = js.undefined,
    maxReservedRemoteStreams: js.UndefOr[Double] = js.undefined,
    maxSendHeaderBlockLength: js.UndefOr[Double] = js.undefined,
    maxSessionMemory: js.UndefOr[Double] = js.undefined,
    maxVersion: SecureVersion = null,
    minDHSize: js.UndefOr[Double] = js.undefined,
    minVersion: SecureVersion = null,
    paddingStrategy: js.UndefOr[Double] = js.undefined,
    passphrase: String = null,
    path: String = null,
    peerMaxConcurrentStreams: js.UndefOr[Double] = js.undefined,
    pfx: String | Buffer | (js.Array[String | Buffer | PxfObject]) = null,
    port: js.UndefOr[Double] = js.undefined,
    privateKeyEngine: String = null,
    privateKeyIdentifier: String = null,
    protocol: httpColon | httpsColon = null,
    pskCallback: /* hint */ String | Null => PSKCallbackNegotation | Null = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    secureContext: SecureContext = null,
    secureOptions: js.UndefOr[Double] = js.undefined,
    secureProtocol: String = null,
    selectPadding: (/* frameLen */ Double, /* maxFrameLen */ Double) => Double = null,
    servername: String = null,
    session: Buffer = null,
    sessionIdContext: String = null,
    settings: Settings = null,
    sigalgs: String = null,
    socket: Socket = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): SecureClientSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2(checkServerIdentity))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(js.Any.fromFunction3(lookup))
    if (!js.isUndefined(maxDeflateDynamicTableSize)) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeaderListPairs)) __obj.updateDynamic("maxHeaderListPairs")(maxHeaderListPairs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOutstandingPings)) __obj.updateDynamic("maxOutstandingPings")(maxOutstandingPings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReservedRemoteStreams)) __obj.updateDynamic("maxReservedRemoteStreams")(maxReservedRemoteStreams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSendHeaderBlockLength)) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSessionMemory)) __obj.updateDynamic("maxSessionMemory")(maxSessionMemory.get.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(minDHSize)) __obj.updateDynamic("minDHSize")(minDHSize.get.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingStrategy)) __obj.updateDynamic("paddingStrategy")(paddingStrategy.get.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(peerMaxConcurrentStreams)) __obj.updateDynamic("peerMaxConcurrentStreams")(peerMaxConcurrentStreams.get.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (privateKeyEngine != null) __obj.updateDynamic("privateKeyEngine")(privateKeyEngine.asInstanceOf[js.Any])
    if (privateKeyIdentifier != null) __obj.updateDynamic("privateKeyIdentifier")(privateKeyIdentifier.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (pskCallback != null) __obj.updateDynamic("pskCallback")(js.Any.fromFunction1(pskCallback))
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert.get.asInstanceOf[js.Any])
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext.asInstanceOf[js.Any])
    if (!js.isUndefined(secureOptions)) __obj.updateDynamic("secureOptions")(secureOptions.get.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(js.Any.fromFunction2(selectPadding))
    if (servername != null) __obj.updateDynamic("servername")(servername.asInstanceOf[js.Any])
    if (session != null) __obj.updateDynamic("session")(session.asInstanceOf[js.Any])
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (sigalgs != null) __obj.updateDynamic("sigalgs")(sigalgs.asInstanceOf[js.Any])
    if (socket != null) __obj.updateDynamic("socket")(socket.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureClientSessionOptions]
  }
}

