package typings.node.http2Mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable4
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import typings.node.netMod.Socket
import typings.node.streamMod.Duplex
import typings.node.streamMod.ReadableOptions
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSessionOptions extends SessionOptions {
  var Http1IncomingMessage: js.UndefOr[Instantiable1[/* socket */ Socket, IncomingMessage]] = js.undefined
  var Http1ServerResponse: js.UndefOr[Instantiable1[/* req */ IncomingMessage, ServerResponse]] = js.undefined
  var Http2ServerRequest: js.UndefOr[
    Instantiable4[
      /* stream */ ServerHttp2Stream, 
      /* headers */ IncomingHttpHeaders, 
      /* options */ ReadableOptions, 
      /* rawHeaders */ js.Array[String], 
      typings.node.http2Mod.Http2ServerRequest
    ]
  ] = js.undefined
  var Http2ServerResponse: js.UndefOr[
    Instantiable1[/* stream */ ServerHttp2Stream, typings.node.http2Mod.Http2ServerResponse]
  ] = js.undefined
}

object ServerSessionOptions {
  @scala.inline
  def apply(
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
    createConnection: (/* authority */ URL_, ServerSessionOptions) => Duplex = null,
    maxDeflateDynamicTableSize: js.UndefOr[Double] = js.undefined,
    maxHeaderListPairs: js.UndefOr[Double] = js.undefined,
    maxOutstandingPings: js.UndefOr[Double] = js.undefined,
    maxSendHeaderBlockLength: js.UndefOr[Double] = js.undefined,
    maxSessionMemory: js.UndefOr[Double] = js.undefined,
    paddingStrategy: js.UndefOr[Double] = js.undefined,
    peerMaxConcurrentStreams: js.UndefOr[Double] = js.undefined,
    selectPadding: (/* frameLen */ Double, /* maxFrameLen */ Double) => Double = null,
    settings: Settings = null
  ): ServerSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (Http1IncomingMessage != null) __obj.updateDynamic("Http1IncomingMessage")(Http1IncomingMessage.asInstanceOf[js.Any])
    if (Http1ServerResponse != null) __obj.updateDynamic("Http1ServerResponse")(Http1ServerResponse.asInstanceOf[js.Any])
    if (Http2ServerRequest != null) __obj.updateDynamic("Http2ServerRequest")(Http2ServerRequest.asInstanceOf[js.Any])
    if (Http2ServerResponse != null) __obj.updateDynamic("Http2ServerResponse")(Http2ServerResponse.asInstanceOf[js.Any])
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (!js.isUndefined(maxDeflateDynamicTableSize)) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeaderListPairs)) __obj.updateDynamic("maxHeaderListPairs")(maxHeaderListPairs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOutstandingPings)) __obj.updateDynamic("maxOutstandingPings")(maxOutstandingPings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSendHeaderBlockLength)) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSessionMemory)) __obj.updateDynamic("maxSessionMemory")(maxSessionMemory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingStrategy)) __obj.updateDynamic("paddingStrategy")(paddingStrategy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(peerMaxConcurrentStreams)) __obj.updateDynamic("peerMaxConcurrentStreams")(peerMaxConcurrentStreams.get.asInstanceOf[js.Any])
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(js.Any.fromFunction2(selectPadding))
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerSessionOptions]
  }
}

