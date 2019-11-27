package typings.naudiodon.naudiodonMod

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
    channelCount: Int | Double = null,
    deviceId: Int | Double = null,
    maxQueue: Int | Double = null,
    sampleFormat: Int | Double = null,
    sampleRate: Int | Double = null
  ): AudioOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (maxQueue != null) __obj.updateDynamic("maxQueue")(maxQueue.asInstanceOf[js.Any])
    if (sampleFormat != null) __obj.updateDynamic("sampleFormat")(sampleFormat.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioOptions]
  }
}

