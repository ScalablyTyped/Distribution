package typings.opentelemetryApi

import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.tracerMod.Tracer
import typings.opentelemetryApi.tracerProviderMod.TracerProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/api/trace", JSImport.Namespace)
@js.native
object traceMod extends js.Object {
  
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  class TraceAPI protected () extends js.Object {
    
    var _proxyTracerProvider: js.Any = js.native
    
    /** Remove the global tracer provider */
    def disable(): Unit = js.native
    
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
      * Set the current global tracer. Returns the initialized global tracer provider
      */
    def setGlobalTracerProvider(provider: TracerProvider): TracerProvider = js.native
  }
  /* static members */
  @js.native
  object TraceAPI extends js.Object {
    
    var _instance: js.Any = js.native
    
    /** Get the singleton instance of the Trace API */
    def getInstance(): TraceAPI = js.native
  }
}
