package typings.ngDashCordova.ngCordovaNs

import org.scalablytyped.runtime.StringDictionary
import typings.angular.angularMod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IGeolocationService extends js.Object {
  def clearWatch(watchID: StringDictionary[js.Any]): Unit = js.native
  def getCurrentPosition(): IPromise[IGeoPosition] = js.native
  def getCurrentPosition(options: IGeolocationOptions): IPromise[IGeoPosition] = js.native
  def watchPosition(): IPromise[IGeoPosition] = js.native
  def watchPosition(options: IGeolocationOptions): IPromise[IGeoPosition] = js.native
}

