package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GenderAssignedTargetingOptionDetails extends StObject {
  
  /** Output only. The gender of the audience. */
  var gender: js.UndefOr[String] = js.undefined
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_GENDER`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object GenderAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): GenderAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GenderAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class GenderAssignedTargetingOptionDetailsMutableBuilder[Self <: GenderAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGender(value: String): Self = StObject.set(x, "gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenderUndefined: Self = StObject.set(x, "gender", js.undefined)
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
