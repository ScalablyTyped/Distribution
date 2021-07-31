package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubExchangeAssignedTargetingOptionDetails extends StObject {
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_SUB_EXCHANGE`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object SubExchangeAssignedTargetingOptionDetails {
  
  @scala.inline
  def apply(): SubExchangeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubExchangeAssignedTargetingOptionDetails]
  }
  
  @scala.inline
  implicit class SubExchangeAssignedTargetingOptionDetailsMutableBuilder[Self <: SubExchangeAssignedTargetingOptionDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
