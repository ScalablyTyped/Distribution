package typings.motionSensorsPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("motion-sensors-polyfill", "Gyroscope")
@js.native
class Gyroscope () extends Sensor {
  def this(options: GyroscopeSensorOptions) = this()
  val x: Double = js.native
  val y: Double = js.native
  val z: Double = js.native
}

