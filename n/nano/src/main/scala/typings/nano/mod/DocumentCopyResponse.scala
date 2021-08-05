package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/document/common.html#copy--db-docid
trait DocumentCopyResponse extends StObject {
  
  // Document ID
  var id: String
  
  // Operation status
  var ok: Boolean
  
  // Revision MVCC token
  var rev: String
}
object DocumentCopyResponse {
  
  inline def apply(id: String, ok: Boolean, rev: String): DocumentCopyResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCopyResponse]
  }
  
  extension [Self <: DocumentCopyResponse](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
