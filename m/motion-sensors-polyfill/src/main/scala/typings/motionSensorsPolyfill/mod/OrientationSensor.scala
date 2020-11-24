package typings.motionSensorsPolyfill.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("motion-sensors-polyfill", "OrientationSensor")
@js.native
class OrientationSensor () extends Sensor {
  
  def populateMatrix(matrix: RotationMatrixType): Unit = js.native
  
  val quaternion: js.Tuple4[Double, Double, Double, Double] = js.native
}
