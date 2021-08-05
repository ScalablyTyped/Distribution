package typings.opentelemetryTracing

import typings.opentelemetryTracing.readableSpanMod.ReadableSpan
import typings.opentelemetryTracing.spanExporterMod.SpanExporter
import typings.opentelemetryTracing.spanProcessorMod.SpanProcessor
import typings.opentelemetryTracing.typesMod.BufferConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchSpanProcessorMod {
  
  @JSImport("@opentelemetry/tracing/build/src/export/BatchSpanProcessor", "BatchSpanProcessor")
  @js.native
  class BatchSpanProcessor protected ()
    extends StObject
       with SpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: BufferConfig) = this()
    
    /** Add a span in the buffer. */
    /* private */ var _addToBuffer: js.Any = js.native
    
    /* private */ val _bufferSize: js.Any = js.native
    
    /* private */ val _bufferTimeout: js.Any = js.native
    
    /* private */ var _clearTimer: js.Any = js.native
    
    /* private */ val _exporter: js.Any = js.native
    
    /* private */ var _finishedSpans: js.Any = js.native
    
    /** Send the span data list to exporter */
    /* private */ var _flush: js.Any = js.native
    
    /* private */ var _isShutdown: js.Any = js.native
    
    /* private */ var _maybeStartTimer: js.Any = js.native
    
    /* private */ var _timer: js.Any = js.native
    
    def forceFlush(): Unit = js.native
    /**
      * Forces to export all finished spans
      */
    /* CompleteClass */
    override def forceFlush(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Called when a {@link ReadableSpan} is ended, if the `span.isRecording()`
      * returns true.
      * @param span the Span that just ended.
      */
    /* CompleteClass */
    override def onEnd(span: ReadableSpan): Unit = js.native
    
    /**
      * Called when a {@link ReadableSpan} is started, if the `span.isRecording()`
      * returns true.
      * @param span the Span that just started.
      */
    /* CompleteClass */
    override def onStart(span: ReadableSpan): Unit = js.native
    
    def shutdown(): Unit = js.native
    /**
      * Shuts down the processor. Called when SDK is shut down. This is an
      * opportunity for processor to do any cleanup required.
      */
    /* CompleteClass */
    override def shutdown(callback: js.Function0[Unit]): Unit = js.native
  }
}
