package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthorizationsCapture {
  
  trait RequestHeaders
    extends StObject
       with BasePaymentHeaders {
    
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
      
      inline def `setPayPal-Request-Id`(value: String): Self = StObject.set(x, "PayPal-Request-Id", value.asInstanceOf[js.Any])
      
      inline def `setPayPal-Request-IdUndefined`: Self = StObject.set(x, "PayPal-Request-Id", js.undefined)
      
      inline def setPrefer(value: String): Self = StObject.set(x, "Prefer", value.asInstanceOf[js.Any])
      
      inline def setPreferUndefined: Self = StObject.set(x, "Prefer", js.undefined)
    }
  }
}
