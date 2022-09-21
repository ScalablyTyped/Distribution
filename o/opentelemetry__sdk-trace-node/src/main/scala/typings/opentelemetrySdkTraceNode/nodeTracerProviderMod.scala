package typings.opentelemetrySdkTraceNode

import typings.opentelemetrySdkTraceBase.basicTracerProviderMod.PROPAGATOR_FACTORY
import typings.opentelemetrySdkTraceBase.mod.BasicTracerProvider
import typings.opentelemetrySdkTraceNode.configMod.NodeTracerConfig
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeTracerProviderMod {
  
  @JSImport("@opentelemetry/sdk-trace-node/build/src/NodeTracerProvider", "NodeTracerProvider")
  @js.native
  open class NodeTracerProvider () extends BasicTracerProvider {
    def this(config: NodeTracerConfig) = this()
  }
  /* static members */
  object NodeTracerProvider {
    
    @JSImport("@opentelemetry/sdk-trace-node/build/src/NodeTracerProvider", "NodeTracerProvider._registeredPropagators")
    @js.native
    val _registeredPropagators: Map[String, PROPAGATOR_FACTORY] = js.native
  }
}
