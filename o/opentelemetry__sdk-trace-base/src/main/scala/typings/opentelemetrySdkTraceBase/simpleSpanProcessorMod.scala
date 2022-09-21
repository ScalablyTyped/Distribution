package typings.opentelemetrySdkTraceBase

import typings.opentelemetryApi.contextTypesMod.Context
import typings.opentelemetrySdkTraceBase.readableSpanMod.ReadableSpan
import typings.opentelemetrySdkTraceBase.spanExporterMod.SpanExporter
import typings.opentelemetrySdkTraceBase.spanMod.Span
import typings.opentelemetrySdkTraceBase.spanProcessorMod.SpanProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleSpanProcessorMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/export/SimpleSpanProcessor", "SimpleSpanProcessor")
  @js.native
  open class SimpleSpanProcessor protected ()
    extends StObject
       with SpanProcessor {
    def this(_exporter: SpanExporter) = this()
    
    /* private */ val _exporter: Any = js.native
    
    /* private */ var _shutdown: Any = js.native
    
    /* private */ var _shutdownOnce: Any = js.native
    
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
