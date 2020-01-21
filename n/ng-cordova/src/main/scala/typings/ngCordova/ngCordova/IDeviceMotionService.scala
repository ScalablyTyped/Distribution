package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceMotionService extends js.Object {
  def clearWatch(watchId: Double): Unit
  def getCurrentAcceleration(): IPromise[IDeviceMotionAcceleration]
  def watchAcceleration(options: IDeviceMotionAccelerometerOptions): IDeviceMotionWatchPromise
}

object IDeviceMotionService {
  @scala.inline
  def apply(
    clearWatch: Double => Unit,
    getCurrentAcceleration: () => IPromise[IDeviceMotionAcceleration],
    watchAcceleration: IDeviceMotionAccelerometerOptions => IDeviceMotionWatchPromise
  ): IDeviceMotionService = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentAcceleration = js.Any.fromFunction0(getCurrentAcceleration), watchAcceleration = js.Any.fromFunction1(watchAcceleration))
  
    __obj.asInstanceOf[IDeviceMotionService]
  }
}

