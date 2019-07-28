package typings.ngDashCordova.ngCordovaNs

import typings.angular.angularMod.IPromise
import typings.cordovaDashPluginDashCamera.CameraOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICameraService extends js.Object {
  def cleanup(): IPromise[Unit] = js.native
  def getPicture(): IPromise[String] = js.native
  def getPicture(options: CameraOptions): IPromise[String] = js.native
}

