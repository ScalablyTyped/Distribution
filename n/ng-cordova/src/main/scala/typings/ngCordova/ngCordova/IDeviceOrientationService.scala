package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceOrientationService extends js.Object {
  
  def clearWatch(watchID: Double): Unit = js.native
  
  def getCurrentHeading(): IPromise[IDeviceOrientationHeading] = js.native
  
  def watchHeading(options: IDeviceOrientationWatchOptions): IDeviceOrientationWatchPromise = js.native
}
object IDeviceOrientationService {
  
  @scala.inline
  def apply(
    clearWatch: Double => Unit,
    getCurrentHeading: () => IPromise[IDeviceOrientationHeading],
    watchHeading: IDeviceOrientationWatchOptions => IDeviceOrientationWatchPromise
  ): IDeviceOrientationService = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentHeading = js.Any.fromFunction0(getCurrentHeading), watchHeading = js.Any.fromFunction1(watchHeading))
    __obj.asInstanceOf[IDeviceOrientationService]
  }
  
  @scala.inline
  implicit class IDeviceOrientationServiceOps[Self <: IDeviceOrientationService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setClearWatch(value: Double => Unit): Self = this.set("clearWatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentHeading(value: () => IPromise[IDeviceOrientationHeading]): Self = this.set("getCurrentHeading", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWatchHeading(value: IDeviceOrientationWatchOptions => IDeviceOrientationWatchPromise): Self = this.set("watchHeading", js.Any.fromFunction1(value))
  }
}
