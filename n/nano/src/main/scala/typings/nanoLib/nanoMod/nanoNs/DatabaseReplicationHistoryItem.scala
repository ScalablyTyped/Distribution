package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
trait DatabaseReplicationHistoryItem extends js.Object {
  // Number of document write failures
  var doc_write_failures: scala.Double
  // Number of documents read
  var docs_read: scala.Double
  // Number of documents written to target
  var docs_written: scala.Double
  // Last sequence number in changes stream
  var end_last_seq: scala.Double
  // Date/Time replication operation completed in RFC 2822 format
  var end_time: java.lang.String
  // Number of missing documents checked
  var missing_checked: scala.Double
  // Number of missing documents found
  var missing_found: scala.Double
  // Last recorded sequence number
  var recorded_seq: scala.Double
  // Session ID for this replication operation
  var session_id: java.lang.String
  // First sequence number in changes stream
  var start_last_seq: scala.Double
  // Date/Time replication operation started in RFC 2822 format
  var start_time: java.lang.String
}

