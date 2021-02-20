package typings.nano.mod

import typings.nano.anon.Rev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
@js.native
trait DatabaseChangesResultItem extends StObject {
  
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
  implicit class DatabaseChangesResultItemMutableBuilder[Self <: DatabaseChangesResultItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChanges(value: js.Array[Rev]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangesVarargs(value: Rev*): Self = StObject.set(x, "changes", js.Array(value :_*))
    
    @scala.inline
    def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeq(value: js.Any): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
  }
}
