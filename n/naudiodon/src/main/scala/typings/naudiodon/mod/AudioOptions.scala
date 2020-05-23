package typings.naudiodon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioOptions extends js.Object {
  var channelCount: js.UndefOr[Double] = js.undefined
  var deviceId: js.UndefOr[Double] = js.undefined
  var maxQueue: js.UndefOr[Double] = js.undefined
  var sampleFormat: js.UndefOr[Double] = js.undefined
  var sampleRate: js.UndefOr[Double] = js.undefined
}

object AudioOptions {
  @scala.inline
  def apply(
    channelCount: js.UndefOr[Double] = js.undefined,
    deviceId: js.UndefOr[Double] = js.undefined,
    maxQueue: js.UndefOr[Double] = js.undefined,
    sampleFormat: js.UndefOr[Double] = js.undefined,
    sampleRate: js.UndefOr[Double] = js.undefined
  ): AudioOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(channelCount)) __obj.updateDynamic("channelCount")(channelCount.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deviceId)) __obj.updateDynamic("deviceId")(deviceId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxQueue)) __obj.updateDynamic("maxQueue")(maxQueue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleFormat)) __obj.updateDynamic("sampleFormat")(sampleFormat.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sampleRate)) __obj.updateDynamic("sampleRate")(sampleRate.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioOptions]
  }
}

