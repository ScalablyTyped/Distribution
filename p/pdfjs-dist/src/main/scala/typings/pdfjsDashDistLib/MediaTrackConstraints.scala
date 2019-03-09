package typings
package pdfjsDashDistLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaTrackConstraints extends MediaTrackConstraintSet {
  var advanced: js.UndefOr[js.Array[MediaTrackConstraintSet]] = js.undefined
}

object MediaTrackConstraints {
  @scala.inline
  def apply(
    advanced: js.Array[MediaTrackConstraintSet] = null,
    aspectRatio: scala.Double | ConstrainDoubleRange = null,
    channelCount: scala.Double | ConstrainLongRange = null,
    deviceId: java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters = null,
    displaySurface: java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters = null,
    echoCancellation: scala.Boolean | ConstrainBooleanParameters = null,
    facingMode: java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters = null,
    frameRate: scala.Double | ConstrainDoubleRange = null,
    groupId: java.lang.String | js.Array[java.lang.String] | ConstrainDOMStringParameters = null,
    height: scala.Double | ConstrainLongRange = null,
    latency: scala.Double | ConstrainDoubleRange = null,
    logicalSurface: scala.Boolean | ConstrainBooleanParameters = null,
    sampleRate: scala.Double | ConstrainLongRange = null,
    sampleSize: scala.Double | ConstrainLongRange = null,
    volume: scala.Double | ConstrainDoubleRange = null,
    width: scala.Double | ConstrainLongRange = null
  ): MediaTrackConstraints = {
    val __obj = js.Dynamic.literal()
    if (advanced != null) __obj.updateDynamic("advanced")(advanced)
    if (aspectRatio != null) __obj.updateDynamic("aspectRatio")(aspectRatio.asInstanceOf[js.Any])
    if (channelCount != null) __obj.updateDynamic("channelCount")(channelCount.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (displaySurface != null) __obj.updateDynamic("displaySurface")(displaySurface.asInstanceOf[js.Any])
    if (echoCancellation != null) __obj.updateDynamic("echoCancellation")(echoCancellation.asInstanceOf[js.Any])
    if (facingMode != null) __obj.updateDynamic("facingMode")(facingMode.asInstanceOf[js.Any])
    if (frameRate != null) __obj.updateDynamic("frameRate")(frameRate.asInstanceOf[js.Any])
    if (groupId != null) __obj.updateDynamic("groupId")(groupId.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (latency != null) __obj.updateDynamic("latency")(latency.asInstanceOf[js.Any])
    if (logicalSurface != null) __obj.updateDynamic("logicalSurface")(logicalSurface.asInstanceOf[js.Any])
    if (sampleRate != null) __obj.updateDynamic("sampleRate")(sampleRate.asInstanceOf[js.Any])
    if (sampleSize != null) __obj.updateDynamic("sampleSize")(sampleSize.asInstanceOf[js.Any])
    if (volume != null) __obj.updateDynamic("volume")(volume.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaTrackConstraints]
  }
}

