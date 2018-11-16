package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDeviceOrientationService extends js.Object {
  def clearWatch(watchID: scala.Double): scala.Unit
  def getCurrentHeading(): js.Any
  def watchHeading(options: IDeviceOrientationWatchOptions): IDeviceOrientationWatchPromise
}

