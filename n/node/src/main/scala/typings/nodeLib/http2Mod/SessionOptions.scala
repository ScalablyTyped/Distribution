package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionOptions extends js.Object {
  var createConnection: js.UndefOr[
    js.Function2[
      /* authority */ nodeLib.urlMod.URL, 
      /* option */ SessionOptions, 
      nodeLib.streamMod.Duplex
    ]
  ] = js.undefined
  var maxDeflateDynamicTableSize: js.UndefOr[scala.Double] = js.undefined
  var maxHeaderListPairs: js.UndefOr[scala.Double] = js.undefined
  var maxOutstandingPings: js.UndefOr[scala.Double] = js.undefined
  var maxSendHeaderBlockLength: js.UndefOr[scala.Double] = js.undefined
  var maxSessionMemory: js.UndefOr[scala.Double] = js.undefined
  var paddingStrategy: js.UndefOr[scala.Double] = js.undefined
  var peerMaxConcurrentStreams: js.UndefOr[scala.Double] = js.undefined
  var selectPadding: js.UndefOr[
    js.Function2[/* frameLen */ scala.Double, /* maxFrameLen */ scala.Double, scala.Double]
  ] = js.undefined
  var settings: js.UndefOr[Settings] = js.undefined
}

object SessionOptions {
  @scala.inline
  def apply(
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

