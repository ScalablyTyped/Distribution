package typings.paypalCheckoutServerSdk.ordersLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object OrdersCapture {
  
  trait RequestData extends StObject {
    
    var payment_source: PaymentSource
  }
  object RequestData {
    
    inline def apply(payment_source: PaymentSource): RequestData = {
      val __obj = js.Dynamic.literal(payment_source = payment_source.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestData]
    }
    
    extension [Self <: RequestData](x: Self) {
      
      inline def setPayment_source(value: PaymentSource): Self = StObject.set(x, "payment_source", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestHeaders
    extends StObject
       with BaseOrderHeaders {
    
    var `PayPal-Client-Metadata-Id`: js.UndefOr[String] = js.undefined
    
    var `PayPal-Request-Id`: js.UndefOr[String] = js.undefined
    
    var Prefer: js.UndefOr[String] = js.undefined
  }
  object RequestHeaders {
    
    inline def apply(Authorization: String): RequestHeaders = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.updateDynamic("Content-Type")("application/json")
      __obj.asInstanceOf[RequestHeaders]
    }
    
    extension [Self <: RequestHeaders](x: Self) {
      
      inline def `setPayPal-Client-Metadata-Id`(value: String): Self = StObject.set(x, "PayPal-Client-Metadata-Id", value.asInstanceOf[js.Any])
      
      inline def `setPayPal-Client-Metadata-IdUndefined`: Self = StObject.set(x, "PayPal-Client-Metadata-Id", js.undefined)
      
      inline def `setPayPal-Request-Id`(value: String): Self = StObject.set(x, "PayPal-Request-Id", value.asInstanceOf[js.Any])
      
      inline def `setPayPal-Request-IdUndefined`: Self = StObject.set(x, "PayPal-Request-Id", js.undefined)
      
      inline def setPrefer(value: String): Self = StObject.set(x, "Prefer", value.asInstanceOf[js.Any])
      
      inline def setPreferUndefined: Self = StObject.set(x, "Prefer", js.undefined)
    }
  }
}
