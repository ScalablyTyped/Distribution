package typings
package phonegapLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Accelerometer extends js.Object {
  def clearWatch(watchID: scala.Double): scala.Unit = js.native
  def getCurrentAcceleration(
    accelerometerSuccess: js.Function1[/* acceleration */ Acceleration, scala.Unit],
    accelerometerError: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def watchAcceleration(
    accelerometerSuccess: js.Function1[/* acceleration */ Acceleration, scala.Unit],
    accelerometerError: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def watchAcceleration(
    accelerometerSuccess: js.Function1[/* acceleration */ Acceleration, scala.Unit],
    accelerometerError: js.Function0[scala.Unit],
    accelerometerOptions: AccelerometerOptions
  ): scala.Unit = js.native
}

