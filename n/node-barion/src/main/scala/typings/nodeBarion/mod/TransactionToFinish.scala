package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionToFinish extends StObject {
  
  var Comment: js.UndefOr[String] = js.undefined
  
  var Items: js.UndefOr[js.Array[Item]] = js.undefined
  
  var PayeeTransactions: js.UndefOr[js.Array[PayeeTransaction]] = js.undefined
  
  var Total: Double
  
  var TransactionId: String
}
object TransactionToFinish {
  
  inline def apply(Total: Double, TransactionId: String): TransactionToFinish = {
    val __obj = js.Dynamic.literal(Total = Total.asInstanceOf[js.Any], TransactionId = TransactionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionToFinish]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TransactionToFinish] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setItems(value: js.Array[Item]): Self = StObject.set(x, "Items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "Items", js.undefined)
    
    inline def setItemsVarargs(value: Item*): Self = StObject.set(x, "Items", js.Array(value*))
    
    inline def setPayeeTransactions(value: js.Array[PayeeTransaction]): Self = StObject.set(x, "PayeeTransactions", value.asInstanceOf[js.Any])
    
    inline def setPayeeTransactionsUndefined: Self = StObject.set(x, "PayeeTransactions", js.undefined)
    
    inline def setPayeeTransactionsVarargs(value: PayeeTransaction*): Self = StObject.set(x, "PayeeTransactions", js.Array(value*))
    
    inline def setTotal(value: Double): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "TransactionId", value.asInstanceOf[js.Any])
  }
}
