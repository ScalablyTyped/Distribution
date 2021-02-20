package typings.opentelemetryTracing

import typings.opentelemetryTracing.spanExporterMod.SpanExporter
import typings.opentelemetryTracing.spanProcessorMod.SpanProcessor
import typings.opentelemetryTracing.typesMod.BufferConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchSpanProcessorMod {
  
  @JSImport("@opentelemetry/tracing/build/src/export/BatchSpanProcessor", "BatchSpanProcessor")
  @js.native
  class BatchSpanProcessor protected () extends SpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
    
    /** Add a span in the buffer. */
    var _addToBuffer: js.Any = js.native
    
    val _bufferSize: js.Any = js.native
    
    val _bufferTimeout: js.Any = js.native
    
    var _clearTimer: js.Any = js.native
    
    val _exporter: js.Any = js.native
    
    var _finishedSpans: js.Any = js.native
    
    /** Send the span data list to exporter */
    var _flush: js.Any = js.native
    
    var _isShutdown: js.Any = js.native
    
    var _maybeStartTimer: js.Any = js.native
    
    var _timer: js.Any = js.native
    
    def forceFlush(): Unit = js.native
    
    def shutdown(): Unit = js.native
  }
}
