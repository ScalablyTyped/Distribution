package typings.nano.nanoMod

import typings.nano.Anon_Rev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
trait DatabaseChangesResultItem extends js.Object {
  // List of document’s leaves with single field rev.
  var changes: js.Array[Anon_Rev]
  // true if the document is deleted.
  var deleted: Boolean
  // Document ID.
  var id: String
  // Update sequence.
  var seq: js.Any
}

object DatabaseChangesResultItem {
  @scala.inline
  def apply(changes: js.Array[Anon_Rev], deleted: Boolean, id: String, seq: js.Any): DatabaseChangesResultItem = {
    val __obj = js.Dynamic.literal(changes = changes, deleted = deleted, id = id, seq = seq)
  
    __obj.asInstanceOf[DatabaseChangesResultItem]
  }
}

