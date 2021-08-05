package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentalStatusAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The parental status of the audience. */
  var parentalStatus: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_PARENTAL_STATUS`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object ParentalStatusAssignedTargetingOptionDetails {
  
  inline def apply(): ParentalStatusAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParentalStatusAssignedTargetingOptionDetails]
  }
  
  extension [Self <: ParentalStatusAssignedTargetingOptionDetails](x: Self) {
    
    inline def setParentalStatus(value: String): Self = StObject.set(x, "parentalStatus", value.asInstanceOf[js.Any])
    
    inline def setParentalStatusUndefined: Self = StObject.set(x, "parentalStatus", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
