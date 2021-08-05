package typings.ngCordova.ngCordova

import typings.angular.mod.IPromise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeviceOrientationService extends StObject {
  
  def clearWatch(watchID: Double): Unit
  
  def getCurrentHeading(): IPromise[IDeviceOrientationHeading]
  
  def watchHeading(options: IDeviceOrientationWatchOptions): IDeviceOrientationWatchPromise
}
object IDeviceOrientationService {
  
  inline def apply(
    clearWatch: Double => Unit,
    getCurrentHeading: () => IPromise[IDeviceOrientationHeading],
    watchHeading: IDeviceOrientationWatchOptions => IDeviceOrientationWatchPromise
  ): IDeviceOrientationService = {
    val __obj = js.Dynamic.literal(clearWatch = js.Any.fromFunction1(clearWatch), getCurrentHeading = js.Any.fromFunction0(getCurrentHeading), watchHeading = js.Any.fromFunction1(watchHeading))
    __obj.asInstanceOf[IDeviceOrientationService]
  }
  
  extension [Self <: IDeviceOrientationService](x: Self) {
    
    inline def setClearWatch(value: Double => Unit): Self = StObject.set(x, "clearWatch", js.Any.fromFunction1(value))
    
    inline def setGetCurrentHeading(value: () => IPromise[IDeviceOrientationHeading]): Self = StObject.set(x, "getCurrentHeading", js.Any.fromFunction0(value))
    
    inline def setWatchHeading(value: IDeviceOrientationWatchOptions => IDeviceOrientationWatchPromise): Self = StObject.set(x, "watchHeading", js.Any.fromFunction1(value))
  }
}
