package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
trait DatabaseChangesResultItem extends js.Object {
  // List of document’s leaves with single field rev.
  var changes: js.Array[nanoLib.Anon_Rev]
  // true if the document is deleted.
  var deleted: scala.Boolean
  // Document ID.
  var id: java.lang.String
  // Update sequence.
  var seq: js.Any
}

object DatabaseChangesResultItem {
  @scala.inline
  def apply(changes: js.Array[nanoLib.Anon_Rev], deleted: scala.Boolean, id: java.lang.String, seq: js.Any): DatabaseChangesResultItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("changes")(changes)
    __obj.updateDynamic("deleted")(deleted)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("seq")(seq)
    __obj.asInstanceOf[DatabaseChangesResultItem]
  }
}

