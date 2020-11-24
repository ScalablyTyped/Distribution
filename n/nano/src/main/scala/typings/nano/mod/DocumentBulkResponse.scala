package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/bulk-api.html#post--db-_bulk_docs
@js.native
trait DocumentBulkResponse extends js.Object {
  
  // Error type. Available if response code is 4xx
  var error: js.UndefOr[String] = js.native
  
  // Document ID. Available in all cases
  var id: String = js.native
  
  // Error reason. Available if response code is 4xx
  var reason: js.UndefOr[String] = js.native
  
  // New document revision token. Available if document has saved without errors.
  var rev: js.UndefOr[String] = js.native
}
object DocumentBulkResponse {
  
  @scala.inline
  def apply(id: String): DocumentBulkResponse = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentBulkResponse]
  }
  
  @scala.inline
  implicit class DocumentBulkResponseOps[Self <: DocumentBulkResponse] (val x: Self) extends AnyVal {
    
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setError(value: String): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setReason(value: String): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReason: Self = this.set("reason", js.undefined)
    
    @scala.inline
    def setRev(value: String): Self = this.set("rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRev: Self = this.set("rev", js.undefined)
  }
}
