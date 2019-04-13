package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeviceOrientationWatchPromise
  extends angularLib.angularMod.IPromise[IDeviceOrientationHeading] {
  var watchID: scala.Double = js.native
  def cancel(): scala.Unit = js.native
  def clearWatch(): scala.Unit = js.native
  def clearWatch(watchId: scala.Double): scala.Unit = js.native
}

