package typings.orientjs.mod.Topology

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "Topology.OCluster")
@js.native
class OCluster () extends EventEmitter {
  def this(config: OClusterConfig) = this()
  
  def acquireFrom(selection: js.Function1[/* cluster */ this.type, OServerNode]): js.Promise[OServerNode] = js.native
  
  def close(): js.Promise[Unit] = js.native
  
  def connect(): js.Promise[OServerNode] = js.native
  
  var servers: js.Array[OServerNode] = js.native
}
