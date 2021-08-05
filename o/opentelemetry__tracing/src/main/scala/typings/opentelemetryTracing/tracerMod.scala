package typings.opentelemetryTracing

import typings.opentelemetryApi.loggerMod.Logger
import typings.opentelemetryApi.mod.Context_
import typings.opentelemetryApi.spanMod.Span
import typings.opentelemetryApi.spanOptionsMod.SpanOptions
import typings.opentelemetryCore.typesMod.InstrumentationLibrary
import typings.opentelemetryResources.mod.Resource
import typings.opentelemetryTracing.basicTracerProviderMod.BasicTracerProvider
import typings.opentelemetryTracing.spanProcessorMod.SpanProcessor
import typings.opentelemetryTracing.typesMod.TraceParams
import typings.opentelemetryTracing.typesMod.TracerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tracerMod {
  
  @JSImport("@opentelemetry/tracing/build/src/Tracer", "Tracer")
  @js.native
  class Tracer protected ()
    extends StObject
       with typings.opentelemetryApi.tracerMod.Tracer {
    /**
      * Constructs a new Tracer instance.
      */
    def this(
      instrumentationLibrary: InstrumentationLibrary,
      config: TracerConfig,
      _tracerProvider: BasicTracerProvider
    ) = this()
    
    /* private */ val _idGenerator: js.Any = js.native
    
    /* private */ val _sampler: js.Any = js.native
    
    /* private */ val _traceParams: js.Any = js.native
    
    /* private */ var _tracerProvider: js.Any = js.native
    
    def getActiveSpanProcessor(): SpanProcessor = js.native
    
    /** Returns the active {@link TraceParams}. */
    def getActiveTraceParams(): TraceParams = js.native
    
    val instrumentationLibrary: InstrumentationLibrary = js.native
    
    val logger: Logger = js.native
    
    val resource: Resource = js.native
    
    def startSpan(name: String, options: Unit, context: Context_): Span = js.native
    def startSpan(name: String, options: SpanOptions, context: Context_): Span = js.native
  }
}
