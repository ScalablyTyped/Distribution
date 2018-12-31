package typings
package pouchdbDashReplicationLib.PouchDBNs.ReplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncResultComplete[Content /* <: js.Object */] extends js.Object {
  var pull: js.UndefOr[ReplicationResultComplete[Content]] = js.undefined
  var push: js.UndefOr[ReplicationResultComplete[Content]] = js.undefined
}

