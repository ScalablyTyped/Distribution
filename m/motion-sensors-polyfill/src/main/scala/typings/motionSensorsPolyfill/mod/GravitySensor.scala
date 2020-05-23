package typings.motionSensorsPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("motion-sensors-polyfill", "GravitySensor")
@js.native
class GravitySensor () extends Accelerometer {
  def this(options: AccelerometerSensorOptions) = this()
}

