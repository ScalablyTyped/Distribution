package typings.ngDashCordova.ngCordova

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
    val __obj = js.Dynamic.literal(timestamp = timestamp.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDeviceMotionAcceleration]
  }
}

