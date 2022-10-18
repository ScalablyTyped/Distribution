package typings.opentelemetryPropagatorB3

import typings.opentelemetryPropagatorB3.buildSrcTypesMod.B3PropagatorConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@opentelemetry/propagator-b3", "B3InjectEncoding")
  @js.native
  object B3InjectEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.opentelemetryPropagatorB3.buildSrcTypesMod.B3InjectEncoding & Double] = js.native
    
    /* 1 */ val MULTI_HEADER: typings.opentelemetryPropagatorB3.buildSrcTypesMod.B3InjectEncoding.MULTI_HEADER & Double = js.native
    
    /* 0 */ val SINGLE_HEADER: typings.opentelemetryPropagatorB3.buildSrcTypesMod.B3InjectEncoding.SINGLE_HEADER & Double = js.native
  }
  
  @JSImport("@opentelemetry/propagator-b3", "B3Propagator")
  @js.native
  open class B3Propagator ()
    extends typings.opentelemetryPropagatorB3.buildSrcB3PropagatorMod.B3Propagator {
    def this(config: B3PropagatorConfig) = this()
  }
  
  @JSImport("@opentelemetry/propagator-b3", "B3_CONTEXT_HEADER")
  @js.native
  val B3_CONTEXT_HEADER: /* "b3" */ String = js.native
  
  @JSImport("@opentelemetry/propagator-b3", "X_B3_FLAGS")
  @js.native
  val X_B3_FLAGS: /* "x-b3-flags" */ String = js.native
  
  @JSImport("@opentelemetry/propagator-b3", "X_B3_PARENT_SPAN_ID")
  @js.native
  val X_B3_PARENT_SPAN_ID: /* "x-b3-parentspanid" */ String = js.native
  
  @JSImport("@opentelemetry/propagator-b3", "X_B3_SAMPLED")
  @js.native
  val X_B3_SAMPLED: /* "x-b3-sampled" */ String = js.native
  
  @JSImport("@opentelemetry/propagator-b3", "X_B3_SPAN_ID")
  @js.native
  val X_B3_SPAN_ID: /* "x-b3-spanid" */ String = js.native
  
  @JSImport("@opentelemetry/propagator-b3", "X_B3_TRACE_ID")
  @js.native
  val X_B3_TRACE_ID: /* "x-b3-traceid" */ String = js.native
}
