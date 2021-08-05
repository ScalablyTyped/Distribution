package typings.maximMazurokGapiClientSpanner.gapi.client.spanner

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RollbackRequest extends StObject {
  
  /** Required. The transaction to roll back. */
  var transactionId: js.UndefOr[String] = js.undefined
}
object RollbackRequest {
  
  inline def apply(): RollbackRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RollbackRequest]
  }
  
  extension [Self <: RollbackRequest](x: Self) {
    
    inline def setTransactionId(value: String): Self = StObject.set(x, "transactionId", value.asInstanceOf[js.Any])
    
    inline def setTransactionIdUndefined: Self = StObject.set(x, "transactionId", js.undefined)
  }
}
