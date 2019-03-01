package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceMotionAcceleration extends js.Object {
  var timestamp: scala.Double
  var x: scala.Double
  var y: scala.Double
  var z: scala.Double
}

object IDeviceMotionAcceleration {
  @scala.inline
  def apply(timestamp: scala.Double, x: scala.Double, y: scala.Double, z: scala.Double): IDeviceMotionAcceleration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.updateDynamic("z")(z)
    __obj.asInstanceOf[IDeviceMotionAcceleration]
  }
}

