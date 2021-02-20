package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDeviceOrientationHeading extends StObject {
  
  var headingAccuracy: js.UndefOr[Double] = js.native
  
  var magneticHeading: Double = js.native
  
  var timestamp: js.UndefOr[Double] = js.native
  
  var trueHeading: js.UndefOr[Double] = js.native
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
