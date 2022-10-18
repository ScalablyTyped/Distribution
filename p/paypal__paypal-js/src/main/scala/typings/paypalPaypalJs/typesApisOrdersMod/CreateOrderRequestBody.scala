package typings.paypalPaypalJs.typesApisOrdersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrderRequestBody extends StObject {
  
  var application_context: js.UndefOr[OrderApplicationContext] = js.undefined
  
  var intent: js.UndefOr[INTENT] = js.undefined
  
  var payer: js.UndefOr[Payer] = js.undefined
  
  var purchase_units: js.Array[PurchaseUnit]
}
object CreateOrderRequestBody {
  
  inline def apply(purchase_units: js.Array[PurchaseUnit]): CreateOrderRequestBody = {
    val __obj = js.Dynamic.literal(purchase_units = purchase_units.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateOrderRequestBody]
  }
  
  extension [Self <: CreateOrderRequestBody](x: Self) {
    
    inline def setApplication_context(value: OrderApplicationContext): Self = StObject.set(x, "application_context", value.asInstanceOf[js.Any])
    
    inline def setApplication_contextUndefined: Self = StObject.set(x, "application_context", js.undefined)
    
    inline def setIntent(value: INTENT): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
    
    inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
    
    inline def setPayer(value: Payer): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
    
    inline def setPayerUndefined: Self = StObject.set(x, "payer", js.undefined)
    
    inline def setPurchase_units(value: js.Array[PurchaseUnit]): Self = StObject.set(x, "purchase_units", value.asInstanceOf[js.Any])
    
    inline def setPurchase_unitsVarargs(value: PurchaseUnit*): Self = StObject.set(x, "purchase_units", js.Array(value*))
  }
}
