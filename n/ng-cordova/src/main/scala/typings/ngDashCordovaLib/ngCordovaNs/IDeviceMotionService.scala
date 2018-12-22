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

