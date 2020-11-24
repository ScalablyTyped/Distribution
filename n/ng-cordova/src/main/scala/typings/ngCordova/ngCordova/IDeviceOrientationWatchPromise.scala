package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceOrientationWatchPromise extends IPromise[IDeviceOrientationHeading] {
  
  def cancel(): Unit = js.native
  
  def clearWatch(): Unit = js.native
  def clearWatch(watchId: Double): Unit = js.native
  
  var watchID: Double = js.native
}
