package typings.opentelemetryApi

import typings.opentelemetryApi.spanContextMod.SpanContext
import typings.opentelemetryApi.tracerMod.Tracer
import typings.opentelemetryApi.tracerProviderMod.TracerProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object traceMod {
  
  @JSImport("@opentelemetry/api/build/src/api/trace", "TraceAPI")
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  class TraceAPI protected () extends StObject {
    
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
  object TraceAPI {
    
    @JSImport("@opentelemetry/api/build/src/api/trace", "TraceAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api/build/src/api/trace", "TraceAPI._instance")
    @js.native
    def _instance: js.Any = js.native
    @scala.inline
    def _instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the Trace API */
    @JSImport("@opentelemetry/api/build/src/api/trace", "TraceAPI.getInstance")
    @js.native
    def getInstance(): TraceAPI = js.native
  }
}
