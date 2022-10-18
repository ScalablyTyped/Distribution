package typings.opentelemetrySdkTraceBase

import typings.opentelemetryApi.buildSrcContextTypesMod.Context
import typings.opentelemetrySdkTraceBase.buildSrcExportReadableSpanMod.ReadableSpan
import typings.opentelemetrySdkTraceBase.buildSrcSpanMod.Span
import typings.opentelemetrySdkTraceBase.buildSrcSpanProcessorMod.SpanProcessor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcExportNoopSpanProcessorMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/export/NoopSpanProcessor", "NoopSpanProcessor")
  @js.native
  open class NoopSpanProcessor ()
    extends StObject
       with SpanProcessor {
    
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
