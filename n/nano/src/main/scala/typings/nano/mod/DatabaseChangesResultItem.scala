package typings.nano.mod

import typings.nano.AnonRev
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
trait DatabaseChangesResultItem extends js.Object {
  // List of document’s leaves with single field rev.
  var changes: js.Array[AnonRev]
  // true if the document is deleted.
  var deleted: Boolean
  // Document ID.
  var id: String
  // Update sequence.
  var seq: js.Any
}

object DatabaseChangesResultItem {
  @scala.inline
  def apply(changes: js.Array[AnonRev], deleted: Boolean, id: String, seq: js.Any): DatabaseChangesResultItem = {
    val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], seq = seq.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatabaseChangesResultItem]
  }
}

