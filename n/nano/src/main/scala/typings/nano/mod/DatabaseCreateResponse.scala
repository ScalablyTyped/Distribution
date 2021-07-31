package typings.nano.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// -------------------------------------
// Database scope request and response
// -------------------------------------
// http://docs.couchdb.org/en/latest/api/database/common.html#put--db
trait DatabaseCreateResponse extends StObject {
  
  // Error type. Available if response code is 4xx
  var error: js.UndefOr[String] = js.undefined
  
  // Operation status. Available in case of success
  var ok: js.UndefOr[Boolean] = js.undefined
  
  // Error description. Available if response code is 4xx
  var reason: js.UndefOr[String] = js.undefined
}
object DatabaseCreateResponse {
  
  @scala.inline
  def apply(): DatabaseCreateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseCreateResponse]
  }
  
  @scala.inline
  implicit class DatabaseCreateResponseMutableBuilder[Self <: DatabaseCreateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkUndefined: Self = StObject.set(x, "ok", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
