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
    headerTableSize: js.UndefOr[Double] = js.undefined,
    initialWindowSize: js.UndefOr[Double] = js.undefined,
    maxConcurrentStreams: js.UndefOr[Double] = js.undefined,
    maxFrameSize: js.UndefOr[Double] = js.undefined,
    maxHeaderListSize: js.UndefOr[Double] = js.undefined
  ): Settings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableConnectProtocol)) __obj.updateDynamic("enableConnectProtocol")(enableConnectProtocol.get.asInstanceOf[js.Any])
    if (!js.isUndefined(enablePush)) __obj.updateDynamic("enablePush")(enablePush.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headerTableSize)) __obj.updateDynamic("headerTableSize")(headerTableSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(initialWindowSize)) __obj.updateDynamic("initialWindowSize")(initialWindowSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxConcurrentStreams)) __obj.updateDynamic("maxConcurrentStreams")(maxConcurrentStreams.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFrameSize)) __obj.updateDynamic("maxFrameSize")(maxFrameSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeaderListSize)) __obj.updateDynamic("maxHeaderListSize")(maxHeaderListSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
}

