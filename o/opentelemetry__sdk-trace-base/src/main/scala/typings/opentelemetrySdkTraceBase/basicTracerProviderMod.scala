package typings.opentelemetrySdkTraceBase

import typings.opentelemetryApi.textMapPropagatorMod.TextMapPropagator
import typings.opentelemetryApi.tracerProviderMod.TracerProvider
import typings.opentelemetryResources.mod.Resource
import typings.opentelemetrySdkTraceBase.anon.SchemaUrl
import typings.opentelemetrySdkTraceBase.mod.Tracer
import typings.opentelemetrySdkTraceBase.spanExporterMod.SpanExporter
import typings.opentelemetrySdkTraceBase.spanProcessorMod.SpanProcessor
import typings.opentelemetrySdkTraceBase.typesMod.SDKRegistrationConfig
import typings.opentelemetrySdkTraceBase.typesMod.TracerConfig
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicTracerProviderMod {
  
  @JSImport("@opentelemetry/sdk-trace-base/build/src/BasicTracerProvider", "BasicTracerProvider")
  @js.native
  open class BasicTracerProvider ()
    extends StObject
       with TracerProvider {
    def this(config: TracerConfig) = this()
    
    /* protected */ def _buildExporterFromEnv(): js.UndefOr[SpanExporter] = js.native
    
    /* protected */ def _buildPropagatorFromEnv(): js.UndefOr[TextMapPropagator[Any]] = js.native
    
    /* private */ val _config: Any = js.native
    
    /**
      * TS cannot yet infer the type of this.constructor:
      * https://github.com/Microsoft/TypeScript/issues/3841#issuecomment-337560146
      * There is no need to override either of the getters in your child class.
      * The type of the registered component maps should be the same across all
      * classes in the inheritance tree.
      */
    /* protected */ def _getPropagator(name: String): js.UndefOr[TextMapPropagator[Any]] = js.native
    
    /* protected */ def _getSpanExporter(name: String): js.UndefOr[SpanExporter] = js.native
    
    /* private */ val _registeredSpanProcessors: Any = js.native
    
    /* private */ val _tracers: Any = js.native
    
    var activeSpanProcessor: SpanProcessor = js.native
    
    /**
      * Adds a new {@link SpanProcessor} to this tracer.
      * @param spanProcessor the new SpanProcessor to be added.
      */
    def addSpanProcessor(spanProcessor: SpanProcessor): Unit = js.native
    
    def forceFlush(): js.Promise[Unit] = js.native
    
    def getActiveSpanProcessor(): SpanProcessor = js.native
    
    def getTracer(name: String, version: String, options: SchemaUrl): Tracer = js.native
    def getTracer(name: String, version: Unit, options: SchemaUrl): Tracer = js.native
    
    /**
      * Register this TracerProvider for use with the OpenTelemetry API.
      * Undefined values may be replaced with defaults, and
      * null values will be skipped.
      *
      * @param config Configuration object for SDK registration
      */
    def register(): Unit = js.native
    def register(config: SDKRegistrationConfig): Unit = js.native
    
    val resource: Resource = js.native
    
    def shutdown(): js.Promise[Unit] = js.native
  }
  /* static members */
  object BasicTracerProvider {
    
    @JSImport("@opentelemetry/sdk-trace-base/build/src/BasicTracerProvider", "BasicTracerProvider._registeredExporters")
    @js.native
    val _registeredExporters: Map[String, EXPORTER_FACTORY] = js.native
    
    @JSImport("@opentelemetry/sdk-trace-base/build/src/BasicTracerProvider", "BasicTracerProvider._registeredPropagators")
    @js.native
    val _registeredPropagators: Map[String, PROPAGATOR_FACTORY] = js.native
  }
  
  @js.native
  sealed trait ForceFlushState extends StObject
  @JSImport("@opentelemetry/sdk-trace-base/build/src/BasicTracerProvider", "ForceFlushState")
  @js.native
  object ForceFlushState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ForceFlushState & Double] = js.native
    
    @js.native
    sealed trait error
      extends StObject
         with ForceFlushState
    /* 2 */ val error: typings.opentelemetrySdkTraceBase.basicTracerProviderMod.ForceFlushState.error & Double = js.native
    
    @js.native
    sealed trait resolved
      extends StObject
         with ForceFlushState
    /* 0 */ val resolved: typings.opentelemetrySdkTraceBase.basicTracerProviderMod.ForceFlushState.resolved & Double = js.native
    
    @js.native
    sealed trait timeout
      extends StObject
         with ForceFlushState
    /* 1 */ val timeout: typings.opentelemetrySdkTraceBase.basicTracerProviderMod.ForceFlushState.timeout & Double = js.native
    
    @js.native
    sealed trait unresolved
      extends StObject
         with ForceFlushState
    /* 3 */ val unresolved: typings.opentelemetrySdkTraceBase.basicTracerProviderMod.ForceFlushState.unresolved & Double = js.native
  }
  
  type EXPORTER_FACTORY = js.Function0[SpanExporter]
  
  type PROPAGATOR_FACTORY = js.Function0[TextMapPropagator[Any]]
}
