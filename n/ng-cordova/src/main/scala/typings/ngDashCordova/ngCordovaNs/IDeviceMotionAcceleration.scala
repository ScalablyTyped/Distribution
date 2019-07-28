package typings.ngDashCordova.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceMotionAcceleration extends js.Object {
  var timestamp: Double
  var x: Double
  var y: Double
  var z: Double
}

object IDeviceMotionAcceleration {
  @scala.inline
  def apply(timestamp: Double, x: Double, y: Double, z: Double): IDeviceMotionAcceleration = {
    val __obj = js.Dynamic.literal(timestamp = timestamp, x = x, y = y, z = z)
  
    __obj.asInstanceOf[IDeviceMotionAcceleration]
  }
}

