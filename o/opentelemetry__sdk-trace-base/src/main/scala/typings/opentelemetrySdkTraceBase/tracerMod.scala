package typings.opentelemetrySdkTraceBase

import typings.opentelemetryCore.typesMod.InstrumentationLibrary
import typings.opentelemetryResources.mod.Resource
import typings.opentelemetrySdkTraceBase.basicTracerProviderMod.BasicTracerProvider
import typings.opentelemetrySdkTraceBase.spanProcessorMod.SpanProcessor
import typings.opentelemetrySdkTraceBase.typesMod.GeneralLimits
import typings.opentelemetrySdkTraceBase.typesMod.SpanLimits
import typings.opentelemetrySdkTraceBase.typesMod.TracerConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tracerMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/Tracer", "Tracer")
  @js.native
  open class Tracer protected ()
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
    
    /* private */ val _generalLimits: Any = js.native
    
    /* private */ val _idGenerator: Any = js.native
    
    /* private */ val _sampler: Any = js.native
    
    /* private */ val _spanLimits: Any = js.native
    
    /* private */ var _tracerProvider: Any = js.native
    
    def getActiveSpanProcessor(): SpanProcessor = js.native
    
    /** Returns the active {@link GeneralLimits}. */
    def getGeneralLimits(): GeneralLimits = js.native
    
    /** Returns the active {@link SpanLimits}. */
    def getSpanLimits(): SpanLimits = js.native
    
    val instrumentationLibrary: InstrumentationLibrary = js.native
    
    val resource: Resource = js.native
  }
}
