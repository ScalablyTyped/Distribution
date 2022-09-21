package typings.opentelemetrySdkTraceBase

import typings.opentelemetryApi.contextTypesMod.Context
import typings.opentelemetrySdkTraceBase.readableSpanMod.ReadableSpan
import typings.opentelemetrySdkTraceBase.spanExporterMod.SpanExporter
import typings.opentelemetrySdkTraceBase.spanMod.Span
import typings.opentelemetrySdkTraceBase.spanProcessorMod.SpanProcessor
import typings.opentelemetrySdkTraceBase.typesMod.BufferConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object batchSpanProcessorBaseMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/export/BatchSpanProcessorBase", "BatchSpanProcessorBase")
  @js.native
  abstract class BatchSpanProcessorBase[T /* <: BufferConfig */] protected ()
    extends StObject
       with SpanProcessor {
    def this(_exporter: SpanExporter) = this()
    def this(_exporter: SpanExporter, config: T) = this()
    
    /** Add a span in the buffer. */
    /* private */ var _addToBuffer: Any = js.native
    
    /* private */ var _clearTimer: Any = js.native
    
    /* private */ val _exportTimeoutMillis: Any = js.native
    
    /* private */ val _exporter: Any = js.native
    
    /* private */ var _finishedSpans: Any = js.native
    
    /**
      * Send all spans to the exporter respecting the batch size limit
      * This function is used only on forceFlush or shutdown,
      * for all other cases _flush should be used
      * */
    /* private */ var _flushAll: Any = js.native
    
    /* private */ var _flushOneBatch: Any = js.native
    
    /* private */ val _maxExportBatchSize: Any = js.native
    
    /* private */ val _maxQueueSize: Any = js.native
    
    /* private */ var _maybeStartTimer: Any = js.native
    
    /* private */ val _scheduledDelayMillis: Any = js.native
    
    /* private */ var _shutdown: Any = js.native
    
    /* private */ var _shutdownOnce: Any = js.native
    
    /* private */ var _timer: Any = js.native
    
    /**
      * Forces to export all finished spans
      */
    /* CompleteClass */
    override def forceFlush(): js.Promise[Unit] = js.native
    
    /**
      * Called when a {@link ReadableSpan} is ended, if the `span.isRecording()`
      * returns true.
      * @param span the Span that just ended.
      */
    /* CompleteClass */
    override def onEnd(span: ReadableSpan): Unit = js.native
    
    /* protected */ def onShutdown(): Unit = js.native
    
    /**
      * Called when a {@link Span} is started, if the `span.isRecording()`
      * returns true.
      * @param span the Span that just started.
      */
    /* CompleteClass */
    override def onStart(span: Span, parentContext: Context): Unit = js.native
    
    /**
      * Shuts down the processor. Called when SDK is shut down. This is an
      * opportunity for processor to do any cleanup required.
      */
    /* CompleteClass */
    override def shutdown(): js.Promise[Unit] = js.native
  }
}
