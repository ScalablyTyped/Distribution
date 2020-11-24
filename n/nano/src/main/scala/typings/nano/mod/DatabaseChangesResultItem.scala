package typings.nano.mod

import typings.nano.anon.Rev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
@js.native
trait DatabaseChangesResultItem extends js.Object {
  
  // List of document’s leaves with single field rev.
  var changes: js.Array[Rev] = js.native
  
  // true if the document is deleted.
  var deleted: Boolean = js.native
  
  // Document ID.
  var id: String = js.native
  
  // Update sequence.
  var seq: js.Any = js.native
}
object DatabaseChangesResultItem {
  
  @scala.inline
  def apply(changes: js.Array[Rev], deleted: Boolean, id: String, seq: js.Any): DatabaseChangesResultItem = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseChangesResultItem]
  }
  
  @scala.inline
  implicit class DatabaseChangesResultItemOps[Self <: DatabaseChangesResultItem] (val x: Self) extends AnyVal {
    
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
    def setChangesVarargs(value: Rev*): Self = this.set("changes", js.Array(value :_*))
    
    @scala.inline
    def setChanges(value: js.Array[Rev]): Self = this.set("changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq(value: js.Any): Self = this.set("seq", value.asInstanceOf[js.Any])
  }
}
