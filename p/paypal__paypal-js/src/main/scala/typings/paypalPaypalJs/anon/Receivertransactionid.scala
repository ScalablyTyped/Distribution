package typings.paypalPaypalJs.anon

import typings.paypalPaypalJs.typesApisCommonsMod.AmountWithCurrencyCode
import typings.paypalPaypalJs.typesApisSubscriptionsCommonsMod.PaymentStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Receivertransactionid extends StObject {
  
  /** The currency and amount for a financial transaction, such as a balance or payment due. */
  var amount: AmountWithCurrencyCode
  
  /** The receiver side PayPal-generated transaction ID. */
  var receiver_transaction_id: js.UndefOr[String] = js.undefined
  
  /** The sender side PayPal-generated transaction ID. */
  var sender_transaction_id: js.UndefOr[String] = js.undefined
  
  /** The status of the captured payment. */
  var status: js.UndefOr[PaymentStatus] = js.undefined
  
  /** The date and time, in [Internet date and time format](https://tools.ietf.org/html/rfc3339#section-5.6). */
  var time: String
}
object Receivertransactionid {
  
  inline def apply(amount: AmountWithCurrencyCode, time: String): Receivertransactionid = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Receivertransactionid]
  }
  
  extension [Self <: Receivertransactionid](x: Self) {
    
    inline def setAmount(value: AmountWithCurrencyCode): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
    
    inline def setReceiver_transaction_id(value: String): Self = StObject.set(x, "receiver_transaction_id", value.asInstanceOf[js.Any])
    
    inline def setReceiver_transaction_idUndefined: Self = StObject.set(x, "receiver_transaction_id", js.undefined)
    
    inline def setSender_transaction_id(value: String): Self = StObject.set(x, "sender_transaction_id", value.asInstanceOf[js.Any])
    
    inline def setSender_transaction_idUndefined: Self = StObject.set(x, "sender_transaction_id", js.undefined)
    
    inline def setStatus(value: PaymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
  }
}
