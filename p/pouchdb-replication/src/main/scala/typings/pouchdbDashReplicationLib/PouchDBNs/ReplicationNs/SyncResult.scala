package typings
package pouchdbDashReplicationLib.PouchDBNs.ReplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SyncResult[Content /* <: js.Object */] extends js.Object {
  var change: ReplicationResult[Content]
  var direction: pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.push | pouchdbDashReplicationLib.pouchdbDashReplicationLibStrings.pull
}

