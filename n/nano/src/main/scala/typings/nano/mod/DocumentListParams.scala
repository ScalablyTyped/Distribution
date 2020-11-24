package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
@js.native
trait DocumentListParams extends js.Object {
  
  // Includes conflicts information in response. Ignored if include_docs isn’t true. Default is false.
  var conflicts: js.UndefOr[Boolean] = js.native
  
  // Return the documents in descending by key order. Default is false.
  var descending: js.UndefOr[Boolean] = js.native
  
  // Stop returning records when the specified key is reached. end_key is an alias for endkey
  var end_key: js.UndefOr[String] = js.native
  
  // Stop returning records when the specified document ID is reached.
  var end_key_doc_id: js.UndefOr[String] = js.native
  
  // Stop returning records when the specified key is reached.
  var endkey: js.UndefOr[String] = js.native
  
  // Include the full content of the documents in the return. Default is false.
  var include_docs: js.UndefOr[Boolean] = js.native
  
  // Specifies whether the specified end key should be included in the result. Default is true.
  var inclusive_end: js.UndefOr[Boolean] = js.native
  
  // Return only documents that match the specified key.
  var key: js.UndefOr[String] = js.native
  
  // Return only documents that match the specified keys.
  var keys: js.UndefOr[String | js.Array[String]] = js.native
  
  // Limit the number of the returned documents to the specified number.
  var limit: js.UndefOr[Double] = js.native
  
  // Skip this number of records before starting to return the results. Default is 0.
  var skip: js.UndefOr[Double] = js.native
  
  // Allow the results from a stale view to be used, without triggering a rebuild of all views within the
  // encompassing design doc. Supported values: ok and update_after.
  var stale: js.UndefOr[String] = js.native
  
  // Return records starting with the specified key. start_key is an alias for startkey
  var start_key: js.UndefOr[String] = js.native
  
  // Return records starting with the specified document ID.
  var start_key_doc_id: js.UndefOr[String] = js.native
  
  // Return records starting with the specified key.
  var startkey: js.UndefOr[String] = js.native
  
  // Response includes an update_seq value indicating which sequence id of the underlying database the view
  // reflects. Default is false.
  var update_seq: js.UndefOr[Boolean] = js.native
}
object DocumentListParams {
  
  @scala.inline
  def apply(): DocumentListParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentListParams]
  }
  
  @scala.inline
  implicit class DocumentListParamsOps[Self <: DocumentListParams] (val x: Self) extends AnyVal {
    
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
    def setConflicts(value: Boolean): Self = this.set("conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConflicts: Self = this.set("conflicts", js.undefined)
    
    @scala.inline
    def setDescending(value: Boolean): Self = this.set("descending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescending: Self = this.set("descending", js.undefined)
    
    @scala.inline
    def setEnd_key(value: String): Self = this.set("end_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd_key: Self = this.set("end_key", js.undefined)
    
    @scala.inline
    def setEnd_key_doc_id(value: String): Self = this.set("end_key_doc_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnd_key_doc_id: Self = this.set("end_key_doc_id", js.undefined)
    
    @scala.inline
    def setEndkey(value: String): Self = this.set("endkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndkey: Self = this.set("endkey", js.undefined)
    
    @scala.inline
    def setInclude_docs(value: Boolean): Self = this.set("include_docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclude_docs: Self = this.set("include_docs", js.undefined)
    
    @scala.inline
    def setInclusive_end(value: Boolean): Self = this.set("inclusive_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclusive_end: Self = this.set("inclusive_end", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: String | js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeys: Self = this.set("keys", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setStale(value: String): Self = this.set("stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStale: Self = this.set("stale", js.undefined)
    
    @scala.inline
    def setStart_key(value: String): Self = this.set("start_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_key: Self = this.set("start_key", js.undefined)
    
    @scala.inline
    def setStart_key_doc_id(value: String): Self = this.set("start_key_doc_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStart_key_doc_id: Self = this.set("start_key_doc_id", js.undefined)
    
    @scala.inline
    def setStartkey(value: String): Self = this.set("startkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartkey: Self = this.set("startkey", js.undefined)
    
    @scala.inline
    def setUpdate_seq(value: Boolean): Self = this.set("update_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdate_seq: Self = this.set("update_seq", js.undefined)
  }
}
