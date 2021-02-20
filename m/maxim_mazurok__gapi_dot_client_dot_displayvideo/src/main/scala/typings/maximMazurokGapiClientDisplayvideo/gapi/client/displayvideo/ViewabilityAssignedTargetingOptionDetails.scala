package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewabilityAssignedTargetingOptionDetails extends StObject {
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_VIEWABILITY` (e.g., "509010" for targeting the `VIEWABILITY_10_PERCENT_OR_MORE` option). */
  var targetingOptionId: js.UndefOr[String] = js.native
  
  /** Output only. The predicted viewability percentage. */
  var viewability: js.UndefOr[String] = js.native
}
object ViewabilityAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): ViewabilityAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewabilityAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class ViewabilityAssignedTargetingOptionDetailsMutableBuilder[Self <: ViewabilityAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
    
    @scala.inline
    def setViewability(value: String): Self = StObject.set(x, "viewability", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewabilityUndefined: Self = StObject.set(x, "viewability", js.undefined)
  }
}
