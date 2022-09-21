package typings.opentelemetrySdkTraceNode

import typings.opentelemetrySdkTraceBase.basicTracerProviderMod.PROPAGATOR_FACTORY
import typings.opentelemetrySdkTraceNode.configMod.NodeTracerConfig
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/sdk-trace-node", "NodeTracerProvider")
  @js.native
  open class NodeTracerProvider ()
    extends typings.opentelemetrySdkTraceNode.nodeTracerProviderMod.NodeTracerProvider {
    def this(config: NodeTracerConfig) = this()
  }
  /* static members */
  object NodeTracerProvider {
    
    @JSImport("@opentelemetry/sdk-trace-node", "NodeTracerProvider._registeredPropagators")
    @js.native
    val _registeredPropagators: Map[String, PROPAGATOR_FACTORY] = js.native
  }
}
