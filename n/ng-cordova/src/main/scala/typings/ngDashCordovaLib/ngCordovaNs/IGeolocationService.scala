package typings
package ngDashCordovaLib.ngCordovaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeolocationService extends js.Object {
  def clearWatch(watchID: org.scalablytyped.runtime.StringDictionary[js.Any]): scala.Unit = js.native
  def getCurrentPosition(): angularLib.angularMod.IPromise[IGeoPosition] = js.native
  def getCurrentPosition(options: IGeolocationOptions): angularLib.angularMod.IPromise[IGeoPosition] = js.native
  def watchPosition(): angularLib.angularMod.IPromise[IGeoPosition] = js.native
  def watchPosition(options: IGeolocationOptions): angularLib.angularMod.IPromise[IGeoPosition] = js.native
}

