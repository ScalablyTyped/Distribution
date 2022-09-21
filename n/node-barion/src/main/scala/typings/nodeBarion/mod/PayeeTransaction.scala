package typings.nodeBarion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayeeTransaction extends StObject {
  
  var Comment: js.UndefOr[String] = js.undefined
  
  var POSTransactionId: String
  
  var Payee: String
  
  var Total: Double
}
object PayeeTransaction {
  
  inline def apply(POSTransactionId: String, Payee: String, Total: Double): PayeeTransaction = {
    val __obj = js.Dynamic.literal(POSTransactionId = POSTransactionId.asInstanceOf[js.Any], Payee = Payee.asInstanceOf[js.Any], Total = Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayeeTransaction]
  }
  
  extension [Self <: PayeeTransaction](x: Self) {
    
    inline def setComment(value: String): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setPOSTransactionId(value: String): Self = StObject.set(x, "POSTransactionId", value.asInstanceOf[js.Any])
    
    inline def setPayee(value: String): Self = StObject.set(x, "Payee", value.asInstanceOf[js.Any])
    
    inline def setTotal(value: Double): Self = StObject.set(x, "Total", value.asInstanceOf[js.Any])
  }
}
