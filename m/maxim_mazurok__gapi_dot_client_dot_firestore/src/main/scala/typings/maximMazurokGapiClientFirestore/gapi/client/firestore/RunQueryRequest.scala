package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunQueryRequest extends StObject {
  
  /** Starts a new transaction and reads the documents. Defaults to a read-only transaction. The new transaction ID will be returned as the first response in the stream. */
  var newTransaction: js.UndefOr[TransactionOptions] = js.undefined
  
  /** Reads documents as they were at the given time. This may not be older than 270 seconds. */
  var readTime: js.UndefOr[String] = js.undefined
  
  /** A structured query. */
  var structuredQuery: js.UndefOr[StructuredQuery] = js.undefined
  
  /** Run the query within an already active transaction. The value here is the opaque transaction ID to execute the query in. */
  var transaction: js.UndefOr[String] = js.undefined
}
object RunQueryRequest {
  
  inline def apply(): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryRequest]
  }
  
  extension [Self <: RunQueryRequest](x: Self) {
    
    inline def setNewTransaction(value: TransactionOptions): Self = StObject.set(x, "newTransaction", value.asInstanceOf[js.Any])
    
    inline def setNewTransactionUndefined: Self = StObject.set(x, "newTransaction", js.undefined)
    
    inline def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    inline def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    inline def setStructuredQuery(value: StructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
    
    inline def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
    
    inline def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    inline def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
