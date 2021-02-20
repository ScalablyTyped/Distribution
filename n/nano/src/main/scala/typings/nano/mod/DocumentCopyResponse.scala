package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/document/common.html#copy--db-docid
@js.native
trait DocumentCopyResponse extends StObject {
  
  // Document ID
  var id: String = js.native
  
  // Operation status
  var ok: Boolean = js.native
  
  // Revision MVCC token
  var rev: String = js.native
}
object DocumentCopyResponse {
  
  @scala.inline
  def apply(id: String, ok: Boolean, rev: String): DocumentCopyResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentCopyResponse]
  }
  
  @scala.inline
  implicit class DocumentCopyResponseMutableBuilder[Self <: DocumentCopyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
