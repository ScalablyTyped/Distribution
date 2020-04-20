package typings.pouchdbReplication.PouchDB.Replication

import typings.pouchdbReplication.pouchdbReplicationStrings.pull
import typings.pouchdbReplication.pouchdbReplicationStrings.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncResult[Content /* <: js.Object */] extends js.Object {
  var change: ReplicationResult[Content]
  var direction: push | pull
}

object SyncResult {
  @scala.inline
  def apply[Content /* <: js.Object */](change: ReplicationResult[Content], direction: push | pull): SyncResult[Content] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncResult[Content]]
  }
}

