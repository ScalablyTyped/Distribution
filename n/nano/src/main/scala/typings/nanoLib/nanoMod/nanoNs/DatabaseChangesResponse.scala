package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/changes.html#get--db-_changes
trait DatabaseChangesResponse extends js.Object {
  // Last change update sequence
  var last_seq: js.Any
  // Count of remaining items in the feed
  var pending: scala.Double
  // Changes made to a database
  var results: js.Array[DatabaseChangesResultItem]
}

