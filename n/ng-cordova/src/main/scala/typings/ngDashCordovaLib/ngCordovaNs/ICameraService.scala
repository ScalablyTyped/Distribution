package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICameraService extends js.Object {
  def cleanup(): angularLib.angularMod.IPromise[scala.Unit] = js.native
  def getPicture(): angularLib.angularMod.IPromise[java.lang.String] = js.native
  def getPicture(options: cordovaDashPluginDashCameraLib.CameraOptions): angularLib.angularMod.IPromise[java.lang.String] = js.native
}

