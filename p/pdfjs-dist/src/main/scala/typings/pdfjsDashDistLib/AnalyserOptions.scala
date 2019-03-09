package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyserOptions extends AudioNodeOptions {
  var fftSize: js.UndefOr[scala.Double] = js.undefined
  var maxDecibels: js.UndefOr[scala.Double] = js.undefined
  var minDecibels: js.UndefOr[scala.Double] = js.undefined
  var smoothingTimeConstant: js.UndefOr[scala.Double] = js.undefined
}

object AnalyserOptions {
  @scala.inline
  def apply(
    channelCount: scala.Int | scala.Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    fftSize: scala.Int | scala.Double = null,
    maxDecibels: scala.Int | scala.Double = null,
    minDecibels: scala.Int | scala.Double = null,
    smoothingTimeConstant: scala.Int | scala.Double = null
  ): AnalyserOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (fftSize != null) __obj.updateDynamic("fftSize")(fftSize.asInstanceOf[js.Any])
    if (maxDecibels != null) __obj.updateDynamic("maxDecibels")(maxDecibels.asInstanceOf[js.Any])
    if (minDecibels != null) __obj.updateDynamic("minDecibels")(minDecibels.asInstanceOf[js.Any])
    if (smoothingTimeConstant != null) __obj.updateDynamic("smoothingTimeConstant")(smoothingTimeConstant.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyserOptions]
  }
}

