package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends SessionOptions {
  var allowHTTP1: js.UndefOr[scala.Boolean] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    allowHTTP1: js.UndefOr[scala.Boolean] = js.undefined,
    createConnection: js.Function1[/* option */ SessionOptions, nodeLib.streamMod.Duplex] = null,
    maxDeflateDynamicTableSize: scala.Int | scala.Double = null,
    maxReservedRemoteStreams: scala.Int | scala.Double = null,
    maxSendHeaderBlockLength: scala.Int | scala.Double = null,
    paddingStrategy: scala.Int | scala.Double = null,
    peerMaxConcurrentStreams: scala.Int | scala.Double = null,
    selectPadding: js.Function2[/* frameLen */ scala.Double, /* maxFrameLen */ scala.Double, scala.Double] = null,
    settings: Settings = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowHTTP1)) __obj.updateDynamic("allowHTTP1")(allowHTTP1)
    if (createConnection != null) __obj.updateDynamic("createConnection")(createConnection)
    if (maxDeflateDynamicTableSize != null) __obj.updateDynamic("maxDeflateDynamicTableSize")(maxDeflateDynamicTableSize.asInstanceOf[js.Any])
    if (maxReservedRemoteStreams != null) __obj.updateDynamic("maxReservedRemoteStreams")(maxReservedRemoteStreams.asInstanceOf[js.Any])
    if (maxSendHeaderBlockLength != null) __obj.updateDynamic("maxSendHeaderBlockLength")(maxSendHeaderBlockLength.asInstanceOf[js.Any])
    if (paddingStrategy != null) __obj.updateDynamic("paddingStrategy")(paddingStrategy.asInstanceOf[js.Any])
    if (peerMaxConcurrentStreams != null) __obj.updateDynamic("peerMaxConcurrentStreams")(peerMaxConcurrentStreams.asInstanceOf[js.Any])
    if (selectPadding != null) __obj.updateDynamic("selectPadding")(selectPadding)
    if (settings != null) __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[ServerOptions]
  }
}

