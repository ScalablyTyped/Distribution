package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunQueryRequest extends StObject {
  
  /** Starts a new transaction and reads the documents. Defaults to a read-only transaction. The new transaction ID will be returned as the first response in the stream. */
  var newTransaction: js.UndefOr[TransactionOptions] = js.native
  
  /** Reads documents as they were at the given time. This may not be older than 270 seconds. */
  var readTime: js.UndefOr[String] = js.native
  
  /** A structured query. */
  var structuredQuery: js.UndefOr[StructuredQuery] = js.native
  
  /** Reads documents in a transaction. */
  var transaction: js.UndefOr[String] = js.native
}
object RunQueryRequest {
  
  @scala.inline
  def apply(): RunQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunQueryRequest]
  }
  
  @scala.inline
  implicit class RunQueryRequestMutableBuilder[Self <: RunQueryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewTransaction(value: TransactionOptions): Self = StObject.set(x, "newTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTransactionUndefined: Self = StObject.set(x, "newTransaction", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    @scala.inline
    def setStructuredQuery(value: StructuredQuery): Self = StObject.set(x, "structuredQuery", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStructuredQueryUndefined: Self = StObject.set(x, "structuredQuery", js.undefined)
    
    @scala.inline
    def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
