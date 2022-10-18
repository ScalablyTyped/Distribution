package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Document delete response.
  * @see Docs: {@link http://docs.couchdb.org/en/latest/api/document/common.html#delete--db-docid} */
trait DocumentDestroyResponse extends StObject {
  
  /** Document ID */
  var id: String
  
  /** Operation status */
  var ok: Boolean
  
  /** Revision MVCC token */
  var rev: String
}
object DocumentDestroyResponse {
  
  inline def apply(id: String, ok: Boolean, rev: String): DocumentDestroyResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentDestroyResponse]
  }
  
  extension [Self <: DocumentDestroyResponse](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
