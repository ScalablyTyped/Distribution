package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Document insert response: 
  * @see POST docs: {@link http://docs.couchdb.org/en/latest/api/database/common.html#post--db}
  * @see PUT docs: {@link http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid} */
trait DocumentInsertResponse extends StObject {
  
  /** Document ID */
  var id: String
  
  /** Operation status */
  var ok: Boolean
  
  /** Revision MVCC token */
  var rev: String
}
object DocumentInsertResponse {
  
  inline def apply(id: String, ok: Boolean, rev: String): DocumentInsertResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], rev = rev.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentInsertResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DocumentInsertResponse] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setRev(value: String): Self = StObject.set(x, "rev", value.asInstanceOf[js.Any])
  }
}
