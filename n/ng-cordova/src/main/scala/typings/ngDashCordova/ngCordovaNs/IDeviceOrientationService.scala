package typings.ngDashCordova.ngCordovaNs

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceOrientationService extends js.Object {
  def clearWatch(watchID: Double): Unit
  def getCurrentHeading(): IPromise[IDeviceOrientationHeading]
  def watchHeading(options: IDeviceOrientationWatchOptions): IDeviceOrientationWatchPromise
}

object IDeviceOrientationService {
  @scala.inline
  def apply(
    clearWatch: Double => Unit,
    getCurrentHeading: () => IPromise[IDeviceOrientationHeading],
    watchHeading: IDeviceOrientationWatchOptions => IDeviceOrientationWatchPromise
  ): IDeviceOrientationService = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentHeading = js.Any.fromFunction0(getCurrentHeading), watchHeading = js.Any.fromFunction1(watchHeading))
  
    __obj.asInstanceOf[IDeviceOrientationService]
  }
}

