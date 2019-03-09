package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PannerOptions extends AudioNodeOptions {
  var coneInnerAngle: js.UndefOr[scala.Double] = js.undefined
  var coneOuterAngle: js.UndefOr[scala.Double] = js.undefined
  var coneOuterGain: js.UndefOr[scala.Double] = js.undefined
  var distanceModel: js.UndefOr[DistanceModelType] = js.undefined
  var maxDistance: js.UndefOr[scala.Double] = js.undefined
  var orientationX: js.UndefOr[scala.Double] = js.undefined
  var orientationY: js.UndefOr[scala.Double] = js.undefined
  var orientationZ: js.UndefOr[scala.Double] = js.undefined
  var panningModel: js.UndefOr[PanningModelType] = js.undefined
  var positionX: js.UndefOr[scala.Double] = js.undefined
  var positionY: js.UndefOr[scala.Double] = js.undefined
  var positionZ: js.UndefOr[scala.Double] = js.undefined
  var refDistance: js.UndefOr[scala.Double] = js.undefined
  var rolloffFactor: js.UndefOr[scala.Double] = js.undefined
}

object PannerOptions {
  @scala.inline
  def apply(
    channelCount: scala.Int | scala.Double = null,
    channelCountMode: ChannelCountMode = null,
    channelInterpretation: ChannelInterpretation = null,
    coneInnerAngle: scala.Int | scala.Double = null,
    coneOuterAngle: scala.Int | scala.Double = null,
    coneOuterGain: scala.Int | scala.Double = null,
    distanceModel: DistanceModelType = null,
    maxDistance: scala.Int | scala.Double = null,
    orientationX: scala.Int | scala.Double = null,
    orientationY: scala.Int | scala.Double = null,
    orientationZ: scala.Int | scala.Double = null,
    panningModel: PanningModelType = null,
    positionX: scala.Int | scala.Double = null,
    positionY: scala.Int | scala.Double = null,
    positionZ: scala.Int | scala.Double = null,
    refDistance: scala.Int | scala.Double = null,
    rolloffFactor: scala.Int | scala.Double = null
  ): PannerOptions = {
    val __obj = js.Dynamic.literal()
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (channelCountMode != null) __obj.updateDynamic("channelCountMode")(channelCountMode)
    if (channelInterpretation != null) __obj.updateDynamic("channelInterpretation")(channelInterpretation)
    if (coneInnerAngle != null) __obj.updateDynamic("coneInnerAngle")(coneInnerAngle.asInstanceOf[js.Any])
    if (coneOuterAngle != null) __obj.updateDynamic("coneOuterAngle")(coneOuterAngle.asInstanceOf[js.Any])
    if (coneOuterGain != null) __obj.updateDynamic("coneOuterGain")(coneOuterGain.asInstanceOf[js.Any])
    if (distanceModel != null) __obj.updateDynamic("distanceModel")(distanceModel)
    if (maxDistance != null) __obj.updateDynamic("maxDistance")(maxDistance.asInstanceOf[js.Any])
    if (orientationX != null) __obj.updateDynamic("orientationX")(orientationX.asInstanceOf[js.Any])
    if (orientationY != null) __obj.updateDynamic("orientationY")(orientationY.asInstanceOf[js.Any])
    if (orientationZ != null) __obj.updateDynamic("orientationZ")(orientationZ.asInstanceOf[js.Any])
    if (panningModel != null) __obj.updateDynamic("panningModel")(panningModel)
    if (positionX != null) __obj.updateDynamic("positionX")(positionX.asInstanceOf[js.Any])
    if (positionY != null) __obj.updateDynamic("positionY")(positionY.asInstanceOf[js.Any])
    if (positionZ != null) __obj.updateDynamic("positionZ")(positionZ.asInstanceOf[js.Any])
    if (refDistance != null) __obj.updateDynamic("refDistance")(refDistance.asInstanceOf[js.Any])
    if (rolloffFactor != null) __obj.updateDynamic("rolloffFactor")(rolloffFactor.asInstanceOf[js.Any])
    __obj.asInstanceOf[PannerOptions]
  }
}

