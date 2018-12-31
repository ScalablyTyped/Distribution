package typings
package pouchdbDashReplicationLib.PouchDBNs.ReplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SyncOptions extends ReplicateOptions {
  var pull: js.UndefOr[ReplicateOptions] = js.undefined
  var push: js.UndefOr[ReplicateOptions] = js.undefined
}

