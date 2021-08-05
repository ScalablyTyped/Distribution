package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_bulk_docs
trait DocumentBulkResponse extends StObject {
  
  // Error type. Available if response code is 4xx
  var error: js.UndefOr[String] = js.undefined
  
  // Document ID. Available in all cases
  var id: String
  
  // Error reason. Available if response code is 4xx
  var reason: js.UndefOr[String] = js.undefined
  
  // New document revision token. Available if document has saved without errors.
  var rev: js.UndefOr[String] = js.undefined
}
object DocumentBulkResponse {
  
  inline def apply(id: String): DocumentBulkResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentBulkResponse]
  }
  
  extension [Self <: DocumentBulkResponse](x: Self) {
    
    inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
    
    inline def setRevUndefined: Self = StObject.set(x, "rev", js.undefined)
  }
}
