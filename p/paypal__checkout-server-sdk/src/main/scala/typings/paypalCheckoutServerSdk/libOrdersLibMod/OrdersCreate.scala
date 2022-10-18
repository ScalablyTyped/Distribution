package typings.paypalCheckoutServerSdk.libOrdersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OrdersCreate {
  
  trait RequestData extends StObject {
    
    var application_context: js.UndefOr[OrderApplicationContext] = js.undefined
    
    var intent: CheckoutPaymentIntent
    
    var payer: js.UndefOr[Payer] = js.undefined
    
    var purchase_units: js.Array[PurchaseUnitRequest]
  }
  object RequestData {
    
    inline def apply(intent: CheckoutPaymentIntent, purchase_units: js.Array[PurchaseUnitRequest]): RequestData = {
      val __obj = js.Dynamic.literal(intent = intent.asInstanceOf[js.Any], purchase_units = purchase_units.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestData]
    }
    
    extension [Self <: RequestData](x: Self) {
      
      inline def setApplication_context(value: OrderApplicationContext): Self = StObject.set(x, "application_context", value.asInstanceOf[js.Any])
      
      inline def setApplication_contextUndefined: Self = StObject.set(x, "application_context", js.undefined)
      
      inline def setIntent(value: CheckoutPaymentIntent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setPayer(value: Payer): Self = StObject.set(x, "payer", value.asInstanceOf[js.Any])
      
      inline def setPayerUndefined: Self = StObject.set(x, "payer", js.undefined)
      
      inline def setPurchase_units(value: js.Array[PurchaseUnitRequest]): Self = StObject.set(x, "purchase_units", value.asInstanceOf[js.Any])
      
      inline def setPurchase_unitsVarargs(value: PurchaseUnitRequest*): Self = StObject.set(x, "purchase_units", js.Array(value*))
    }
  }
  
  trait RequestHeaders
    extends StObject
       with BaseOrderHeaders {
    
    var `PayPal-Partner-Attribution-Id`: js.UndefOr[String] = js.undefined
    
    var Prefer: js.UndefOr[String] = js.undefined
  }
  object RequestHeaders {
    
    inline def apply(Authorization: String): RequestHeaders = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.updateDynamic("Content-Type")("application/json")
      __obj.asInstanceOf[RequestHeaders]
    }
    
    extension [Self <: RequestHeaders](x: Self) {
      
      inline def `setPayPal-Partner-Attribution-Id`(value: String): Self = StObject.set(x, "PayPal-Partner-Attribution-Id", value.asInstanceOf[js.Any])
      
      inline def `setPayPal-Partner-Attribution-IdUndefined`: Self = StObject.set(x, "PayPal-Partner-Attribution-Id", js.undefined)
      
      inline def setPrefer(value: String): Self = StObject.set(x, "Prefer", value.asInstanceOf[js.Any])
      
      inline def setPreferUndefined: Self = StObject.set(x, "Prefer", js.undefined)
    }
  }
}
