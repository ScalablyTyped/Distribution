package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDeviceOrientationService extends js.Object {
  def clearWatch(watchID: scala.Double): scala.Unit
  def getCurrentHeading(): angularLib.angularMod.angularNs.IPromise[IDeviceOrientationHeading]
  def watchHeading(options: IDeviceOrientationWatchOptions): IDeviceOrientationWatchPromise
}

object IDeviceOrientationService {
  @scala.inline
  def apply(
    clearWatch: scala.Double => scala.Unit,
    getCurrentHeading: () => angularLib.angularMod.angularNs.IPromise[IDeviceOrientationHeading],
    watchHeading: IDeviceOrientationWatchOptions => IDeviceOrientationWatchPromise
  ): IDeviceOrientationService = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentHeading = js.Any.fromFunction0(getCurrentHeading), watchHeading = js.Any.fromFunction1(watchHeading))
  
    __obj.asInstanceOf[IDeviceOrientationService]
  }
}

