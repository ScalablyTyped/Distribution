package typings.opentelemetryTracing

import typings.opentelemetryTracing.spanExporterMod.SpanExporter
import typings.opentelemetryTracing.spanProcessorMod.SpanProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleSpanProcessorMod {
  
  @JSImport("@opentelemetry/tracing/build/src/export/SimpleSpanProcessor", "SimpleSpanProcessor")
  @js.native
  class SimpleSpanProcessor protected () extends SpanProcessor {
    def this(_exporter: SpanExporter) = this()
    
    val _exporter: js.Any = js.native
    
    var _isShutdown: js.Any = js.native
    
    def forceFlush(): Unit = js.native
    
    def shutdown(): Unit = js.native
  }
}
