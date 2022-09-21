package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionToRefund extends StObject {
  
  var AmountToRefund: Double
  
  var Comment: js.UndefOr[String] = js.undefined
  
  var POSTransactionId: String
  
  var TransactionId: String
}
object TransactionToRefund {
  
  inline def apply(AmountToRefund: Double, POSTransactionId: String, TransactionId: String): TransactionToRefund = {
    val __obj = js.Dynamic.literal(AmountToRefund = AmountToRefund.asInstanceOf[js.Any], POSTransactionId = POSTransactionId.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionToRefund]
  }
  
  extension [Self <: TransactionToRefund](x: Self) {
    
    inline def setAmountToRefund(value: Double): Self = StObject.set(x, "AmountToRefund", value.asInstanceOf[js.Any])
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setPOSTransactionId(value: String): Self = StObject.set(x, "POSTransactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
  }
}
