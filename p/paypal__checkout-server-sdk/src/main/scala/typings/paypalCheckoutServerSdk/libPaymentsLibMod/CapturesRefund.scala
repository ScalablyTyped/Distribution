package typings.paypalCheckoutServerSdk.libPaymentsLibMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CapturesRefund {
  
  trait RequestData extends StObject {
    
    var amount: Money
    
    var invoice_id: String
    
    var note_to_payer: String
  }
  object RequestData {
    
    inline def apply(amount: Money, invoice_id: String, note_to_payer: String): RequestData = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], invoice_id = invoice_id.asInstanceOf[js.Any], note_to_payer = note_to_payer.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestData] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Money): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setInvoice_id(value: String): Self = StObject.set(x, "invoice_id", value.asInstanceOf[js.Any])
      
      inline def setNote_to_payer(value: String): Self = StObject.set(x, "note_to_payer", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestHeaders
    extends StObject
       with BasePaymentHeaders {
    
    var `PayPal-Auth-Assertion`: js.UndefOr[String] = js.undefined
    
    var `PayPal-Request-Id`: js.UndefOr[String] = js.undefined
    
    var Prefer: js.UndefOr[String] = js.undefined
  }
  object RequestHeaders {
    
    inline def apply(Authorization: String): RequestHeaders = {
      val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
      __obj.updateDynamic("Content-Type")("application/json")
      __obj.asInstanceOf[RequestHeaders]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestHeaders] (val x: Self) extends AnyVal {
      
      inline def `setPayPal-Auth-Assertion`(value: String): Self = StObject.set(x, "PayPal-Auth-Assertion", value.asInstanceOf[js.Any])
      
      inline def `setPayPal-Auth-AssertionUndefined`: Self = StObject.set(x, "PayPal-Auth-Assertion", js.undefined)
      
      inline def `setPayPal-Request-Id`(value: String): Self = StObject.set(x, "PayPal-Request-Id", value.asInstanceOf[js.Any])
      
      inline def `setPayPal-Request-IdUndefined`: Self = StObject.set(x, "PayPal-Request-Id", js.undefined)
      
      inline def setPrefer(value: String): Self = StObject.set(x, "Prefer", value.asInstanceOf[js.Any])
      
      inline def setPreferUndefined: Self = StObject.set(x, "Prefer", js.undefined)
    }
  }
}
