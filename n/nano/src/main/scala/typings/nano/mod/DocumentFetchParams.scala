package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Fetch with POST _all_docs parameters.
  * @see Docs: {@link https://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_all_docs} */
trait DocumentFetchParams extends StObject {
  
  var conflicts: js.UndefOr[Boolean] = js.undefined
  
  var descending: js.UndefOr[Boolean] = js.undefined
  
  var end_key: js.UndefOr[String] = js.undefined
  
  var end_key_doc_id: js.UndefOr[String] = js.undefined
  
  var include_docs: js.UndefOr[Boolean] = js.undefined
  
  var inclusive_end: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var keys: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var skip: js.UndefOr[Double] = js.undefined
  
  var stale: js.UndefOr[String] = js.undefined
  
  var start_key: js.UndefOr[String] = js.undefined
  
  var start_key_doc_id: js.UndefOr[String] = js.undefined
  
  var update_seq: js.UndefOr[Boolean] = js.undefined
}
object DocumentFetchParams {
  
  inline def apply(): DocumentFetchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentFetchParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentFetchParams] (val x: Self) extends AnyVal {
    
    inline def setConflicts(value: Boolean): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    inline def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    inline def setDescending(value: Boolean): Self = StObject.set(x, "descending", value.asInstanceOf[js.Any])
    
    inline def setDescendingUndefined: Self = StObject.set(x, "descending", js.undefined)
    
    inline def setEnd_key(value: String): Self = StObject.set(x, "end_key", value.asInstanceOf[js.Any])
    
    inline def setEnd_keyUndefined: Self = StObject.set(x, "end_key", js.undefined)
    
    inline def setEnd_key_doc_id(value: String): Self = StObject.set(x, "end_key_doc_id", value.asInstanceOf[js.Any])
    
    inline def setEnd_key_doc_idUndefined: Self = StObject.set(x, "end_key_doc_id", js.undefined)
    
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
    
    inline def setUpdate_seq(value: Boolean): Self = StObject.set(x, "update_seq", value.asInstanceOf[js.Any])
    
    inline def setUpdate_seqUndefined: Self = StObject.set(x, "update_seq", js.undefined)
  }
}
