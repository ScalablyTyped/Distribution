package typings.maximMazurokGapiClientDisplayvideo.gapi.client.displayvideo

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExchangeAssignedTargetingOptionDetails extends StObject {
  
  /** Required. The targeting_option_id of a TargetingOption of type `TARGETING_TYPE_EXCHANGE`. */
  var targetingOptionId: js.UndefOr[String] = js.undefined
}
object ExchangeAssignedTargetingOptionDetails {
  
  inline def apply(): ExchangeAssignedTargetingOptionDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExchangeAssignedTargetingOptionDetails]
  }
  
  extension [Self <: ExchangeAssignedTargetingOptionDetails](x: Self) {
    
    inline def setTargetingOptionId(value: String): Self = StObject.set(x, "targetingOptionId", value.asInstanceOf[js.Any])
    
    inline def setTargetingOptionIdUndefined: Self = StObject.set(x, "targetingOptionId", js.undefined)
  }
}
