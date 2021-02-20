package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs
@js.native
trait DocumentListParams extends StObject {
  
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
  implicit class DocumentListParamsMutableBuilder[Self <: DocumentListParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConflicts(value: Boolean): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    @scala.inline
    def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
    
    @scala.inline
    def setEnd_key(value: String): Self = StObject.set(x, "end_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_keyUndefined: Self = StObject.set(x, "end_key", js.undefined)
    
    @scala.inline
    def setEnd_key_doc_id(value: String): Self = StObject.set(x, "end_key_doc_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_key_doc_idUndefined: Self = StObject.set(x, "end_key_doc_id", js.undefined)
    
    @scala.inline
    def setEndkey(value: String): Self = StObject.set(x, "endkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndkeyUndefined: Self = StObject.set(x, "endkey", js.undefined)
    
    @scala.inline
    def setInclude_docs(value: Boolean): Self = StObject.set(x, "include_docs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclude_docsUndefined: Self = StObject.set(x, "include_docs", js.undefined)
    
    @scala.inline
    def setInclusive_end(value: Boolean): Self = StObject.set(x, "inclusive_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusive_endUndefined: Self = StObject.set(x, "inclusive_end", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setKeys(value: String | js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    @scala.inline
    def setStale(value: String): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    
    @scala.inline
    def setStart_key(value: String): Self = StObject.set(x, "start_key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_keyUndefined: Self = StObject.set(x, "start_key", js.undefined)
    
    @scala.inline
    def setStart_key_doc_id(value: String): Self = StObject.set(x, "start_key_doc_id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_key_doc_idUndefined: Self = StObject.set(x, "start_key_doc_id", js.undefined)
    
    @scala.inline
    def setStartkey(value: String): Self = StObject.set(x, "startkey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartkeyUndefined: Self = StObject.set(x, "startkey", js.undefined)
    
    @scala.inline
    def setUpdate_seq(value: Boolean): Self = StObject.set(x, "update_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_seqUndefined: Self = StObject.set(x, "update_seq", js.undefined)
  }
}
