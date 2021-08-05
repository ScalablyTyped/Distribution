package typings.opentelemetryApi

import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopSpanMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/NoopSpan", "NOOP_SPAN")
  @js.native
  val NOOP_SPAN: NoopSpan = js.native
  
  @JSImport("@opentelemetry/api/build/src/trace/NoopSpan", "NoopSpan")
  @js.native
  class NoopSpan ()
    extends StObject
       with Span {
    def this(_spanContext: SpanContext) = this()
    
    /* private */ val _spanContext: js.Any = js.native
  }
}
