package typings.nano.nanoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
trait DatabaseReplicationHistoryItem extends js.Object {
  // Number of document write failures
  var doc_write_failures: Double
  // Number of documents read
  var docs_read: Double
  // Number of documents written to target
  var docs_written: Double
  // Last sequence number in changes stream
  var end_last_seq: Double
  // Date/Time replication operation completed in RFC 2822 format
  var end_time: String
  // Number of missing documents checked
  var missing_checked: Double
  // Number of missing documents found
  var missing_found: Double
  // Last recorded sequence number
  var recorded_seq: Double
  // Session ID for this replication operation
  var session_id: String
  // First sequence number in changes stream
  var start_last_seq: Double
  // Date/Time replication operation started in RFC 2822 format
  var start_time: String
}

object DatabaseReplicationHistoryItem {
  @scala.inline
  def apply(
    doc_write_failures: Double,
    docs_read: Double,
    docs_written: Double,
    end_last_seq: Double,
    end_time: String,
    missing_checked: Double,
    missing_found: Double,
    recorded_seq: Double,
    session_id: String,
    start_last_seq: Double,
    start_time: String
  ): DatabaseReplicationHistoryItem = {
    val __obj = js.Dynamic.literal(doc_write_failures = doc_write_failures, docs_read = docs_read, docs_written = docs_written, end_last_seq = end_last_seq, end_time = end_time, missing_checked = missing_checked, missing_found = missing_found, recorded_seq = recorded_seq, session_id = session_id, start_last_seq = start_last_seq, start_time = start_time)
  
    __obj.asInstanceOf[DatabaseReplicationHistoryItem]
  }
}

