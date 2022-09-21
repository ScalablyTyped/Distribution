package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentRefundRequest extends StObject {
  
  var POSKey: String
  
  var PaymentId: String
  
  var TransactionsToRefund: js.Array[TransactionToRefund]
}
object PaymentRefundRequest {
  
  inline def apply(POSKey: String, PaymentId: String, TransactionsToRefund: js.Array[TransactionToRefund]): PaymentRefundRequest = {
    val __obj = js.Dynamic.literal(POSKey = POSKey.asInstanceOf[js.Any], PaymentId = PaymentId.asInstanceOf[js.Any], TransactionsToRefund = TransactionsToRefund.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentRefundRequest]
  }
  
  extension [Self <: PaymentRefundRequest](x: Self) {
    
    inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
    
    inline def setPaymentId(value: String): Self = StObject.set(x, "PaymentId", value.asInstanceOf[js.Any])
    
    inline def setTransactionsToRefund(value: js.Array[TransactionToRefund]): Self = StObject.set(x, "TransactionsToRefund", value.asInstanceOf[js.Any])
    
    inline def setTransactionsToRefundVarargs(value: TransactionToRefund*): Self = StObject.set(x, "TransactionsToRefund", js.Array(value*))
  }
}
