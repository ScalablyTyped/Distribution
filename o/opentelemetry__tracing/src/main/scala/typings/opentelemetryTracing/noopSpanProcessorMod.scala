package typings.opentelemetryTracing

import typings.opentelemetryTracing.spanProcessorMod.SpanProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopSpanProcessorMod {
  
  @JSImport("@opentelemetry/tracing/build/src/NoopSpanProcessor", "NoopSpanProcessor")
  @js.native
  class NoopSpanProcessor () extends SpanProcessor {
    
    def forceFlush(): Unit = js.native
    
    def shutdown(): Unit = js.native
  }
}
