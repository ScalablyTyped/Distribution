package typings.phonegap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accelerometer extends js.Object {
  
  def clearWatch(watchID: Double): Unit = js.native
  
  def getCurrentAcceleration(
    accelerometerSuccess: js.Function1[/* acceleration */ Acceleration, Unit],
    accelerometerError: js.Function0[Unit]
  ): Unit = js.native
  
  def watchAcceleration(
    accelerometerSuccess: js.Function1[/* acceleration */ Acceleration, Unit],
    accelerometerError: js.Function0[Unit]
  ): Unit = js.native
  def watchAcceleration(
    accelerometerSuccess: js.Function1[/* acceleration */ Acceleration, Unit],
    accelerometerError: js.Function0[Unit],
    accelerometerOptions: AccelerometerOptions
  ): Unit = js.native
}
