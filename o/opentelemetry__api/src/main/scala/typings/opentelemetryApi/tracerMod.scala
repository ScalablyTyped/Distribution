package typings.opentelemetryApi

import typings.opentelemetryApi.contextTypesMod.Context
import typings.opentelemetryApi.spanMod.Span
import typings.opentelemetryApi.spanOptionsMod.SpanOptions
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tracerMod {
  
  @js.native
  trait Tracer extends StObject {
    
    /**
      * Starts a new {@link Span} and calls the given function passing it the
      * created span as first argument.
      * Additionally the new span gets set in context and this context is activated
      * for the duration of the function call.
      *
      * @param name The name of the span
      * @param [options] SpanOptions used for span creation
      * @param [context] Context to use to extract parent
      * @param fn function called in the context of the span and receives the newly created span as an argument
      * @returns return value of fn
      * @example
      *     const something = tracer.startActiveSpan('op', span => {
      *       try {
      *         do some work
      *         span.setStatus({code: SpanStatusCode.OK});
      *         return something;
      *       } catch (err) {
      *         span.setStatus({
      *           code: SpanStatusCode.ERROR,
      *           message: err.message,
      *         });
      *         throw err;
      *       } finally {
      *         span.end();
      *       }
      *     });
      *
      * @example
      *     const span = tracer.startActiveSpan('op', span => {
      *       try {
      *         do some work
      *         return span;
      *       } catch (err) {
      *         span.setStatus({
      *           code: SpanStatusCode.ERROR,
      *           message: err.message,
      *         });
      *         throw err;
      *       }
      *     });
      *     do some more work
      *     span.end();
      */
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, Any] */](name: String, fn: F): ReturnType[F] = js.native
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, Any] */](name: String, options: SpanOptions, context: Context, fn: F): ReturnType[F] = js.native
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, Any] */](name: String, options: SpanOptions, fn: F): ReturnType[F] = js.native
    
    /**
      * Starts a new {@link Span}. Start the span without setting it on context.
      *
      * This method do NOT modify the current Context.
      *
      * @param name The name of the span
      * @param [options] SpanOptions used for span creation
      * @param [context] Context to use to extract parent
      * @returns Span The newly created span
      * @example
      *     const span = tracer.startSpan('op');
      *     span.setAttribute('key', 'value');
      *     span.end();
      */
    def startSpan(name: String): Span = js.native
    def startSpan(name: String, options: Unit, context: Context): Span = js.native
    def startSpan(name: String, options: SpanOptions): Span = js.native
    def startSpan(name: String, options: SpanOptions, context: Context): Span = js.native
  }
}
