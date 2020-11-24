package typings.opentelemetryCore

import typings.opentelemetryApi.mod.NoopSpan
import typings.opentelemetryApi.spanContextMod.SpanContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/core/build/src/trace/NoRecordingSpan", JSImport.Namespace)
@js.native
object noRecordingSpanMod extends js.Object {
  
  @js.native
  class NoRecordingSpan protected () extends NoopSpan {
    def this(spanContext: SpanContext) = this()
    
    val _context: js.Any = js.native
  }
}
