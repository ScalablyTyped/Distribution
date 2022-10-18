package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Database _session response.
  * @see Docs: {@link http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session} */
trait DatabaseSessionResponse extends StObject {
  
  /** Server authentication configuration */
  var info: Any
  
  /** Operation status */
  var ok: Boolean
  
  /** User context for the current user */
  var userCtx: Any
}
object DatabaseSessionResponse {
  
  inline def apply(info: Any, ok: Boolean, userCtx: Any): DatabaseSessionResponse = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], userCtx = userCtx.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseSessionResponse]
  }
  
  extension [Self <: DatabaseSessionResponse](x: Self) {
    
    inline def setInfo(value: Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    inline def setUserCtx(value: Any): Self = StObject.set(x, "userCtx", value.asInstanceOf[js.Any])
  }
}
