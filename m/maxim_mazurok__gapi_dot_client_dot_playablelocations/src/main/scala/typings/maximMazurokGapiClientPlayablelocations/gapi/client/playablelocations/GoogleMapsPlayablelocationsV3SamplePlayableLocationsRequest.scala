package typings.maximMazurokGapiClientPlayablelocations.gapi.client.playablelocations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest extends js.Object {
  
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
  implicit class GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequestOps[Self <: GoogleMapsPlayablelocationsV3SamplePlayableLocationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAreaFilter(value: GoogleMapsPlayablelocationsV3SampleAreaFilter): Self = this.set("areaFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAreaFilter: Self = this.set("areaFilter", js.undefined)
    
    @scala.inline
    def setCriteriaVarargs(value: GoogleMapsPlayablelocationsV3SampleCriterion*): Self = this.set("criteria", js.Array(value :_*))
    
    @scala.inline
    def setCriteria(value: js.Array[GoogleMapsPlayablelocationsV3SampleCriterion]): Self = this.set("criteria", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCriteria: Self = this.set("criteria", js.undefined)
  }
}
