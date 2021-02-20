package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/server/authn.html#get--_session
@js.native
trait DatabaseSessionResponse extends StObject {
  
  // Server authentication configuration
  var info: js.Any = js.native
  
  // Operation status
  var ok: Boolean = js.native
  
  // User context for the current user
  var userCtx: js.Any = js.native
}
object DatabaseSessionResponse {
  
  @scala.inline
  def apply(info: js.Any, ok: Boolean, userCtx: js.Any): DatabaseSessionResponse = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], userCtx = userCtx.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseSessionResponse]
  }
  
  @scala.inline
  implicit class DatabaseSessionResponseMutableBuilder[Self <: DatabaseSessionResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInfo(value: js.Any): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserCtx(value: js.Any): Self = StObject.set(x, "userCtx", value.asInstanceOf[js.Any])
  }
}
