package typings.opentelemetryPropagatorJaeger

import typings.opentelemetryPropagatorJaeger.buildSrcTypesMod.JaegerPropagatorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/propagator-jaeger", "JaegerPropagator")
  @js.native
  open class JaegerPropagator ()
    extends typings.opentelemetryPropagatorJaeger.buildSrcJaegerPropagatorMod.JaegerPropagator {
    def this(config: JaegerPropagatorConfig) = this()
    def this(customTraceHeader: String) = this()
  }
  
  @JSImport("@opentelemetry/propagator-jaeger", "UBER_BAGGAGE_HEADER_PREFIX")
  @js.native
  val UBER_BAGGAGE_HEADER_PREFIX: /* "uberctx" */ String = js.native
  
  @JSImport("@opentelemetry/propagator-jaeger", "UBER_TRACE_ID_HEADER")
  @js.native
  val UBER_TRACE_ID_HEADER: /* "uber-trace-id" */ String = js.native
}
