package typings.maximMazurokGapiClientVision.gapi.client.vision

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudVisionV1p4beta1LocationInfo extends StObject {
  
  /** lat/long location coordinates. */
  var latLng: js.UndefOr[LatLng] = js.undefined
}
object GoogleCloudVisionV1p4beta1LocationInfo {
  
  inline def apply(): GoogleCloudVisionV1p4beta1LocationInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudVisionV1p4beta1LocationInfo]
  }
  
  extension [Self <: GoogleCloudVisionV1p4beta1LocationInfo](x: Self) {
    
    inline def setLatLng(value: LatLng): Self = StObject.set(x, "latLng", value.asInstanceOf[js.Any])
    
    inline def setLatLngUndefined: Self = StObject.set(x, "latLng", js.undefined)
  }
}
