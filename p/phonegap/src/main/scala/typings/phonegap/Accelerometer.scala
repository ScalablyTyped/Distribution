package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Accelerometer extends StObject {
  
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
