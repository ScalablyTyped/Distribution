package typings
package pouchdbDashReplicationLib.PouchDBNs.ReplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncResult[Content /* <: js.Object */] extends js.Object {
  var change: ReplicationResult[Content]
  var direction: pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.push | pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.pull
}

object SyncResult {
  @scala.inline
  def apply[Content /* <: js.Object */](
    change: ReplicationResult[Content],
    direction: pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.push | pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.pull
  ): SyncResult[Content] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("change")(change)
    __obj.updateDynamic("direction")(direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SyncResult[Content]]
  }
}

