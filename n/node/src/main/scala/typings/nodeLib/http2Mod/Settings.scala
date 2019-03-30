package typings
package nodeLib.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var enableConnectProtocol: js.UndefOr[scala.Boolean] = js.undefined
  var enablePush: js.UndefOr[scala.Boolean] = js.undefined
  var headerTableSize: js.UndefOr[scala.Double] = js.undefined
  var initialWindowSize: js.UndefOr[scala.Double] = js.undefined
  var maxConcurrentStreams: js.UndefOr[scala.Double] = js.undefined
  var maxFrameSize: js.UndefOr[scala.Double] = js.undefined
  var maxHeaderListSize: js.UndefOr[scala.Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    enableConnectProtocol: js.UndefOr[scala.Boolean] = js.undefined,
    enablePush: js.UndefOr[scala.Boolean] = js.undefined,
    headerTableSize: scala.Int | scala.Double = null,
    initialWindowSize: scala.Int | scala.Double = null,
    maxConcurrentStreams: scala.Int | scala.Double = null,
    maxFrameSize: scala.Int | scala.Double = null,
    maxHeaderListSize: scala.Int | scala.Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableConnectProtocol)) __obj.updateDynamic("enableConnectProtocol")(enableConnectProtocol)
    if (!js.isUndefined(enablePush)) __obj.updateDynamic("enablePush")(enablePush)
    if (headerTableSize != null) __obj.updateDynamic("headerTableSize")(headerTableSize.asInstanceOf[js.Any])
    if (initialWindowSize != null) __obj.updateDynamic("initialWindowSize")(initialWindowSize.asInstanceOf[js.Any])
    if (maxConcurrentStreams != null) __obj.updateDynamic("maxConcurrentStreams")(maxConcurrentStreams.asInstanceOf[js.Any])
    if (maxFrameSize != null) __obj.updateDynamic("maxFrameSize")(maxFrameSize.asInstanceOf[js.Any])
    if (maxHeaderListSize != null) __obj.updateDynamic("maxHeaderListSize")(maxHeaderListSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

