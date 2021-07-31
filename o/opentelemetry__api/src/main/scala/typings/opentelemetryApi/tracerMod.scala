package typings.opentelemetryApi

import typings.opentelemetryApi.spanMod.Span
import typings.opentelemetryApi.spanOptionsMod.SpanOptions
import typings.opentelemetryContextBase.mod.Context
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tracerMod {
  
  @js.native
  trait Tracer extends StObject {
    
    /**
      * Bind a span as the target's context or propagate the current one.
      *
      * @param target Any object to which a context need to be set
      * @param [context] Optionally specify the context which you want to bind
      */
    def bind[T](target: T): T = js.native
    def bind[T](target: T, context: Span): T = js.native
    
    /**
      * Returns the current Span from the current context if available.
      *
      * If there is no Span associated with the current context, `undefined` is
      * returned.
      *
      * To install a {@link Span} to the current Context use
      * {@link Tracer.withSpan}.
      *
      * @returns Span The currently active Span
      */
    def getCurrentSpan(): js.UndefOr[Span] = js.native
    
    /**
      * Starts a new {@link Span}. Start the span without setting it as the current
      * span in this tracer's context.
      *
      * This method do NOT modify the current Context. To install a {@link
      * Span} to the current Context use {@link Tracer.withSpan}.
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
    
    /**
      * Executes the function given by fn within the context provided by Span.
      *
      * This is a convenience method for creating spans attached to the tracer's
      * context. Applications that need more control over the span lifetime should
      * use {@link Tracer.startSpan} instead.
      *
      * @param span The span that provides the context
      * @param fn The function to be executed inside the provided context
      * @example
      *     tracer.withSpan(span, () => {
      *         tracer.getCurrentSpan().addEvent("parent's event");
      *         doSomeOtherWork();  // Here "span" is the current Span.
      *     });
      */
    def withSpan[T /* <: js.Function1[/* repeated */ js.Any, ReturnType[T]] */](span: Span, fn: T): ReturnType[T] = js.native
  }
}
