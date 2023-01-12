package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest extends StObject {
  
  /** Required. Specifies the area to search within for playable locations. */
  var areaFilter: js.UndefOr[GoogleMapsPlayablelocationsV3SampleAreaFilter] = js.undefined
  
  /** Required. Specifies one or more (up to 5) criteria for filtering the returned playable locations. */
  var criteria: js.UndefOr[js.Array[GoogleMapsPlayablelocationsV3SampleCriterion]] = js.undefined
}
object GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest {
  
  inline def apply(): GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest] (val x: Self) extends AnyVal {
    
    inline def setAreaFilter(value: GoogleMapsPlayablelocationsV3SampleAreaFilter): Self = StObject.set(x, "areaFilter", value.asInstanceOf[js.Any])
    
    inline def setAreaFilterUndefined: Self = StObject.set(x, "areaFilter", js.undefined)
    
    inline def setCriteria(value: js.Array[GoogleMapsPlayablelocationsV3SampleCriterion]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    inline def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    inline def setCriteriaVarargs(value: GoogleMapsPlayablelocationsV3SampleCriterion*): Self = StObject.set(x, "criteria", js.Array(value*))
  }
}
