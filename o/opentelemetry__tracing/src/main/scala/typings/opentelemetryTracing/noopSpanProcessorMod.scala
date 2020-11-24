package typings.opentelemetryTracing

import typings.opentelemetryTracing.spanProcessorMod.SpanProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/tracing/build/src/NoopSpanProcessor", JSImport.Namespace)
@js.native
object noopSpanProcessorMod extends js.Object {
  
  @js.native
  class NoopSpanProcessor () extends SpanProcessor {
    
    def forceFlush(): Unit = js.native
    
    def shutdown(): Unit = js.native
  }
}
