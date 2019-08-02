package typings.node.http2Mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import typings.node.Buffer
import typings.node.Error
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.node.streamMod.Duplex
import typings.node.streamMod.ReadableOptions
import typings.node.tlsMod.SecureContext
import typings.node.tlsMod.SecureVersion
import typings.node.tlsMod.TlsOptions
import typings.node.urlMod.URL
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SecureServerSessionOptions
  extends TlsOptions
     with ServerSessionOptions

object SecureServerSessionOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[java.lang.String | Uint8Array]) | Uint8Array = null,
    Http1IncomingMessage: Instantiable1[/* socket */ Socket, IncomingMessage] = null,
    Http1ServerResponse: Instantiable1[/* req */ IncomingMessage, ServerResponse] = null,
    Http2ServerRequest: Instantiable4[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* options */ ReadableOptions, 
      /* rawHeaders */ js.Array[java.lang.String], 
      Http2ServerRequest
    ] = null,
    Http2ServerResponse: Instantiable1[/* stream */ ServerHttp2Stream, Http2ServerResponse] = null,
    SNICallback: (/* servername */ java.lang.String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit = null,
    ca: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    cert: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    createConnection: (/* authority */ URL, /* option */ SessionOptions) => Duplex = null,
    crl: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer]) = null,
    dhparam: java.lang.String | Buffer = null,
    ecdhCurve: java.lang.String = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    handshakeTimeout: Int | Double = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    key: java.lang.String | Buffer | (js.Array[Buffer | js.Object]) = null,
    maxDeflateDynamicTableSize: Int | Double = null,
    maxHeaderListPairs: Int | Double = null,
    maxOutstandingPings: Int | Double = null,
    maxSendHeaderBlockLength: Int | Double = null,
    maxSessionMemory: Int | Double = null,
    maxVersion: SecureVersion = null,
    minVersion: SecureVersion = null,
    paddingStrategy: Int | Double = null,
    passphrase: java.lang.String = null,
    peerMaxConcurrentStreams: Int | Double = null,
    pfx: java.lang.String | Buffer | (js.Array[java.lang.String | Buffer | js.Object]) = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    secureContext: SecureContext = null,
    secureOptions: Int | Double = null,
    secureProtocol: java.lang.String = null,
    selectPadding: (/* frameLen */ Double, /* maxFrameLen */ Double) => Double = null,
    sessionIdContext: java.lang.String = null,
    sessionTimeout: Int | Double = null,
    settings: Settings = null,
    ticketKeys: Buffer = null
  ): SecureServerSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (Http1IncomingMessage != null) __obj.updateDynamic("Http1IncomingMessage")(Http1IncomingMessage)
    if (Http1ServerResponse != null) __obj.updateDynamic("Http1ServerResponse")(Http1ServerResponse)
    if (Http2ServerRequest != null) __obj.updateDynamic("Http2ServerRequest")(Http2ServerRequest)
    if (Http2ServerResponse != null) __obj.updateDynamic("Http2ServerResponse")(Http2ServerResponse)
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace)
    if (handshakeTimeout != null) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxDeflateDynamicTableSize != null) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.asInstanceOf[js.Any])
    if (maxHeaderListPairs != null) __obj.updateDynamic("maxHeaderListPairs")(maxHeaderListPairs.asInstanceOf[js.Any])
    if (maxOutstandingPings != null) __obj.updateDynamic("maxOutstandingPings")(maxOutstandingPings.asInstanceOf[js.Any])
    if (maxSendHeaderBlockLength != null) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.asInstanceOf[js.Any])
    if (maxSessionMemory != null) __obj.updateDynamic("maxSessionMemory")(maxSessionMemory.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion)
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion)
    if (paddingStrategy != null) __obj.updateDynamic("paddingStrategy")(paddingStrategy.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (peerMaxConcurrentStreams != null) __obj.updateDynamic("peerMaxConcurrentStreams")(peerMaxConcurrentStreams.asInstanceOf[js.Any])
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(js.Any.fromFunction2(selectPadding))
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings)
    if (ticketKeys != null) __obj.updateDynamic("ticketKeys")(ticketKeys)
    __obj.asInstanceOf[SecureServerSessionOptions]
  }
}

