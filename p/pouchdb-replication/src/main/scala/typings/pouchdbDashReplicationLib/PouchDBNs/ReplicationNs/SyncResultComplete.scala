package typings
package pouchdbDashReplicationLib.PouchDBNs.ReplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncResultComplete[Content /* <: js.Object */] extends js.Object {
  var pull: js.UndefOr[ReplicationResultComplete[Content]] = js.undefined
  var push: js.UndefOr[ReplicationResultComplete[Content]] = js.undefined
}

object SyncResultComplete {
  @scala.inline
  def apply[Content /* <: js.Object */](pull: ReplicationResultComplete[Content] = null, push: ReplicationResultComplete[Content] = null): SyncResultComplete[Content] = {
    val __obj = js.Dynamic.literal()
    if (pull != null) __obj.updateDynamic("pull")(pull)
    if (push != null) __obj.updateDynamic("push")(push)
    __obj.asInstanceOf[SyncResultComplete[Content]]
  }
}

