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
    clearWatch: js.Function1[scala.Double, scala.Unit],
    getCurrentHeading: js.Function0[angularLib.angularMod.angularNs.IPromise[IDeviceOrientationHeading]],
    watchHeading: js.Function1[IDeviceOrientationWatchOptions, IDeviceOrientationWatchPromise]
  ): IDeviceOrientationService = {
    val __obj = js.Dynamic.literal(clearWatch = clearWatch, getCurrentHeading = getCurrentHeading, watchHeading = watchHeading)
  
    __obj.asInstanceOf[IDeviceOrientationService]
  }
}

