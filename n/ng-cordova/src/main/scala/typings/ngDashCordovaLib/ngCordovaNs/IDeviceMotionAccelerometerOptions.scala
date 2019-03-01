package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceMotionAccelerometerOptions extends js.Object {
  var frequency: scala.Double
}

object IDeviceMotionAccelerometerOptions {
  @scala.inline
  def apply(frequency: scala.Double): IDeviceMotionAccelerometerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("frequency")(frequency)
    __obj.asInstanceOf[IDeviceMotionAccelerometerOptions]
  }
}

