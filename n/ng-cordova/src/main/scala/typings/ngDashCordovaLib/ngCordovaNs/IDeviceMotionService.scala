package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceMotionService extends js.Object {
  def clearWatch(watchId: scala.Double): scala.Unit
  def getCurrentAcceleration(): angularLib.angularMod.angularNs.IPromise[IDeviceMotionAcceleration]
  def watchAcceleration(options: IDeviceMotionAccelerometerOptions): IDeviceMotionWatchPromise
}

object IDeviceMotionService {
  @scala.inline
  def apply(
    clearWatch: scala.Double => scala.Unit,
    getCurrentAcceleration: () => angularLib.angularMod.angularNs.IPromise[IDeviceMotionAcceleration],
    watchAcceleration: IDeviceMotionAccelerometerOptions => IDeviceMotionWatchPromise
  ): IDeviceMotionService = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentAcceleration = js.Any.fromFunction0(getCurrentAcceleration), watchAcceleration = js.Any.fromFunction1(watchAcceleration))
  
    __obj.asInstanceOf[IDeviceMotionService]
  }
}

