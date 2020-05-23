package typings.node.http2Mod

import typings.node.nodeStrings.httpColon
import typings.node.nodeStrings.httpsColon
import typings.node.streamMod.Duplex
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientSessionOptions extends SessionOptions {
  @JSName("createConnection")
  var createConnection_ClientSessionOptions: js.UndefOr[js.Function2[/* authority */ URL_, /* option */ SessionOptions, Duplex]] = js.undefined
  var maxReservedRemoteStreams: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[httpColon | httpsColon] = js.undefined
}

object ClientSessionOptions {
  @scala.inline
  def apply(
    createConnection: (/* authority */ URL_, /* option */ SessionOptions) => Duplex = null,
    maxDeflateDynamicTableSize: js.UndefOr[Double] = js.undefined,
    maxHeaderListPairs: js.UndefOr[Double] = js.undefined,
    maxOutstandingPings: js.UndefOr[Double] = js.undefined,
    maxReservedRemoteStreams: js.UndefOr[Double] = js.undefined,
    maxSendHeaderBlockLength: js.UndefOr[Double] = js.undefined,
    maxSessionMemory: js.UndefOr[Double] = js.undefined,
    paddingStrategy: js.UndefOr[Double] = js.undefined,
    peerMaxConcurrentStreams: js.UndefOr[Double] = js.undefined,
    protocol: httpColon | httpsColon = null,
    selectPadding: (/* frameLen */ Double, /* maxFrameLen */ Double) => Double = null,
    settings: Settings = null
  ): ClientSessionOptions = {
    val __obj = js.Dynamic.literal()
    if (createConnection != null) __obj.updateDynamic("createConnection")(js.Any.fromFunction2(createConnection))
    if (!js.isUndefined(maxDeflateDynamicTableSize)) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeaderListPairs)) __obj.updateDynamic("maxHeaderListPairs")(maxHeaderListPairs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxOutstandingPings)) __obj.updateDynamic("maxOutstandingPings")(maxOutstandingPings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReservedRemoteStreams)) __obj.updateDynamic("maxReservedRemoteStreams")(maxReservedRemoteStreams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSendHeaderBlockLength)) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxSessionMemory)) __obj.updateDynamic("maxSessionMemory")(maxSessionMemory.get.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingStrategy)) __obj.updateDynamic("paddingStrategy")(paddingStrategy.get.asInstanceOf[js.Any])
    if (!js.isUndefined(peerMaxConcurrentStreams)) __obj.updateDynamic("peerMaxConcurrentStreams")(peerMaxConcurrentStreams.get.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(js.Any.fromFunction2(selectPadding))
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientSessionOptions]
  }
}

