package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** _all_docs parameters
  * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/bulk-api.html#get--db-_all_docs} */
trait DocumentListParams extends StObject {
  
  /** Includes conflicts information in response.
    *
    * Ignored if include_docs isn’t true.
    *
    * @default false */
  var conflicts: js.UndefOr[Boolean] = js.undefined
  
  /** Return the documents in descending by key order.
    *
    * @default false */
  var descending: js.UndefOr[Boolean] = js.undefined
  
  /** Stop returning records when the specified key is reached.
    *
    * end_key is an alias for endkey */
  var end_key: js.UndefOr[String] = js.undefined
  
  /** Stop returning records when the specified document ID is reached. */
  var end_key_doc_id: js.UndefOr[String] = js.undefined
  
  /** Stop returning records when the specified key is reached. */
  var endkey: js.UndefOr[String] = js.undefined
  
  /** Include the full content of the documents in the return.
    *
    * @default false */
  var include_docs: js.UndefOr[Boolean] = js.undefined
  
  /** Specifies whether the specified end key should be included in the result.
    *
    * @default true */
  var inclusive_end: js.UndefOr[Boolean] = js.undefined
  
  /** Return only documents that match the specified key. */
  var key: js.UndefOr[String] = js.undefined
  
  /** Return only documents that match the specified keys. */
  var keys: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /** Limit the number of the returned documents to the specified number. */
  var limit: js.UndefOr[Double] = js.undefined
  
  /** Skip this number of records before starting to return the results.
    *
    * @default 0 */
  var skip: js.UndefOr[Double] = js.undefined
  
  /** Allow the results from a stale view to be used.
    *
    * Using a stale view wont trigger a rebuild of all views within the encompassing design doc.
    *
    * Supported values: "ok" and "update_after". */
  var stale: js.UndefOr[String] = js.undefined
  
  /** Return records starting with the specified key.
    *
    * start_key is an alias for startkey */
  var start_key: js.UndefOr[String] = js.undefined
  
  /** Return records starting with the specified document ID. */
  var start_key_doc_id: js.UndefOr[String] = js.undefined
  
  /** Return records starting with the specified key. */
  var startkey: js.UndefOr[String] = js.undefined
  
  /** Response includes an update_seq value indicating which sequence id of the underlying database the view reflects.
    *
    * @default false */
  var update_seq: js.UndefOr[Boolean] = js.undefined
}
object DocumentListParams {
  
  inline def apply(): DocumentListParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentListParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentListParams] (val x: Self) extends AnyVal {
    
    inline def setConflicts(value: Boolean): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    inline def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    inline def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    inline def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
    
    inline def setEnd_key(value: String): Self = StObject.set(x, "end_key", value.asInstanceOf[js.Any])
    
    inline def setEnd_keyUndefined: Self = StObject.set(x, "end_key", js.undefined)
    
    inline def setEnd_key_doc_id(value: String): Self = StObject.set(x, "end_key_doc_id", value.asInstanceOf[js.Any])
    
    inline def setEnd_key_doc_idUndefined: Self = StObject.set(x, "end_key_doc_id", js.undefined)
    
    inline def setEndkey(value: String): Self = StObject.set(x, "endkey", value.asInstanceOf[js.Any])
    
    inline def setEndkeyUndefined: Self = StObject.set(x, "endkey", js.undefined)
    
    inline def setInclude_docs(value: Boolean): Self = StObject.set(x, "include_docs", value.asInstanceOf[js.Any])
    
    inline def setInclude_docsUndefined: Self = StObject.set(x, "include_docs", js.undefined)
    
    inline def setInclusive_end(value: Boolean): Self = StObject.set(x, "inclusive_end", value.asInstanceOf[js.Any])
    
    inline def setInclusive_endUndefined: Self = StObject.set(x, "inclusive_end", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setKeys(value: String | js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setStale(value: String): Self = StObject.set(x, "stale", value.asInstanceOf[js.Any])
    
    inline def setStaleUndefined: Self = StObject.set(x, "stale", js.undefined)
    
    inline def setStart_key(value: String): Self = StObject.set(x, "start_key", value.asInstanceOf[js.Any])
    
    inline def setStart_keyUndefined: Self = StObject.set(x, "start_key", js.undefined)
    
    inline def setStart_key_doc_id(value: String): Self = StObject.set(x, "start_key_doc_id", value.asInstanceOf[js.Any])
    
    inline def setStart_key_doc_idUndefined: Self = StObject.set(x, "start_key_doc_id", js.undefined)
    
    inline def setStartkey(value: String): Self = StObject.set(x, "startkey", value.asInstanceOf[js.Any])
    
    inline def setStartkeyUndefined: Self = StObject.set(x, "startkey", js.undefined)
    
    inline def setUpdate_seq(value: Boolean): Self = StObject.set(x, "update_seq", value.asInstanceOf[js.Any])
    
    inline def setUpdate_seqUndefined: Self = StObject.set(x, "update_seq", js.undefined)
  }
}
