package typings.pouchdbReplication.PouchDB.Replication

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncResultComplete[Content /* <: js.Object */] extends js.Object {
  var pull: js.UndefOr[ReplicationResultComplete[Content]] = js.undefined
  var push: js.UndefOr[ReplicationResultComplete[Content]] = js.undefined
}

object SyncResultComplete {
  @scala.inline
  def apply[/* <: js.Object */ Content](pull: ReplicationResultComplete[Content] = null, push: ReplicationResultComplete[Content] = null): SyncResultComplete[Content] = {
    val __obj = js.Dynamic.literal()
    if (pull != null) __obj.updateDynamic("pull")(pull.asInstanceOf[js.Any])
    if (push != null) __obj.updateDynamic("push")(push.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncResultComplete[Content]]
  }
}

