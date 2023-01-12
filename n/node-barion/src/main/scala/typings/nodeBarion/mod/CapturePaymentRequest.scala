package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapturePaymentRequest extends StObject {
  
  var POSKey: String
  
  var PaymentId: String
  
  var Transactions: js.Array[TransactionToFinish]
}
object CapturePaymentRequest {
  
  inline def apply(POSKey: String, PaymentId: String, Transactions: js.Array[TransactionToFinish]): CapturePaymentRequest = {
    val __obj = js.Dynamic.literal(POSKey = POSKey.asInstanceOf[js.Any], PaymentId = PaymentId.asInstanceOf[js.Any], Transactions = Transactions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapturePaymentRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapturePaymentRequest] (val x: Self) extends AnyVal {
    
    inline def setPOSKey(value: String): Self = StObject.set(x, "POSKey", value.asInstanceOf[js.Any])
    
    inline def setPaymentId(value: String): Self = StObject.set(x, "PaymentId", value.asInstanceOf[js.Any])
    
    inline def setTransactions(value: js.Array[TransactionToFinish]): Self = StObject.set(x, "Transactions", value.asInstanceOf[js.Any])
    
    inline def setTransactionsVarargs(value: TransactionToFinish*): Self = StObject.set(x, "Transactions", js.Array(value*))
  }
}
