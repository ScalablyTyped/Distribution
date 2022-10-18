package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcTraceSpanContextMod.SpanContext
import typings.opentelemetryApi.buildSrcTraceSpanMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceNonRecordingSpanMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/NonRecordingSpan", "NonRecordingSpan")
  @js.native
  open class NonRecordingSpan ()
    extends StObject
       with Span {
    def this(_spanContext: SpanContext) = this()
    
    /* private */ val _spanContext: Any = js.native
  }
}
