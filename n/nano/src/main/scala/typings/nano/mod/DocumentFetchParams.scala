package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentFetchParams extends StObject {
  
  var conflicts: js.UndefOr[Boolean] = js.native
  
  var descending: js.UndefOr[Boolean] = js.native
  
  var end_key: js.UndefOr[String] = js.native
  
  var end_key_doc_id: js.UndefOr[String] = js.native
  
  var inclusive_end: js.UndefOr[Boolean] = js.native
  
  var key: js.UndefOr[String] = js.native
  
  var keys: js.UndefOr[String] = js.native
  
  // This can be string[] too ???
  var limit: js.UndefOr[Double] = js.native
  
  var skip: js.UndefOr[Double] = js.native
  
  var stale: js.UndefOr[String] = js.native
  
  var start_key: js.UndefOr[String] = js.native
  
  var start_key_doc_id: js.UndefOr[String] = js.native
  
  var update_seq: js.UndefOr[Boolean] = js.native
}
object DocumentFetchParams {
  
  @scala.inline
  def apply(): DocumentFetchParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentFetchParams]
  }
  
  @scala.inline
  implicit class DocumentFetchParamsMutableBuilder[Self <: DocumentFetchParams] (val x: Self) extends AnyVal {
    
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
    def setInclusive_end(value: Boolean): Self = StObject.set(x, "inclusive_end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInclusive_endUndefined: Self = StObject.set(x, "inclusive_end", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setKeys(value: String): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
    
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
    def setUpdate_seq(value: Boolean): Self = StObject.set(x, "update_seq", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate_seqUndefined: Self = StObject.set(x, "update_seq", js.undefined)
  }
}
