package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
trait DatabaseReplicateResponse extends js.Object {
  // Replication history
  var history: js.Array[DatabaseReplicationHistoryItem]
  // Replication status
  var ok: Boolean
  // Replication protocol version
  var replication_id_version: Double
  // Unique session ID
  var session_id: String
  // Last sequence number read from source database
  var source_last_seq: Double
}

object DatabaseReplicateResponse {
  @scala.inline
  def apply(
    history: js.Array[DatabaseReplicationHistoryItem],
    ok: Boolean,
    replication_id_version: Double,
    session_id: String,
    source_last_seq: Double
  ): DatabaseReplicateResponse = {
    val __obj = js.Dynamic.literal(history = history.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], replication_id_version = replication_id_version.asInstanceOf[js.Any], session_id = session_id.asInstanceOf[js.Any], source_last_seq = source_last_seq.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DatabaseReplicateResponse]
  }
}

