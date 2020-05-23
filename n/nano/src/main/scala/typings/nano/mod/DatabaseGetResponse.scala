package typings.nano.mod

import typings.nano.anon.Active
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/database/common.html#get--db
trait DatabaseGetResponse extends js.Object {
  // Set to true if the database compaction routine is operating on this database.
  var compact_running: Boolean
  // The number of bytes of live data inside the database file.
  var data_size: Double
  // The name of the database.
  var db_name: String
  // The version of the physical format used for the data when it is stored on disk.
  var disk_format_version: Double
  // The length of the database file on disk. Views indexes are not included in the calculation.
  var disk_size: Double
  // A count of the documents in the specified database.
  var doc_count: Double
  // Number of deleted documents
  var doc_del_count: Double
  // Timestamp of when the database was opened, expressed in microseconds since the epoch.
  var instance_start_time: String
  // The number of purge operations on the database.
  var purge_seq: Double
  var sizes: Active
  // The current number of updates to the database.
  var update_seq: Double
}

object DatabaseGetResponse {
  @scala.inline
  def apply(
    compact_running: Boolean,
    data_size: Double,
    db_name: String,
    disk_format_version: Double,
    disk_size: Double,
    doc_count: Double,
    doc_del_count: Double,
    instance_start_time: String,
    purge_seq: Double,
    sizes: Active,
    update_seq: Double
  ): DatabaseGetResponse = {
    val __obj = js.Dynamic.literal(compact_running = compact_running.asInstanceOf[js.Any], data_size = data_size.asInstanceOf[js.Any], db_name = db_name.asInstanceOf[js.Any], disk_format_version = disk_format_version.asInstanceOf[js.Any], disk_size = disk_size.asInstanceOf[js.Any], doc_count = doc_count.asInstanceOf[js.Any], doc_del_count = doc_del_count.asInstanceOf[js.Any], instance_start_time = instance_start_time.asInstanceOf[js.Any], purge_seq = purge_seq.asInstanceOf[js.Any], sizes = sizes.asInstanceOf[js.Any], update_seq = update_seq.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseGetResponse]
  }
}

