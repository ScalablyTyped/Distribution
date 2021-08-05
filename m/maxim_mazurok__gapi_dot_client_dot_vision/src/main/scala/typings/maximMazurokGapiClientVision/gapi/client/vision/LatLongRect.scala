package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LatLongRect extends StObject {
  
  /** Max lat/long pair. */
  var maxLatLng: js.UndefOr[LatLng] = js.undefined
  
  /** Min lat/long pair. */
  var minLatLng: js.UndefOr[LatLng] = js.undefined
}
object LatLongRect {
  
  inline def apply(): LatLongRect = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LatLongRect]
  }
  
  extension [Self <: LatLongRect](x: Self) {
    
    inline def setMaxLatLng(value: LatLng): Self = StObject.set(x, "maxLatLng", value.asInstanceOf[js.Any])
    
    inline def setMaxLatLngUndefined: Self = StObject.set(x, "maxLatLng", js.undefined)
    
    inline def setMinLatLng(value: LatLng): Self = StObject.set(x, "minLatLng", value.asInstanceOf[js.Any])
    
    inline def setMinLatLngUndefined: Self = StObject.set(x, "minLatLng", js.undefined)
  }
}
