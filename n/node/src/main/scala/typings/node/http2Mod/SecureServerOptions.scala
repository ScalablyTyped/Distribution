package typings.node.http2Mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import typings.node.Buffer
import typings.node.NodeJS.TypedArray
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.node.streamMod.Duplex
import typings.node.streamMod.ReadableOptions
import typings.node.tlsMod.KeyObject
import typings.node.tlsMod.PxfObject
import typings.node.tlsMod.SecureContext
import typings.node.tlsMod.SecureVersion
import typings.node.tlsMod.TLSSocket
import typings.node.tlsMod.TlsOptions
import typings.node.urlMod.URL_
import typings.std.DataView
import typings.std.Error
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureServerOptions
  extends TlsOptions
     with ServerSessionOptions {
  var allowHTTP1: js.UndefOr[Boolean] = js.undefined
  var origins: js.UndefOr[js.Array[String]] = js.undefined
}

object SecureServerOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[String | Uint8Array]) | Uint8Array = null,
    Http1IncomingMessage: Instantiable1[/* socket */ Socket, IncomingMessage] = null,
    Http1ServerResponse: Instantiable1[/* req */ IncomingMessage, ServerResponse] = null,
    Http2ServerRequest: Instantiable4[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* options */ ReadableOptions, 
      /* rawHeaders */ js.Array[String], 
      Http2ServerRequest
    ] = null,
    Http2ServerResponse: Instantiable1[/* stream */ ServerHttp2Stream, Http2ServerResponse] = null,
    SNICallback: (/* servername */ String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit = null,
    allowHTTP1: js.UndefOr[Boolean] = js.undefined,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    createConnection: (/* authority */ URL_, SecureServerOptions) => Duplex = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    handshakeTimeout: js.UndefOr[Double] = js.undefined,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    key: String | Buffer | (js.Array[Buffer | KeyObject]) = null,
    maxDeflateDynamicTableSize: js.UndefOr[Double] = js.undefined,
    maxHeaderListPairs: js.UndefOr[Double] = js.undefined,
    maxOutstandingPings: js.UndefOr[Double] = js.undefined,
    maxSendHeaderBlockLength: js.UndefOr[Double] = js.undefined,
    maxSessionMemory: js.UndefOr[Double] = js.undefined,
    maxVersion: SecureVersion = null,
    minVersion: SecureVersion = null,
    origins: js.Array[String] = null,
    paddingStrategy: js.UndefOr[Double] = js.undefined,
    passphrase: String = null,
    peerMaxConcurrentStreams: js.UndefOr[Double] = js.undefined,
    pfx: String | Buffer | (js.Array[String | Buffer | PxfObject]) = null,
    privateKeyEngine: String = null,
    privateKeyIdentifier: String = null,
    pskCallback: (/* socket */ TLSSocket, /* identity */ String) => DataView | TypedArray | Null = null,
    pskIdentityHint: String = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    secureContext: SecureContext = null,
    secureOptions: js.UndefOr[Double] = js.undefined,
    secureProtocol: String = null,
    selectPadding: (/* frameLen */ Double, /* maxFrameLen */ Double) => Double = null,
    sessionIdContext: String = null,
    sessionTimeout: js.UndefOr[Double] = js.undefined,
    settings: Settings = null,
    sigalgs: String = null,
    ticketKeys: Buffer = null
  ): SecureServerOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (Http1IncomingMessage != null) __obj.updateDynamic("Http1IncomingMessage")(Http1IncomingMessage.asInstanceOf[js.Any])
    if (Http1ServerResponse != null) __obj.updateDynamic("Http1ServerResponse")(Http1ServerResponse.asInstanceOf[js.Any])
    if (Http2ServerRequest != null) __obj.updateDynamic("Http2ServerRequest")(Http2ServerRequest.asInstanceOf[js.Any])
    if (Http2ServerResponse != null) __obj.updateDynamic("Http2ServerResponse")(Http2ServerResponse.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (!js.isUndefined(allowHTTP1)) __obj.updateDynamic("allowHTTP1")(allowHTTP1.get.asInstanceOf[js.Any])
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers.asInstanceOf[js.Any])
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine.asInstanceOf[js.Any])
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve.asInstanceOf[js.Any])
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(handshakeTimeout)) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder.get.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDeflateDynamicTableSize)) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeaderListPairs)) __obj.updateDynamic("maxHeaderListPairs")(maxHeaderListPairs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOutstandingPings)) __obj.updateDynamic("maxOutstandingPings")(maxOutstandingPings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSendHeaderBlockLength)) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSessionMemory)) __obj.updateDynamic("maxSessionMemory")(maxSessionMemory.get.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion.asInstanceOf[js.Any])
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingStrategy)) __obj.updateDynamic("paddingStrategy")(paddingStrategy.get.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    if (!js.isUndefined(peerMaxConcurrentStreams)) __obj.updateDynamic("peerMaxConcurrentStreams")(peerMaxConcurrentStreams.get.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (privateKeyEngine != null) __obj.updateDynamic("privateKeyEngine")(privateKeyEngine.asInstanceOf[js.Any])
    if (privateKeyIdentifier != null) __obj.updateDynamic("privateKeyIdentifier")(privateKeyIdentifier.asInstanceOf[js.Any])
    if (pskCallback != null) __obj.updateDynamic("pskCallback")(js.Any.fromFunction2(pskCallback))
    if (pskIdentityHint != null) __obj.updateDynamic("pskIdentityHint")(pskIdentityHint.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized.get.asInstanceOf[js.Any])
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert.get.asInstanceOf[js.Any])
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext.asInstanceOf[js.Any])
    if (!js.isUndefined(secureOptions)) __obj.updateDynamic("secureOptions")(secureOptions.get.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol.asInstanceOf[js.Any])
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(js.Any.fromFunction2(selectPadding))
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext.asInstanceOf[js.Any])
    if (!js.isUndefined(sessionTimeout)) __obj.updateDynamic("sessionTimeout")(sessionTimeout.get.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (sigalgs != null) __obj.updateDynamic("sigalgs")(sigalgs.asInstanceOf[js.Any])
    if (ticketKeys != null) __obj.updateDynamic("ticketKeys")(ticketKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecureServerOptions]
  }
}

