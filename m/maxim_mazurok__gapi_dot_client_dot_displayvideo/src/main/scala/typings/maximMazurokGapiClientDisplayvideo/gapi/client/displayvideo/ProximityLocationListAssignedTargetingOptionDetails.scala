package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProximityLocationListAssignedTargetingOptionDetails extends js.Object {
  
  /** Required. ID of the proximity location list. Should refer to the location_list_id field of a LocationList resource whose type is `TARGETING_LOCATION_TYPE_PROXIMITY`. */
  var proximityLocationListId: js.UndefOr[String] = js.native
  
  /**
    * Required. Radius range for proximity location list. This represents the size of the area around a chosen location that will be targeted. `All` proximity location targeting under a
    * single line item must have the same radius range value. Set this value to match any existing targeting. If updated, this field will change the radius range for all proximity
    * targeting under the line item.
    */
  var proximityRadiusRange: js.UndefOr[String] = js.native
}
object ProximityLocationListAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): ProximityLocationListAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProximityLocationListAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ProximityLocationListAssignedTargetingOptionDetailsOps[Self <: ProximityLocationListAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
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
    def setProximityLocationListId(value: String): Self = this.set("proximityLocationListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProximityLocationListId: Self = this.set("proximityLocationListId", js.undefined)
    
    @scala.inline
    def setProximityRadiusRange(value: String): Self = this.set("proximityRadiusRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProximityRadiusRange: Self = this.set("proximityRadiusRange", js.undefined)
  }
}
