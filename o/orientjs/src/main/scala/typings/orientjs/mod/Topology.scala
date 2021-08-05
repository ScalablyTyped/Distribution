package typings.orientjs.mod

import typings.node.eventsMod.EventEmitter
import typings.node.eventsMod.EventEmitterOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Topology {
  
  @JSImport("orientjs", "Topology.OCluster")
  @js.native
  class OCluster () extends EventEmitter {
    def this(config: OClusterConfig) = this()
    
    def acquireFrom(selection: js.Function1[/* cluster */ this.type, OServerNode]): js.Promise[OServerNode] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def connect(): js.Promise[OServerNode] = js.native
    
    var servers: js.Array[OServerNode] = js.native
  }
  
  @JSImport("orientjs", "Topology.OServerNode")
  @js.native
  class OServerNode () extends EventEmitter {
    def this(options: EventEmitterOptions) = this()
    
    def acquireConnection(): js.Promise[OConnection] = js.native
    
    def acquireForSubscribe(): js.Promise[OConnection] = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    def connect(): js.Promise[OServerNode] = js.native
    
    def subscribeCluster(): js.Promise[OConnection] = js.native
    def subscribeCluster(data: js.Any): js.Promise[OConnection] = js.native
  }
  
  trait OClusterConfig extends StObject {
    
    def selectionStrategy(cluster: typings.orientjs.mod.Topology.OCluster): OServerNode
  }
  object OClusterConfig {
    
    inline def apply(selectionStrategy: typings.orientjs.mod.Topology.OCluster => OServerNode): OClusterConfig = {
      val __obj = js.Dynamic.literal(selectionStrategy = js.Any.fromFunction1(selectionStrategy))
      __obj.asInstanceOf[OClusterConfig]
    }
    
    extension [Self <: OClusterConfig](x: Self) {
      
      inline def setSelectionStrategy(value: typings.orientjs.mod.Topology.OCluster => OServerNode): Self = StObject.set(x, "selectionStrategy", js.Any.fromFunction1(value))
    }
  }
}
