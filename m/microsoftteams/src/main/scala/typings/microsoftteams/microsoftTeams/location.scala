package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object location {
  
  trait Location extends StObject {
    
    /**
      * Accuracy of the coordinates captured
      */
    var accuracy: js.UndefOr[Double] = js.undefined
    
    /**
      * Latitude of the location
      */
    var latitude: Double
    
    /**
      * Longitude of the location
      */
    var longitude: Double
    
    /**
      * Time stamp when the location was captured
      */
    var timestamp: js.UndefOr[Double] = js.undefined
  }
  object Location {
    
    inline def apply(latitude: Double, longitude: Double): Location = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Location]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Location] (val x: Self) extends AnyVal {
      
      inline def setAccuracy(value: Double): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
      
      inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    }
  }
  
  trait LocationProps extends StObject {
    
    /**
      * whether user can alter location or not
      * if false, user will be shown current location
      * and wouldn't be allowed to alter it
      */
    var allowChooseLocation: Boolean
    
    /**
      * whether selected location should be shown to user on map or not.
      * If allowChooseLocation is true, this parameter will be ignored by platform.
      * If allowChooseLocation is false, and this paramater is not provided, default
      * value will be false.
      */
    var showMap: js.UndefOr[Boolean] = js.undefined
  }
  object LocationProps {
    
    inline def apply(allowChooseLocation: Boolean): LocationProps = {
      val __obj = js.Dynamic.literal(allowChooseLocation = allowChooseLocation.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocationProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LocationProps] (val x: Self) extends AnyVal {
      
      inline def setAllowChooseLocation(value: Boolean): Self = StObject.set(x, "allowChooseLocation", value.asInstanceOf[js.Any])
      
      inline def setShowMap(value: Boolean): Self = StObject.set(x, "showMap", value.asInstanceOf[js.Any])
      
      inline def setShowMapUndefined: Self = StObject.set(x, "showMap", js.undefined)
    }
  }
}
