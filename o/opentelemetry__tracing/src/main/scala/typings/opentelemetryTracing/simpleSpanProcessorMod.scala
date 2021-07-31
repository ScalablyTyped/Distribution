package typings.opentelemetryTracing

import typings.opentelemetryTracing.readableSpanMod.ReadableSpan
import typings.opentelemetryTracing.spanExporterMod.SpanExporter
import typings.opentelemetryTracing.spanProcessorMod.SpanProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleSpanProcessorMod {
  
  @JSImport("@opentelemetry/tracing/build/src/export/SimpleSpanProcessor", "SimpleSpanProcessor")
  @js.native
  class SimpleSpanProcessor protected ()
    extends StObject
       with SpanProcessor {
    def this(_exporter: SpanExporter) = this()
    
    val _exporter: js.Any = js.native
    
    var _isShutdown: js.Any = js.native
    
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
