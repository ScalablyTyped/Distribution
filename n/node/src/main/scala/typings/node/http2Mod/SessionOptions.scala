package typings.node.http2Mod

import typings.node.streamMod.Duplex
import typings.node.urlMod.URL_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var createConnection: js.UndefOr[js.Function2[/* authority */ URL_, /* option */ this.type, Duplex]] = js.undefined
  var maxDeflateDynamicTableSize: js.UndefOr[Double] = js.undefined
  var maxHeaderListPairs: js.UndefOr[Double] = js.undefined
  var maxOutstandingPings: js.UndefOr[Double] = js.undefined
  var maxSendHeaderBlockLength: js.UndefOr[Double] = js.undefined
  var maxSessionMemory: js.UndefOr[Double] = js.undefined
  var paddingStrategy: js.UndefOr[Double] = js.undefined
  var peerMaxConcurrentStreams: js.UndefOr[Double] = js.undefined
  var selectPadding: js.UndefOr[js.Function2[/* frameLen */ Double, /* maxFrameLen */ Double, Double]] = js.undefined
  var settings: js.UndefOr[Settings] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(
    createConnection: (/* authority */ URL_, SessionOptions) => Duplex = null,
    maxDeflateDynamicTableSize: js.UndefOr[Double] = js.undefined,
    maxHeaderListPairs: js.UndefOr[Double] = js.undefined,
    maxOutstandingPings: js.UndefOr[Double] = js.undefined,
    maxSendHeaderBlockLength: js.UndefOr[Double] = js.undefined,
    maxSessionMemory: js.UndefOr[Double] = js.undefined,
    paddingStrategy: js.UndefOr[Double] = js.undefined,
    peerMaxConcurrentStreams: js.UndefOr[Double] = js.undefined,
    selectPadding: (/* frameLen */ Double, /* maxFrameLen */ Double) => Double = null,
    settings: Settings = null
  ): SessionOptions = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[SessionOptions]
  }
}

