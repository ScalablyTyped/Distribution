package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDeviceMotionService extends js.Object {
  def clearWatch(watchId: scala.Double): scala.Unit
  def getCurrentAcceleration(): js.Any
  def watchAcceleration(options: IDeviceMotionAccelerometerOptions): IDeviceMotionWatchPromise
}

