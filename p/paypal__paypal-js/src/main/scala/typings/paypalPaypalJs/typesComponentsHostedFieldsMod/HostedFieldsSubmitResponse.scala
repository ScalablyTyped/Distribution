package typings.paypalPaypalJs.typesComponentsHostedFieldsMod

import typings.paypalPaypalJs.anon.Brand
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsSubmitResponse extends StObject {
  
  var authenticationReason: js.UndefOr[String] = js.undefined
  
  var authenticationStatus: js.UndefOr[String] = js.undefined
  
  var card: Brand
  
  var liabilityShift: js.UndefOr[String] = js.undefined
  
  var liabilityShifted: js.UndefOr[Boolean] = js.undefined
  
  var orderId: String
}
object HostedFieldsSubmitResponse {
  
  inline def apply(card: Brand, orderId: String): HostedFieldsSubmitResponse = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], orderId = orderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsSubmitResponse]
  }
  
  extension [Self <: HostedFieldsSubmitResponse](x: Self) {
    
    inline def setAuthenticationReason(value: String): Self = StObject.set(x, "authenticationReason", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationReasonUndefined: Self = StObject.set(x, "authenticationReason", js.undefined)
    
    inline def setAuthenticationStatus(value: String): Self = StObject.set(x, "authenticationStatus", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationStatusUndefined: Self = StObject.set(x, "authenticationStatus", js.undefined)
    
    inline def setCard(value: Brand): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setLiabilityShift(value: String): Self = StObject.set(x, "liabilityShift", value.asInstanceOf[js.Any])
    
    inline def setLiabilityShiftUndefined: Self = StObject.set(x, "liabilityShift", js.undefined)
    
    inline def setLiabilityShifted(value: Boolean): Self = StObject.set(x, "liabilityShifted", value.asInstanceOf[js.Any])
    
    inline def setLiabilityShiftedUndefined: Self = StObject.set(x, "liabilityShifted", js.undefined)
    
    inline def setOrderId(value: String): Self = StObject.set(x, "orderId", value.asInstanceOf[js.Any])
  }
}
