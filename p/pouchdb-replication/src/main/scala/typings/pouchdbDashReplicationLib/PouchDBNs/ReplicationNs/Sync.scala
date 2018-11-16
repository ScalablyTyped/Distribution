package typings
package pouchdbDashReplicationLib.PouchDBNs.ReplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sync[Content /* <: js.Object */]
  extends ReplicationEventEmitter[Content, SyncResult[Content], SyncResultComplete[Content]]
     with stdLib.Promise[SyncResultComplete[Content]]

