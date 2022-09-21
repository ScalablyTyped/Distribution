package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OmidAssignedTargetingOptionDetails extends StObject {
  
  /** The type of Open Measurement enabled inventory. Output only in v1. Required in v2. */
  var omid: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_OMID`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object OmidAssignedTargetingOptionDetails {
  
  inline def apply(): OmidAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OmidAssignedTargetingOptionDetails]
  }
  
  extension [Self <: OmidAssignedTargetingOptionDetails](x: Self) {
    
    inline def setOmid(value: String): Self = StObject.set(x, "omid", value.asInstanceOf[js.Any])
    
    inline def setOmidUndefined: Self = StObject.set(x, "omid", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
