package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
trait DatabaseChangesResponse extends js.Object {
  // Last change update sequence
  var last_seq: js.Any
  // Count of remaining items in the feed
  var pending: Double
  // Changes made to a database
  var results: js.Array[DatabaseChangesResultItem]
}

object DatabaseChangesResponse {
  @scala.inline
  def apply(last_seq: js.Any, pending: Double, results: js.Array[DatabaseChangesResultItem]): DatabaseChangesResponse = {
    val __obj = js.Dynamic.literal(last_seq = last_seq.asInstanceOf[js.Any], pending = pending.asInstanceOf[js.Any], results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseChangesResponse]
  }
}

