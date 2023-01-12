package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** OK response
  * @see Delete docs: {@link http://docs.couchdb.org/en/latest/api/database/common.html#delete--db}
  * @see Compaction docs: {@link http://docs.couchdb.org/en/latest/api/database/compact.html#post--db-_compact} */
trait OkResponse extends StObject {
  
  /** Operation status */
  var ok: Boolean
}
object OkResponse {
  
  inline def apply(ok: Boolean): OkResponse = {
    val __obj = js.Dynamic.literal(ok = ok.asInstanceOf[js.Any])
    __obj.asInstanceOf[OkResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OkResponse] (val x: Self) extends AnyVal {
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
  }
}
