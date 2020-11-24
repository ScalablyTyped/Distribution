package typings.opentelemetryTracing

import typings.opentelemetryTracing.spanExporterMod.SpanExporter
import typings.opentelemetryTracing.spanProcessorMod.SpanProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/tracing/build/src/export/SimpleSpanProcessor", JSImport.Namespace)
@js.native
object simpleSpanProcessorMod extends js.Object {
  
  @js.native
  class SimpleSpanProcessor protected () extends SpanProcessor {
    def this(_exporter: SpanExporter) = this()
    
    val _exporter: js.Any = js.native
    
    var _isShutdown: js.Any = js.native
    
    def forceFlush(): Unit = js.native
    
    def shutdown(): Unit = js.native
  }
}
