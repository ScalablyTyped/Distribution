package typings.opentelemetryApi

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/trace/trace_flags", JSImport.Namespace)
@js.native
object traceFlagsMod extends js.Object {
  
  @js.native
  sealed trait TraceFlags extends js.Object
  @js.native
  object TraceFlags extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[TraceFlags with Double] = js.native
    
    /** Represents no flag set. */
    @js.native
    sealed trait NONE extends TraceFlags
    /* 0 */ @js.native
    object NONE extends TopLevel[NONE with Double]
    
    /** Bit to represent whether trace is sampled in trace flags. */
    @js.native
    sealed trait SAMPLED extends TraceFlags
    /* 1 */ @js.native
    object SAMPLED extends TopLevel[SAMPLED with Double]
  }
}
