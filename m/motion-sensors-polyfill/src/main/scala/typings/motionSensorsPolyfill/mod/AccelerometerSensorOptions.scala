package typings.motionSensorsPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccelerometerSensorOptions extends SensorOptions {
  var referenceFrame: js.UndefOr[AccelerometerLocalCoordinateSystem] = js.undefined
}

object AccelerometerSensorOptions {
  @scala.inline
  def apply(
    frequency: js.UndefOr[Double] = js.undefined,
    referenceFrame: AccelerometerLocalCoordinateSystem = null
  ): AccelerometerSensorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(frequency)) __obj.updateDynamic("frequency")(frequency.get.asInstanceOf[js.Any])
    if (referenceFrame != null) __obj.updateDynamic("referenceFrame")(referenceFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccelerometerSensorOptions]
  }
}

