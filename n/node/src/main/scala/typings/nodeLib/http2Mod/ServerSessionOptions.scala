package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerSessionOptions extends SessionOptions {
  var Http1IncomingMessage: js.UndefOr[
    org.scalablytyped.runtime.Instantiable1[/* socket */ nodeLib.netMod.Socket, nodeLib.httpMod.IncomingMessage]
  ] = js.undefined
  var Http1ServerResponse: js.UndefOr[
    org.scalablytyped.runtime.Instantiable1[/* req */ nodeLib.httpMod.IncomingMessage, nodeLib.httpMod.ServerResponse]
  ] = js.undefined
  var Http2ServerRequest: js.UndefOr[org.scalablytyped.runtime.Instantiable0[Http2ServerRequest]] = js.undefined
  var Http2ServerResponse: js.UndefOr[org.scalablytyped.runtime.Instantiable0[Http2ServerResponse]] = js.undefined
}

object ServerSessionOptions {
  @scala.inline
  def apply(
    Http1IncomingMessage: org.scalablytyped.runtime.Instantiable1[/* socket */ nodeLib.netMod.Socket, nodeLib.httpMod.IncomingMessage] = null,
    Http1ServerResponse: org.scalablytyped.runtime.Instantiable1[/* req */ nodeLib.httpMod.IncomingMessage, nodeLib.httpMod.ServerResponse] = null,
    Http2ServerRequest: org.scalablytyped.runtime.Instantiable0[Http2ServerRequest] = null,
    Http2ServerResponse: org.scalablytyped.runtime.Instantiable0[Http2ServerResponse] = null,
    createConnection: (/* authority */ nodeLib.urlMod.URL, /* option */ SessionOptions) => nodeLib.streamMod.Duplex = null,
    maxDeflateDynamicTableSize: scala.Int | scala.Double = null,
    maxHeaderListPairs: scala.Int | scala.Double = null,
    maxOutstandingPings: scala.Int | scala.Double = null,
    maxSendHeaderBlockLength: scala.Int | scala.Double = null,
    maxSessionMemory: scala.Int | scala.Double = null,
    paddingStrategy: scala.Int | scala.Double = null,
    peerMaxConcurrentStreams: scala.Int | scala.Double = null,
    selectPadding: (/* frameLen */ scala.Double, /* maxFrameLen */ scala.Double) => scala.Double = null,
    settings: Settings = null
  ): ServerSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (Http1IncomingMessage != null) __obj.updateDynamic("Http1IncomingMessage")(Http1IncomingMessage)
    if (Http1ServerResponse != null) __obj.updateDynamic("Http1ServerResponse")(Http1ServerResponse)
    if (Http2ServerRequest != null) __obj.updateDynamic("Http2ServerRequest")(Http2ServerRequest)
    if (Http2ServerResponse != null) __obj.updateDynamic("Http2ServerResponse")(Http2ServerResponse)
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (maxDeflateDynamicTableSize != null) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.asInstanceOf[js.Any])
    if (maxHeaderListPairs != null) __obj.updateDynamic("maxHeaderListPairs")(maxHeaderListPairs.asInstanceOf[js.Any])
    if (maxOutstandingPings != null) __obj.updateDynamic("maxOutstandingPings")(maxOutstandingPings.asInstanceOf[js.Any])
    if (maxSendHeaderBlockLength != null) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.asInstanceOf[js.Any])
    if (maxSessionMemory != null) __obj.updateDynamic("maxSessionMemory")(maxSessionMemory.asInstanceOf[js.Any])
    if (paddingStrategy != null) __obj.updateDynamic("paddingStrategy")(paddingStrategy.asInstanceOf[js.Any])
    if (peerMaxConcurrentStreams != null) __obj.updateDynamic("peerMaxConcurrentStreams")(peerMaxConcurrentStreams.asInstanceOf[js.Any])
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(js.Any.fromFunction2(selectPadding))
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[ServerSessionOptions]
  }
}

