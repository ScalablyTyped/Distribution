package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICameraService extends js.Object {
  def cleanup(): angularLib.angularMod.angularNs.IPromise[scala.Unit] = js.native
  def getPicture(): angularLib.angularMod.angularNs.IPromise[java.lang.String] = js.native
  def getPicture(options: cordovaDashPluginDashCameraLib.CameraOptions): angularLib.angularMod.angularNs.IPromise[java.lang.String] = js.native
}

