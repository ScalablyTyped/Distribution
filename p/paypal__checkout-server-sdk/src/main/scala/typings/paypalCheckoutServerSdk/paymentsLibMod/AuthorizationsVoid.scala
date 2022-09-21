package typings.paypalCheckoutServerSdk.paymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AuthorizationsVoid {
  
  trait RequestHeaders
    extends StObject
       with BasePaymentHeaders {
    
    var `PayPal-Auth-Assertion`: js.UndefOr[String] = js.undefined
    
    var Prefer: js.UndefOr[String] = js.undefined
  }
  object RequestHeaders {
    
    inline def apply(Authorization: String): RequestHeaders = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.updateDynamic("Content-Type")("application/json")
      __obj.asInstanceOf[RequestHeaders]
    }
    
    extension [Self <: RequestHeaders](x: Self) {
      
      inline def `setPayPal-Auth-Assertion`(value: String): Self = StObject.set(x, "PayPal-Auth-Assertion", value.asInstanceOf[js.Any])
      
      inline def `setPayPal-Auth-AssertionUndefined`: Self = StObject.set(x, "PayPal-Auth-Assertion", js.undefined)
      
      inline def setPrefer(value: String): Self = StObject.set(x, "Prefer", value.asInstanceOf[js.Any])
      
      inline def setPreferUndefined: Self = StObject.set(x, "Prefer", js.undefined)
    }
  }
}
