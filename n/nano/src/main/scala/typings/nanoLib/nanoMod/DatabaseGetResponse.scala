package typings
package nanoLib.nanoMod

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
  var sizes: nanoLib.Anon_Active
  // The current number of updates to the database.
  var update_seq: scala.Double
}

object DatabaseGetResponse {
  @scala.inline
  def apply(
    compact_running: scala.Boolean,
    data_size: scala.Double,
    db_name: java.lang.String,
    disk_format_version: scala.Double,
    disk_size: scala.Double,
    doc_count: scala.Double,
    doc_del_count: scala.Double,
    instance_start_time: java.lang.String,
    purge_seq: scala.Double,
    sizes: nanoLib.Anon_Active,
    update_seq: scala.Double
  ): DatabaseGetResponse = {
    val __obj = js.Dynamic.literal(compact_running = compact_running, data_size = data_size, db_name = db_name, disk_format_version = disk_format_version, disk_size = disk_size, doc_count = doc_count, doc_del_count = doc_del_count, instance_start_time = instance_start_time, purge_seq = purge_seq, sizes = sizes, update_seq = update_seq)
  
    __obj.asInstanceOf[DatabaseGetResponse]
  }
}

