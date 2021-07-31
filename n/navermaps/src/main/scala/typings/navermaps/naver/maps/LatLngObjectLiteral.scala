package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLngObjectLiteral extends StObject {
  
  var lat: Double
  
  var lng: Double
}
object LatLngObjectLiteral {
  
  @scala.inline
  def apply(lat: Double, lng: Double): LatLngObjectLiteral = {
    val __obj = js.Dynamic.literal(lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
    __obj.asInstanceOf[LatLngObjectLiteral]
  }
  
  @scala.inline
  implicit class LatLngObjectLiteralMutableBuilder[Self <: LatLngObjectLiteral] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
  }
}
