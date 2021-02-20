package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoCoordinates extends StObject {
  
  // Optional. The altitude (height), in feet, above sea level for the item. Read-only.
  var altitude: js.UndefOr[NullableOption[Double]] = js.native
  
  // Optional. The latitude, in decimal, for the item. Read-only.
  var latitude: js.UndefOr[NullableOption[Double]] = js.native
  
  // Optional. The longitude, in decimal, for the item. Read-only.
  var longitude: js.UndefOr[NullableOption[Double]] = js.native
}
object GeoCoordinates {
  
  @scala.inline
  def apply(): GeoCoordinates = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoCoordinates]
  }
  
  @scala.inline
  implicit class GeoCoordinatesMutableBuilder[Self <: GeoCoordinates] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltitude(value: NullableOption[Double]): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltitudeNull: Self = StObject.set(x, "altitude", null)
    
    @scala.inline
    def setAltitudeUndefined: Self = StObject.set(x, "altitude", js.undefined)
    
    @scala.inline
    def setLatitude(value: NullableOption[Double]): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatitudeNull: Self = StObject.set(x, "latitude", null)
    
    @scala.inline
    def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    @scala.inline
    def setLongitude(value: NullableOption[Double]): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongitudeNull: Self = StObject.set(x, "longitude", null)
    
    @scala.inline
    def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
