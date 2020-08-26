package typings.pouchdbReplication.PouchDB.Replication

import typings.pouchdbReplication.pouchdbReplicationStrings.pull
import typings.pouchdbReplication.pouchdbReplicationStrings.push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SyncResult[Content /* <: js.Object */] extends js.Object {
  var change: ReplicationResult[Content] = js.native
  var direction: push | pull = js.native
}

object SyncResult {
  @scala.inline
  def apply[/* <: js.Object */ Content](change: ReplicationResult[Content], direction: push | pull): SyncResult[Content] = {
    val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncResult[Content]]
  }
  @scala.inline
  implicit class SyncResultOps[Self <: SyncResult[_], /* <: js.Object */ Content] (val x: Self with SyncResult[Content]) extends AnyVal {
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
    def setChange(value: ReplicationResult[Content]): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: push | pull): Self = this.set("direction", value.asInstanceOf[js.Any])
  }
  
}

