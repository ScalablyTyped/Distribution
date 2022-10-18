package typings.opentelemetryApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceTraceFlagsMod {
  
  @js.native
  sealed trait TraceFlags extends StObject
  @JSImport("@opentelemetry/api/build/src/trace/trace_flags", "TraceFlags")
  @js.native
  object TraceFlags extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TraceFlags & Double] = js.native
    
    /** Represents no flag set. */
    @js.native
    sealed trait NONE
      extends StObject
         with TraceFlags
    /* 0 */ val NONE: typings.opentelemetryApi.buildSrcTraceTraceFlagsMod.TraceFlags.NONE & Double = js.native
    
    /** Bit to represent whether trace is sampled in trace flags. */
    @js.native
    sealed trait SAMPLED
      extends StObject
         with TraceFlags
    /* 1 */ val SAMPLED: typings.opentelemetryApi.buildSrcTraceTraceFlagsMod.TraceFlags.SAMPLED & Double = js.native
  }
}
