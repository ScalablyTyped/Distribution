package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcContextTypesMod.Context
import typings.opentelemetryApi.buildSrcTraceSpanMod.Span
import typings.opentelemetryApi.buildSrcTraceSpanOptionsMod.SpanOptions
import typings.opentelemetryApi.buildSrcTraceTracerMod.Tracer
import typings.opentelemetryApi.buildSrcTraceTracerOptionsMod.TracerOptions
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcTraceProxyTracerMod {
  
  @JSImport("@opentelemetry/api/build/src/trace/ProxyTracer", "ProxyTracer")
  @js.native
  open class ProxyTracer protected ()
    extends StObject
       with Tracer {
    def this(_provider: TracerDelegator, name: String) = this()
    def this(_provider: TracerDelegator, name: String, version: String) = this()
    def this(_provider: TracerDelegator, name: String, version: String, options: TracerOptions) = this()
    def this(_provider: TracerDelegator, name: String, version: Unit, options: TracerOptions) = this()
    
    /* private */ var _delegate: Any = js.native
    
    /**
      * Try to get a tracer from the proxy tracer provider.
      * If the proxy tracer provider has no delegate, return a noop tracer.
      */
    /* private */ var _getTracer: Any = js.native
    
    /* private */ var _provider: Any = js.native
    
    val name: String = js.native
    
    val options: js.UndefOr[TracerOptions] = js.native
    
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, Any] */](_name: String, _options: F, _context: F): ReturnType[F] = js.native
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, Any] */](_name: String, _options: F, _context: F, _fn: F): ReturnType[F] = js.native
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, Any] */](_name: String, _options: F, _context: Unit, _fn: F): ReturnType[F] = js.native
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, Any] */](_name: String, _options: F, _context: Context): ReturnType[F] = js.native
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, Any] */](_name: String, _options: F, _context: Context, _fn: F): ReturnType[F] = js.native
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, Any] */](_name: String, _options: SpanOptions): ReturnType[F] = js.native
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, Any] */](_name: String, _options: SpanOptions, _context: F, _fn: F): ReturnType[F] = js.native
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, Any] */](_name: String, _options: SpanOptions, _context: Unit, _fn: F): ReturnType[F] = js.native
    def startActiveSpan[F /* <: js.Function1[/* span */ Span, Any] */](_name: String, _options: SpanOptions, _context: Context): ReturnType[F] = js.native
    
    val version: js.UndefOr[String] = js.native
  }
  
  @js.native
  trait TracerDelegator extends StObject {
    
    def getDelegateTracer(name: String): js.UndefOr[Tracer] = js.native
    def getDelegateTracer(name: String, version: String): js.UndefOr[Tracer] = js.native
    def getDelegateTracer(name: String, version: String, options: TracerOptions): js.UndefOr[Tracer] = js.native
    def getDelegateTracer(name: String, version: Unit, options: TracerOptions): js.UndefOr[Tracer] = js.native
  }
}
