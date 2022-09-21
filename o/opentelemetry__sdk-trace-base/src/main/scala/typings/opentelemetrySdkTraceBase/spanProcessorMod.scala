package typings.opentelemetrySdkTraceBase

import typings.opentelemetryApi.contextTypesMod.Context
import typings.opentelemetrySdkTraceBase.readableSpanMod.ReadableSpan
import typings.opentelemetrySdkTraceBase.spanMod.Span
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spanProcessorMod {
  
  trait SpanProcessor extends StObject {
    
    /**
      * Forces to export all finished spans
      */
    def forceFlush(): js.Promise[Unit]
    
    /**
      * Called when a {@link ReadableSpan} is ended, if the `span.isRecording()`
      * returns true.
      * @param span the Span that just ended.
      */
    def onEnd(span: ReadableSpan): Unit
    
    /**
      * Called when a {@link Span} is started, if the `span.isRecording()`
      * returns true.
      * @param span the Span that just started.
      */
    def onStart(span: Span, parentContext: Context): Unit
    
    /**
      * Shuts down the processor. Called when SDK is shut down. This is an
      * opportunity for processor to do any cleanup required.
      */
    def shutdown(): js.Promise[Unit]
  }
  object SpanProcessor {
    
    inline def apply(
      forceFlush: () => js.Promise[Unit],
      onEnd: ReadableSpan => Unit,
      onStart: (Span, Context) => Unit,
      shutdown: () => js.Promise[Unit]
    ): SpanProcessor = {
      val __obj = js.Dynamic.literal(forceFlush = js.Any.fromFunction0(forceFlush), onEnd = js.Any.fromFunction1(onEnd), onStart = js.Any.fromFunction2(onStart), shutdown = js.Any.fromFunction0(shutdown))
      __obj.asInstanceOf[SpanProcessor]
    }
    
    extension [Self <: SpanProcessor](x: Self) {
      
      inline def setForceFlush(value: () => js.Promise[Unit]): Self = StObject.set(x, "forceFlush", js.Any.fromFunction0(value))
      
      inline def setOnEnd(value: ReadableSpan => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      inline def setOnStart(value: (Span, Context) => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction2(value))
      
      inline def setShutdown(value: () => js.Promise[Unit]): Self = StObject.set(x, "shutdown", js.Any.fromFunction0(value))
    }
  }
}
