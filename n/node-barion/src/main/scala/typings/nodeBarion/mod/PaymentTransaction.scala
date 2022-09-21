package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentTransaction extends StObject {
  
  var Comment: js.UndefOr[String] = js.undefined
  
  var Items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var POSTransactionId: String
  
  var Payee: String
  
  var PayeeTransactions: js.UndefOr[js.Array[PayeeTransaction]] = js.undefined
  
  var Total: Double
}
object PaymentTransaction {
  
  inline def apply(POSTransactionId: String, Payee: String, Total: Double): PaymentTransaction = {
    val __obj = js.Dynamic.literal(POSTransactionId = POSTransactionId.asInstanceOf[js.Any], Payee = Payee.asInstanceOf[js.Any], Total = Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentTransaction]
  }
  
  extension [Self <: PaymentTransaction](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setPOSTransactionId(value: String): Self = StObject.set(x, "POSTransactionId", value.asInstanceOf[js.Any])
    
    inline def setPayee(value: String): Self = StObject.set(x, "Payee", value.asInstanceOf[js.Any])
    
    inline def setPayeeTransactions(value: js.Array[PayeeTransaction]): Self = StObject.set(x, "PayeeTransactions", value.asInstanceOf[js.Any])
    
    inline def setPayeeTransactionsUndefined: Self = StObject.set(x, "PayeeTransactions", js.undefined)
    
    inline def setPayeeTransactionsVarargs(value: PayeeTransaction*): Self = StObject.set(x, "PayeeTransactions", js.Array(value*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
  }
}
