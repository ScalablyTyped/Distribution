package typings.opentelemetryTracing

import typings.opentelemetryTracing.readableSpanMod.ReadableSpan
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spanProcessorMod {
  
  @js.native
  trait SpanProcessor extends StObject {
    
    /**
      * Forces to export all finished spans
      */
    def forceFlush(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Called when a {@link ReadableSpan} is ended, if the `span.isRecording()`
      * returns true.
      * @param span the Span that just ended.
      */
    def onEnd(span: ReadableSpan): Unit = js.native
    
    /**
      * Called when a {@link ReadableSpan} is started, if the `span.isRecording()`
      * returns true.
      * @param span the Span that just started.
      */
    def onStart(span: ReadableSpan): Unit = js.native
    
    /**
      * Shuts down the processor. Called when SDK is shut down. This is an
      * opportunity for processor to do any cleanup required.
      */
    def shutdown(callback: js.Function0[Unit]): Unit = js.native
  }
  object SpanProcessor {
    
    @scala.inline
    def apply(
      forceFlush: js.Function0[Unit] => Unit,
      onEnd: ReadableSpan => Unit,
      onStart: ReadableSpan => Unit,
      shutdown: js.Function0[Unit] => Unit
    ): SpanProcessor = {
      val __obj = js.Dynamic.literal(forceFlush = js.Any.fromFunction1(forceFlush), onEnd = js.Any.fromFunction1(onEnd), onStart = js.Any.fromFunction1(onStart), shutdown = js.Any.fromFunction1(shutdown))
      __obj.asInstanceOf[SpanProcessor]
    }
    
    @scala.inline
    implicit class SpanProcessorMutableBuilder[Self <: SpanProcessor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForceFlush(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "forceFlush", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnd(value: ReadableSpan => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStart(value: ReadableSpan => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShutdown(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "shutdown", js.Any.fromFunction1(value))
    }
  }
}
