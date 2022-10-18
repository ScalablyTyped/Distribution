package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcContextTypesMod.Context
import typings.opentelemetryApi.buildSrcTraceSpanContextMod.SpanContext
import typings.opentelemetryApi.buildSrcTraceSpanMod.Span
import typings.opentelemetryApi.buildSrcTraceTracerMod.Tracer
import typings.opentelemetryApi.buildSrcTraceTracerProviderMod.TracerProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcApiTraceMod {
  
  @JSImport("@opentelemetry/api/build/src/api/trace", "TraceAPI")
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  /* private */ open class TraceAPI () extends StObject {
    
    /* private */ var _proxyTracerProvider: Any = js.native
    
    def deleteSpan(context: Context): Context = js.native
    @JSName("deleteSpan")
    var deleteSpan_Original: js.Function1[/* context */ Context, Context] = js.native
    
    /** Remove the global tracer provider */
    def disable(): Unit = js.native
    
    def getActiveSpan(): js.UndefOr[Span] = js.native
    @JSName("getActiveSpan")
    var getActiveSpan_Original: js.Function0[js.UndefOr[Span]] = js.native
    
    def getSpan(context: Context): js.UndefOr[Span] = js.native
    
    def getSpanContext(context: Context): js.UndefOr[SpanContext] = js.native
    @JSName("getSpanContext")
    var getSpanContext_Original: js.Function1[/* context */ Context, js.UndefOr[SpanContext]] = js.native
    
    @JSName("getSpan")
    var getSpan_Original: js.Function1[/* context */ Context, js.UndefOr[Span]] = js.native
    
    /**
      * Returns a tracer from the global tracer provider.
      */
    def getTracer(name: String): Tracer = js.native
    def getTracer(name: String, version: String): Tracer = js.native
    
    /**
      * Returns the global tracer provider.
      */
    def getTracerProvider(): TracerProvider = js.native
    
    def isSpanContextValid(spanContext: SpanContext): Boolean = js.native
    @JSName("isSpanContextValid")
    var isSpanContextValid_Original: js.Function1[/* spanContext */ SpanContext, Boolean] = js.native
    
    /**
      * Set the current global tracer.
      *
      * @returns true if the tracer provider was successfully registered, else false
      */
    def setGlobalTracerProvider(provider: TracerProvider): Boolean = js.native
    
    def setSpan(context: Context, span: Span): Context = js.native
    
    def setSpanContext(context: Context, spanContext: SpanContext): Context = js.native
    @JSName("setSpanContext")
    var setSpanContext_Original: js.Function2[/* context */ Context, /* spanContext */ SpanContext, Context] = js.native
    
    @JSName("setSpan")
    var setSpan_Original: js.Function2[/* context */ Context, /* span */ Span, Context] = js.native
    
    def wrapSpanContext(spanContext: SpanContext): Span = js.native
    @JSName("wrapSpanContext")
    var wrapSpanContext_Original: js.Function1[/* spanContext */ SpanContext, Span] = js.native
  }
  /* static members */
  object TraceAPI {
    
    @JSImport("@opentelemetry/api/build/src/api/trace", "TraceAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api/build/src/api/trace", "TraceAPI._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the Trace API */
    inline def getInstance(): TraceAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[TraceAPI]
  }
}
