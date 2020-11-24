package typings.opentelemetryApi

import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.spanMod.Span
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/trace/NoopSpan", JSImport.Namespace)
@js.native
object noopSpanMod extends js.Object {
  
  val NOOP_SPAN: NoopSpan = js.native
  
  @js.native
  class NoopSpan () extends Span {
    def this(_spanContext: SpanContext) = this()
    
    val _spanContext: js.Any = js.native
  }
}
