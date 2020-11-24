package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// -------------------------------------
// Database scope request and response
// -------------------------------------
// http://docs.couchdb.org/en/latest/api/database/common.html#put--db
@js.native
trait DatabaseCreateResponse extends js.Object {
  
  // Error type. Available if response code is 4xx
  var error: js.UndefOr[String] = js.native
  
  // Operation status. Available in case of success
  var ok: js.UndefOr[Boolean] = js.native
  
  // Error description. Available if response code is 4xx
  var reason: js.UndefOr[String] = js.native
}
object DatabaseCreateResponse {
  
  @scala.inline
  def apply(): DatabaseCreateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatabaseCreateResponse]
  }
  
  @scala.inline
  implicit class DatabaseCreateResponseOps[Self <: DatabaseCreateResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setOk(value: Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOk: Self = this.set("ok", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
  }
}
