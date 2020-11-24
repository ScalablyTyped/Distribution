package typings.maximMazurokGapiClientFirestore.gapi.client.firestore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetDocumentsRequest extends js.Object {
  
  /**
    * The names of the documents to retrieve. In the format: `projects/{project_id}/databases/{database_id}/documents/{document_path}`. The request will fail if any of the document is not
    * a child resource of the given `database`. Duplicate names will be elided.
    */
  var documents: js.UndefOr[js.Array[String]] = js.native
  
  /** The fields to return. If not set, returns all fields. If a document has a field that is not present in this mask, that field will not be returned in the response. */
  var mask: js.UndefOr[DocumentMask] = js.native
  
  /** Starts a new transaction and reads the documents. Defaults to a read-only transaction. The new transaction ID will be returned as the first response in the stream. */
  var newTransaction: js.UndefOr[TransactionOptions] = js.native
  
  /** Reads documents as they were at the given time. This may not be older than 270 seconds. */
  var readTime: js.UndefOr[String] = js.native
  
  /** Reads documents in a transaction. */
  var transaction: js.UndefOr[String] = js.native
}
object BatchGetDocumentsRequest {
  
  @scala.inline
  def apply(): BatchGetDocumentsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetDocumentsRequest]
  }
  
  @scala.inline
  implicit class BatchGetDocumentsRequestOps[Self <: BatchGetDocumentsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDocumentsVarargs(value: String*): Self = this.set("documents", js.Array(value :_*))
    
    @scala.inline
    def setDocuments(value: js.Array[String]): Self = this.set("documents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocuments: Self = this.set("documents", js.undefined)
    
    @scala.inline
    def setMask(value: DocumentMask): Self = this.set("mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMask: Self = this.set("mask", js.undefined)
    
    @scala.inline
    def setNewTransaction(value: TransactionOptions): Self = this.set("newTransaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNewTransaction: Self = this.set("newTransaction", js.undefined)
    
    @scala.inline
    def setReadTime(value: String): Self = this.set("readTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadTime: Self = this.set("readTime", js.undefined)
    
    @scala.inline
    def setTransaction(value: String): Self = this.set("transaction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransaction: Self = this.set("transaction", js.undefined)
  }
}
