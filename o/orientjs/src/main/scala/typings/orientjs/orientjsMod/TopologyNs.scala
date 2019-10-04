package typings.orientjs.orientjsMod

import typings.node.eventsMod.EventEmitter
import typings.orientjs.orientjsMod.TopologyNs.OClusterConfig
import typings.orientjs.orientjsMod.TopologyNs.OServerNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("orientjs", "Topology")
@js.native
object TopologyNs extends js.Object {
  @js.native
  class OCluster () extends EventEmitter {
    def this(config: OClusterConfig) = this()
    var servers: js.Array[OServerNode] = js.native
    def acquireFrom(selection: js.Function1[/* cluster */ this.type, OServerNode]): js.Promise[OServerNode] = js.native
    def close(): js.Promise[Unit] = js.native
    def connect(): js.Promise[OServerNode] = js.native
  }
  
  trait OClusterConfig extends js.Object {
    def selectionStrategy(cluster: typings.orientjs.orientjsMod.TopologyNs.OCluster): OServerNode
  }
  
  @js.native
  class OServerNode () extends EventEmitter {
    def acquireConnection(): js.Promise[OConnection] = js.native
    def acquireForSubscribe(): js.Promise[OConnection] = js.native
    def close(): js.Promise[Unit] = js.native
    def connect(): js.Promise[OServerNode] = js.native
    def subscribeCluster(): js.Promise[OConnection] = js.native
    def subscribeCluster(data: js.Any): js.Promise[OConnection] = js.native
  }
  
}

