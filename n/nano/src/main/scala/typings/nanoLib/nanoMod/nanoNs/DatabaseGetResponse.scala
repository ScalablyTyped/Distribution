package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/common.html#get--db
trait DatabaseGetResponse extends js.Object {
  // Set to true if the database compaction routine is operating on this database.
  var compact_running: scala.Boolean
  // The number of bytes of live data inside the database file.
  var data_size: scala.Double
  // The name of the database.
  var db_name: java.lang.String
  // The version of the physical format used for the data when it is stored on disk.
  var disk_format_version: scala.Double
  // The length of the database file on disk. Views indexes are not included in the calculation.
  var disk_size: scala.Double
  // A count of the documents in the specified database.
  var doc_count: scala.Double
  // Number of deleted documents
  var doc_del_count: scala.Double
  // Timestamp of when the database was opened, expressed in microseconds since the epoch.
  var instance_start_time: java.lang.String
  // The number of purge operations on the database.
  var purge_seq: scala.Double
  var sizes: nanoLib.Anon_File
  // The current number of updates to the database.
  var update_seq: scala.Double
}

