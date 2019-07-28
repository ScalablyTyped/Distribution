package typings.ngDashCordova.ngCordovaNs

import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDeviceOrientationWatchPromise extends IPromise[IDeviceOrientationHeading] {
  var watchID: Double = js.native
  def cancel(): Unit = js.native
  def clearWatch(): Unit = js.native
  def clearWatch(watchId: Double): Unit = js.native
}

