package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_bulk_docs
@js.native
trait DocumentBulkResponse extends StObject {
  
  // Error type. Available if response code is 4xx
  var error: js.UndefOr[String] = js.native
  
  // Document ID. Available in all cases
  var id: String = js.native
  
  // Error reason. Available if response code is 4xx
  var reason: js.UndefOr[String] = js.native
  
  // New document revision token. Available if document has saved without errors.
  var rev: js.UndefOr[String] = js.native
}
object DocumentBulkResponse {
  
  @scala.inline
  def apply(id: String): DocumentBulkResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentBulkResponse]
  }
  
  @scala.inline
  implicit class DocumentBulkResponseMutableBuilder[Self <: DocumentBulkResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    @scala.inline
    def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
  }
}
