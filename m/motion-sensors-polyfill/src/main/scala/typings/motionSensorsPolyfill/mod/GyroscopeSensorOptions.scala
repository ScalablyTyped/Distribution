package typings.motionSensorsPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GyroscopeSensorOptions extends js.Object {
  var referenceFrame: js.UndefOr[GyroscopeLocalCoordinateSystem] = js.undefined
}

object GyroscopeSensorOptions {
  @scala.inline
  def apply(referenceFrame: GyroscopeLocalCoordinateSystem = null): GyroscopeSensorOptions = {
    val __obj = js.Dynamic.literal()
    if (referenceFrame != null) __obj.updateDynamic("referenceFrame")(referenceFrame.asInstanceOf[js.Any])
    __obj.asInstanceOf[GyroscopeSensorOptions]
  }
}

