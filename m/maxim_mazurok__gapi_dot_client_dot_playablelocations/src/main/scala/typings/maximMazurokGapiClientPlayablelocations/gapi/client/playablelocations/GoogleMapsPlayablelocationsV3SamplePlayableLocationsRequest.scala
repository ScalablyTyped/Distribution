package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest extends StObject {
  
  /** Required. Specifies the area to search within for playable locations. */
  var areaFilter: js.UndefOr[GoogleMapsPlayablelocationsV3SampleAreaFilter] = js.native
  
  /** Required. Specifies one or more (up to 5) criteria for filtering the returned playable locations. */
  var criteria: js.UndefOr[js.Array[GoogleMapsPlayablelocationsV3SampleCriterion]] = js.native
}
object GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest {
  
  @scala.inline
  def apply(): GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest]
  }
  
  @scala.inline
  implicit class GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequestMutableBuilder[Self <: GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAreaFilter(value: GoogleMapsPlayablelocationsV3SampleAreaFilter): Self = StObject.set(x, "areaFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaFilterUndefined: Self = StObject.set(x, "areaFilter", js.undefined)
    
    @scala.inline
    def setCriteria(value: js.Array[GoogleMapsPlayablelocationsV3SampleCriterion]): Self = StObject.set(x, "criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriteriaUndefined: Self = StObject.set(x, "criteria", js.undefined)
    
    @scala.inline
    def setCriteriaVarargs(value: GoogleMapsPlayablelocationsV3SampleCriterion*): Self = StObject.set(x, "criteria", js.Array(value :_*))
  }
}
