package typings.navermaps.naver.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PanoramaLocation extends StObject {
  
  var address: String
  
  var coord: LatLng
  
  var panoId: String
  
  var photodate: String
  
  var title: String
}
object PanoramaLocation {
  
  inline def apply(address: String, coord: LatLng, panoId: String, photodate: String, title: String): PanoramaLocation = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], coord = coord.asInstanceOf[js.Any], panoId = panoId.asInstanceOf[js.Any], photodate = photodate.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanoramaLocation]
  }
  
  extension [Self <: PanoramaLocation](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setCoord(value: LatLng): Self = StObject.set(x, "coord", value.asInstanceOf[js.Any])
    
    inline def setPanoId(value: String): Self = StObject.set(x, "panoId", value.asInstanceOf[js.Any])
    
    inline def setPhotodate(value: String): Self = StObject.set(x, "photodate", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
