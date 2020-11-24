package typings.nano.mod

import typings.nano.nanoStrings.ok
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/common.html#post--db
// http://docs.couchdb.org/en/latest/api/document/common.html#put--db-docid
@js.native
trait DocumentInsertParams extends js.Object {
  
  // Stores document in batch mode.
  var batch: js.UndefOr[ok] = js.native
  
  // Prevents insertion of a conflicting document. Possible values: true (default) and false. If false, a
  // well-formed _rev must be included in the document. new_edits=false is used by the replicator to insert
  // documents into the target database even if that leads to the creation of conflicts.
  var new_edits: js.UndefOr[Boolean] = js.native
  
  // Document’s revision if updating an existing document. Alternative to If-Match header or document key.
  var rev: js.UndefOr[String] = js.native
}
object DocumentInsertParams {
  
  @scala.inline
  def apply(): DocumentInsertParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentInsertParams]
  }
  
  @scala.inline
  implicit class DocumentInsertParamsOps[Self <: DocumentInsertParams] (val x: Self) extends AnyVal {
    
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
    def setBatch(value: ok): Self = this.set("batch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatch: Self = this.set("batch", js.undefined)
    
    @scala.inline
    def setNew_edits(value: Boolean): Self = this.set("new_edits", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNew_edits: Self = this.set("new_edits", js.undefined)
    
    @scala.inline
    def setRev(value: String): Self = this.set("rev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRev: Self = this.set("rev", js.undefined)
  }
}
