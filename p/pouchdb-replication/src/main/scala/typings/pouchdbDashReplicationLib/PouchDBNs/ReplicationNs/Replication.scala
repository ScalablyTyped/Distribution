package typings
package pouchdbDashReplicationLib.PouchDBNs.ReplicationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Replication[Content /* <: js.Object */]
  extends ReplicationEventEmitter[Content, ReplicationResult[Content], ReplicationResultComplete[Content]]
     with stdLib.Promise[ReplicationResultComplete[Content]]

