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
    clearWatch: js.Function1[scala.Double, scala.Unit],
    getCurrentAcceleration: js.Function0[angularLib.angularMod.angularNs.IPromise[IDeviceMotionAcceleration]],
    watchAcceleration: js.Function1[IDeviceMotionAccelerometerOptions, IDeviceMotionWatchPromise]
  ): IDeviceMotionService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clearWatch")(clearWatch)
    __obj.updateDynamic("getCurrentAcceleration")(getCurrentAcceleration)
    __obj.updateDynamic("watchAcceleration")(watchAcceleration)
    __obj.asInstanceOf[IDeviceMotionService]
  }
}

