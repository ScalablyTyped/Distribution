package typings
package nanoLib.nanoMod.nanoNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
trait DatabaseReplicateResponse extends js.Object {
  // Replication history
  var history: js.Array[DatabaseReplicationHistoryItem]
  // Replication status
  var ok: scala.Boolean
  // Replication protocol version
  var replication_id_version: scala.Double
  // Unique session ID
  var session_id: java.lang.String
  // Last sequence number read from source database
  var source_last_seq: scala.Double
}

object DatabaseReplicateResponse {
  @scala.inline
  def apply(
    history: js.Array[DatabaseReplicationHistoryItem],
    ok: scala.Boolean,
    replication_id_version: scala.Double,
    session_id: java.lang.String,
    source_last_seq: scala.Double
  ): DatabaseReplicateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("history")(history)
    __obj.updateDynamic("ok")(ok)
    __obj.updateDynamic("replication_id_version")(replication_id_version)
    __obj.updateDynamic("session_id")(session_id)
    __obj.updateDynamic("source_last_seq")(source_last_seq)
    __obj.asInstanceOf[DatabaseReplicateResponse]
  }
}

