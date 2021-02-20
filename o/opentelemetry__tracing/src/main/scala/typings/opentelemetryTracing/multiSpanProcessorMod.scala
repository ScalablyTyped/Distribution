package typings.opentelemetryTracing

import typings.opentelemetryTracing.spanProcessorMod.SpanProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSpanProcessorMod {
  
  @JSImport("@opentelemetry/tracing/build/src/MultiSpanProcessor", "MultiSpanProcessor")
  @js.native
  class MultiSpanProcessor protected () extends SpanProcessor {
    def this(_spanProcessors: js.Array[SpanProcessor]) = this()
    
    val _spanProcessors: js.Any = js.native
    
    def forceFlush(): Unit = js.native
    
    def shutdown(): Unit = js.native
  }
}
