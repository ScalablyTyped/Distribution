package typings.node.http2Mod

import typings.node.streamMod.Duplex
import typings.node.urlMod.URL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var createConnection: js.UndefOr[js.Function2[/* authority */ URL, /* option */ SessionOptions, Duplex]] = js.undefined
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
    createConnection: (/* authority */ URL, /* option */ SessionOptions) => Duplex = null,
    maxDeflateDynamicTableSize: Int | Double = null,
    maxHeaderListPairs: Int | Double = null,
    maxOutstandingPings: Int | Double = null,
    maxSendHeaderBlockLength: Int | Double = null,
    maxSessionMemory: Int | Double = null,
    paddingStrategy: Int | Double = null,
    peerMaxConcurrentStreams: Int | Double = null,
    selectPadding: (/* frameLen */ Double, /* maxFrameLen */ Double) => Double = null,
    settings: Settings = null
  ): SessionOptions = {
    val __obj = js.Dynamic.literal()
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
    __obj.asInstanceOf[SessionOptions]
  }
}

