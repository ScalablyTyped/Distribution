package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeviceOrientationHeading extends StObject {
  
  var headingAccuracy: js.UndefOr[Double] = js.undefined
  
  var magneticHeading: Double
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var trueHeading: js.UndefOr[Double] = js.undefined
}
object IDeviceOrientationHeading {
  
  @scala.inline
  def apply(magneticHeading: Double): IDeviceOrientationHeading = {
    val __obj = js.Dynamic.literal(magneticHeading = magneticHeading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceOrientationHeading]
  }
  
  @scala.inline
  implicit class IDeviceOrientationHeadingMutableBuilder[Self <: IDeviceOrientationHeading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeadingAccuracy(value: Double): Self = StObject.set(x, "headingAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingAccuracyUndefined: Self = StObject.set(x, "headingAccuracy", js.undefined)
    
    @scala.inline
    def setMagneticHeading(value: Double): Self = StObject.set(x, "magneticHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    @scala.inline
    def setTrueHeading(value: Double): Self = StObject.set(x, "trueHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrueHeadingUndefined: Self = StObject.set(x, "trueHeading", js.undefined)
  }
}
