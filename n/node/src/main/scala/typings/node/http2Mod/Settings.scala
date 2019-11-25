package typings.node.http2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Settings extends js.Object {
  var enableConnectProtocol: js.UndefOr[Boolean] = js.undefined
  var enablePush: js.UndefOr[Boolean] = js.undefined
  var headerTableSize: js.UndefOr[Double] = js.undefined
  var initialWindowSize: js.UndefOr[Double] = js.undefined
  var maxConcurrentStreams: js.UndefOr[Double] = js.undefined
  var maxFrameSize: js.UndefOr[Double] = js.undefined
  var maxHeaderListSize: js.UndefOr[Double] = js.undefined
}

object Settings {
  @scala.inline
  def apply(
    enableConnectProtocol: js.UndefOr[Boolean] = js.undefined,
    enablePush: js.UndefOr[Boolean] = js.undefined,
    headerTableSize: Int | Double = null,
    initialWindowSize: Int | Double = null,
    maxConcurrentStreams: Int | Double = null,
    maxFrameSize: Int | Double = null,
    maxHeaderListSize: Int | Double = null
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableConnectProtocol)) __obj.updateDynamic("enableConnectProtocol")(enableConnectProtocol.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePush)) __obj.updateDynamic("enablePush")(enablePush.asInstanceOf[js.Any])
    if (headerTableSize != null) __obj.updateDynamic("headerTableSize")(headerTableSize.asInstanceOf[js.Any])
    if (initialWindowSize != null) __obj.updateDynamic("initialWindowSize")(initialWindowSize.asInstanceOf[js.Any])
    if (maxConcurrentStreams != null) __obj.updateDynamic("maxConcurrentStreams")(maxConcurrentStreams.asInstanceOf[js.Any])
    if (maxFrameSize != null) __obj.updateDynamic("maxFrameSize")(maxFrameSize.asInstanceOf[js.Any])
    if (maxHeaderListSize != null) __obj.updateDynamic("maxHeaderListSize")(maxHeaderListSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

