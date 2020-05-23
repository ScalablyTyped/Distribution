package typings.motionSensorsPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("motion-sensors-polyfill", "OrientationSensor")
@js.native
class OrientationSensor () extends Sensor {
  val quaternion: js.Tuple4[Double, Double, Double, Double] = js.native
  def populateMatrix(matrix: RotationMatrixType): Unit = js.native
}

