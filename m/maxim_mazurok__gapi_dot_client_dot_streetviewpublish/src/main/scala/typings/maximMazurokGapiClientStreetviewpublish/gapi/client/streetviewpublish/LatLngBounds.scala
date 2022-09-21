package typings.maximMazurokGapiClientStreetviewpublish.gapi.client.streetviewpublish

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLngBounds extends StObject {
  
  /** The northeast corner of these bounds. */
  var northeast: js.UndefOr[LatLng] = js.undefined
  
  /** The southwest corner of these bounds. */
  var southwest: js.UndefOr[LatLng] = js.undefined
}
object LatLngBounds {
  
  inline def apply(): LatLngBounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LatLngBounds]
  }
  
  extension [Self <: LatLngBounds](x: Self) {
    
    inline def setNortheast(value: LatLng): Self = StObject.set(x, "northeast", value.asInstanceOf[js.Any])
    
    inline def setNortheastUndefined: Self = StObject.set(x, "northeast", js.undefined)
    
    inline def setSouthwest(value: LatLng): Self = StObject.set(x, "southwest", value.asInstanceOf[js.Any])
    
    inline def setSouthwestUndefined: Self = StObject.set(x, "southwest", js.undefined)
  }
}
