package typings.nano.mod

import typings.nano.anon.Rev
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Database change item.
  * @see Docs: {@link http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes} */
trait DatabaseChangesResultItem extends StObject {
  
  /** List of document’s leaves with single field rev. */
  var changes: js.Array[Rev]
  
  /** true if the document is deleted. */
  var deleted: Boolean
  
  /** Document ID. */
  var id: String
  
  /** Update sequence. */
  var seq: Any
}
object DatabaseChangesResultItem {
  
  inline def apply(changes: js.Array[Rev], deleted: Boolean, id: String, seq: Any): DatabaseChangesResultItem = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseChangesResultItem]
  }
  
  extension [Self <: DatabaseChangesResultItem](x: Self) {
    
    inline def setChanges(value: js.Array[Rev]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
    
    inline def setChangesVarargs(value: Rev*): Self = StObject.set(x, "changes", js.Array(value*))
    
    inline def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSeq(value: Any): Self = StObject.set(x, "seq", value.asInstanceOf[js.Any])
  }
}
