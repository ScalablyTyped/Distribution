package typings.ngCordova.ngCordova

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeoCoordinates extends StObject {
  
  var accuracy: js.UndefOr[Double] = js.undefined
  
  var altitude: js.UndefOr[Double] = js.undefined
  
  var altitudeAccuracy: js.UndefOr[Double] = js.undefined
  
  var heading: js.UndefOr[Double] = js.undefined
  
  var latitude: js.UndefOr[Double] = js.undefined
  
  var longitude: js.UndefOr[Double] = js.undefined
  
  var speed: js.UndefOr[Double] = js.undefined
}
object IGeoCoordinates {
  
  @scala.inline
  def apply(): IGeoCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeoCoordinates]
  }
  
  @scala.inline
  implicit class IGeoCoordinatesMutableBuilder[Self <: IGeoCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    @scala.inline
    def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeAccuracyUndefined: Self = StObject.set(x, "altitudeAccuracy", js.undefined)
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
    
    @scala.inline
    def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
  }
}
