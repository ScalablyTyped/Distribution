package typings.opentelemetryInstrumentationGrpc

import typings.opentelemetryInstrumentationGrpc.srcTypesMod.GrpcInstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/instrumentation-grpc", "GRPC_TRACE_KEY")
  @js.native
  val GRPC_TRACE_KEY: /* "grpc-trace-bin" */ String = js.native
  
  @JSImport("@opentelemetry/instrumentation-grpc", "GrpcInstrumentation")
  @js.native
  open class GrpcInstrumentation ()
    extends typings.opentelemetryInstrumentationGrpc.instrumentationMod.GrpcInstrumentation {
    def this(config: GrpcInstrumentationConfig) = this()
  }
}
