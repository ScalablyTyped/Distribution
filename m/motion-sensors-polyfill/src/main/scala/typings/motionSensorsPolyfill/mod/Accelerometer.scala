package typings.motionSensorsPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("motion-sensors-polyfill", "Accelerometer")
@js.native
class Accelerometer () extends Sensor {
  def this(options: AccelerometerSensorOptions) = this()
  val x: Double = js.native
  val y: Double = js.native
  val z: Double = js.native
}

