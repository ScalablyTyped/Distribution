package typings.nano.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://docs.couchdb.org/en/latest/api/server/common.html#post--_replicate
@js.native
trait DatabaseReplicateResponse extends js.Object {
  // Replication history
  var history: js.Array[DatabaseReplicationHistoryItem] = js.native
  // Replication status
  var ok: Boolean = js.native
  // Replication protocol version
  var replication_id_version: Double = js.native
  // Unique session ID
  var session_id: String = js.native
  // Last sequence number read from source database
  var source_last_seq: Double = js.native
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
  @scala.inline
  implicit class DatabaseReplicateResponseOps[Self <: DatabaseReplicateResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHistoryVarargs(value: DatabaseReplicationHistoryItem*): Self = this.set("history", js.Array(value :_*))
    @scala.inline
    def setHistory(value: js.Array[DatabaseReplicationHistoryItem]): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def setOk(value: Boolean): Self = this.set("ok", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplication_id_version(value: Double): Self = this.set("replication_id_version", value.asInstanceOf[js.Any])
    @scala.inline
    def setSession_id(value: String): Self = this.set("session_id", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource_last_seq(value: Double): Self = this.set("source_last_seq", value.asInstanceOf[js.Any])
  }
  
}

