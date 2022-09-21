package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenderAssignedTargetingOptionDetails extends StObject {
  
  /** The gender of the audience. Output only in v1. Required in v2. */
  var gender: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_GENDER`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object GenderAssignedTargetingOptionDetails {
  
  inline def apply(): GenderAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenderAssignedTargetingOptionDetails]
  }
  
  extension [Self <: GenderAssignedTargetingOptionDetails](x: Self) {
    
    inline def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    inline def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
