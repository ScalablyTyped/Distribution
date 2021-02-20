package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProximityLocationListAssignedTargetingOptionDetails extends StObject {
  
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
  implicit class ProximityLocationListAssignedTargetingOptionDetailsMutableBuilder[Self <: ProximityLocationListAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setProximityLocationListId(value: String): Self = StObject.set(x, "proximityLocationListId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProximityLocationListIdUndefined: Self = StObject.set(x, "proximityLocationListId", js.undefined)
    
    @scala.inline
    def setProximityRadiusRange(value: String): Self = StObject.set(x, "proximityRadiusRange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProximityRadiusRangeUndefined: Self = StObject.set(x, "proximityRadiusRange", js.undefined)
  }
}
