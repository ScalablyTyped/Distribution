package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetDocumentsResponse extends StObject {
  
  /** A document that was requested. */
  var found: js.UndefOr[Document] = js.undefined
  
  /** A document name that was requested but does not exist. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`. */
  var missing: js.UndefOr[String] = js.undefined
  
  /**
    * The time at which the document was read. This may be monotically increasing, in this case the previous documents in the result stream are guaranteed not to have changed between
    * their read_time and this one.
    */
  var readTime: js.UndefOr[String] = js.undefined
  
  /** The transaction that was started as part of this request. Will only be set in the first response, and only if BatchGetDocumentsRequest.new_transaction was set in the request. */
  var transaction: js.UndefOr[String] = js.undefined
}
object BatchGetDocumentsResponse {
  
  @scala.inline
  def apply(): BatchGetDocumentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDocumentsResponse]
  }
  
  @scala.inline
  implicit class BatchGetDocumentsResponseMutableBuilder[Self <: BatchGetDocumentsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFound(value: Document): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFoundUndefined: Self = StObject.set(x, "found", js.undefined)
    
    @scala.inline
    def setMissing(value: String): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
    
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
