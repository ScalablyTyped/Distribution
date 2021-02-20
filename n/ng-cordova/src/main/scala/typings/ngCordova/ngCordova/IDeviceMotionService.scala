package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceMotionService extends StObject {
  
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
  implicit class IDeviceMotionServiceMutableBuilder[Self <: IDeviceMotionService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClearWatch(value: Double => Unit): Self = StObject.set(x, "clearWatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCurrentAcceleration(value: () => IPromise[IDeviceMotionAcceleration]): Self = StObject.set(x, "getCurrentAcceleration", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWatchAcceleration(value: IDeviceMotionAccelerometerOptions => IDeviceMotionWatchPromise): Self = StObject.set(x, "watchAcceleration", js.Any.fromFunction1(value))
  }
}
