package typings.powerappsComponentFramework

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Accuracy extends StObject {
    
    var accuracy: Double
    
    var altitude: Double
    
    var altitudeAccuracy: Double
    
    var heading: Double
    
    var latitude: Double
    
    var longitude: Double
    
    var speed: Double
  }
  object Accuracy {
    
    @scala.inline
    def apply(
      accuracy: Double,
      altitude: Double,
      altitudeAccuracy: Double,
      heading: Double,
      latitude: Double,
      longitude: Double,
      speed: Double
    ): Accuracy = {
      val __obj = js.Dynamic.literal(accuracy = accuracy.asInstanceOf[js.Any], altitude = altitude.asInstanceOf[js.Any], altitudeAccuracy = altitudeAccuracy.asInstanceOf[js.Any], heading = heading.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any])
      __obj.asInstanceOf[Accuracy]
    }
    
    @scala.inline
    implicit class AccuracyMutableBuilder[Self <: Accuracy] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltitudeAccuracy(value: Double): Self = StObject.set(x, "altitudeAccuracy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
    }
  }
  
  trait Guid extends StObject {
    
    var guid: String
  }
  object Guid {
    
    @scala.inline
    def apply(guid: String): Guid = {
      val __obj = js.Dynamic.literal(guid = guid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Guid]
    }
    
    @scala.inline
    implicit class GuidMutableBuilder[Self <: Guid] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGuid(value: String): Self = StObject.set(x, "guid", value.asInstanceOf[js.Any])
    }
  }
}
