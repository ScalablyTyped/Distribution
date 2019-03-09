package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelSplitterOptions extends AudioNodeOptions {
  var numberOfOutputs: js.UndefOr[scala.Double] = js.undefined
}

object ChannelSplitterOptions {
  @scala.inline
  def apply(
    channelCount: scala.Int | scala.Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    numberOfOutputs: scala.Int | scala.Double = null
  ): ChannelSplitterOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (numberOfOutputs != null) __obj.updateDynamic("numberOfOutputs")(numberOfOutputs.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelSplitterOptions]
  }
}

