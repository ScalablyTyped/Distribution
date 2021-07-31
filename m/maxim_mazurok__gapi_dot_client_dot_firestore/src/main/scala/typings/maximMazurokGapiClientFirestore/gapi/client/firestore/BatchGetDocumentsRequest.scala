package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDocumentsRequest extends StObject {
  
  /**
    * The names of the documents to retrieve. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`. The request will fail if any of the document is not
    * a child resource of the given `database`. Duplicate names will be elided.
    */
  var documents: js.UndefOr[js.Array[String]] = js.undefined
  
  /** The fields to return. If not set, returns all fields. If a document has a field that is not present in this mask, that field will not be returned in the response. */
  var mask: js.UndefOr[DocumentMask] = js.undefined
  
  /** Starts a new transaction and reads the documents. Defaults to a read-only transaction. The new transaction ID will be returned as the first response in the stream. */
  var newTransaction: js.UndefOr[TransactionOptions] = js.undefined
  
  /** Reads documents as they were at the given time. This may not be older than 270 seconds. */
  var readTime: js.UndefOr[String] = js.undefined
  
  /** Reads documents in a transaction. */
  var transaction: js.UndefOr[String] = js.undefined
}
object BatchGetDocumentsRequest {
  
  @scala.inline
  def apply(): BatchGetDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDocumentsRequest]
  }
  
  @scala.inline
  implicit class BatchGetDocumentsRequestMutableBuilder[Self <: BatchGetDocumentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocuments(value: js.Array[String]): Self = StObject.set(x, "documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentsUndefined: Self = StObject.set(x, "documents", js.undefined)
    
    @scala.inline
    def setDocumentsVarargs(value: String*): Self = StObject.set(x, "documents", js.Array(value :_*))
    
    @scala.inline
    def setMask(value: DocumentMask): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setNewTransaction(value: TransactionOptions): Self = StObject.set(x, "newTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTransactionUndefined: Self = StObject.set(x, "newTransaction", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = StObject.set(x, "readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadTimeUndefined: Self = StObject.set(x, "readTime", js.undefined)
    
    @scala.inline
    def setTransaction(value: String): Self = StObject.set(x, "transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransactionUndefined: Self = StObject.set(x, "transaction", js.undefined)
  }
}
