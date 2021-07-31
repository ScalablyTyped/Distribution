package typings.phonegap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompassHeading extends StObject {
  
  var headingAccuracy: js.UndefOr[Double] = js.undefined
  
  var magneticHeading: js.UndefOr[Double] = js.undefined
  
  var timestamp: js.UndefOr[Double] = js.undefined
  
  var trueHeading: js.UndefOr[Double] = js.undefined
}
object CompassHeading {
  
  @scala.inline
  def apply(): CompassHeading = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompassHeading]
  }
  
  @scala.inline
  implicit class CompassHeadingMutableBuilder[Self <: CompassHeading] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeadingAccuracy(value: Double): Self = StObject.set(x, "headingAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingAccuracyUndefined: Self = StObject.set(x, "headingAccuracy", js.undefined)
    
    @scala.inline
    def setMagneticHeading(value: Double): Self = StObject.set(x, "magneticHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagneticHeadingUndefined: Self = StObject.set(x, "magneticHeading", js.undefined)
    
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
