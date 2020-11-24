package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceMotionService extends js.Object {
  
  def clearWatch(watchId: Double): Unit = js.native
  
  def getCurrentAcceleration(): IPromise[IDeviceMotionAcceleration] = js.native
  
  def watchAcceleration(options: IDeviceMotionAccelerometerOptions): IDeviceMotionWatchPromise = js.native
}
object IDeviceMotionService {
  
  @scala.inline
  def apply(
    clearWatch: Double => Unit,
    getCurrentAcceleration: () => IPromise[IDeviceMotionAcceleration],
    watchAcceleration: IDeviceMotionAccelerometerOptions => IDeviceMotionWatchPromise
  ): IDeviceMotionService = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentAcceleration = js.Any.fromFunction0(getCurrentAcceleration), watchAcceleration = js.Any.fromFunction1(watchAcceleration))
    __obj.asInstanceOf[IDeviceMotionService]
  }
  
  @scala.inline
  implicit class IDeviceMotionServiceOps[Self <: IDeviceMotionService] (val x: Self) extends AnyVal {
    
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
    def setGetCurrentAcceleration(value: () => IPromise[IDeviceMotionAcceleration]): Self = this.set("getCurrentAcceleration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWatchAcceleration(value: IDeviceMotionAccelerometerOptions => IDeviceMotionWatchPromise): Self = this.set("watchAcceleration", js.Any.fromFunction1(value))
  }
}
