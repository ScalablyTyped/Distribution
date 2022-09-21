package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PoiTargetingOptionDetails extends StObject {
  
  /** Output only. The display name of a POI(e.g. "Times Square", "Space Needle"), followed by its full address if available. */
  var displayName: js.UndefOr[String] = js.undefined
  
  /** Output only. Latitude of the POI rounding to 6th decimal place. */
  var latitude: js.UndefOr[Double] = js.undefined
  
  /** Output only. Longitude of the POI rounding to 6th decimal place. */
  var longitude: js.UndefOr[Double] = js.undefined
}
object PoiTargetingOptionDetails {
  
  inline def apply(): PoiTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PoiTargetingOptionDetails]
  }
  
  extension [Self <: PoiTargetingOptionDetails](x: Self) {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    
    inline def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
    
    inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
    
    inline def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
  }
}
