package typings.opentelemetryTracing

import typings.opentelemetryApi.loggerMod.Logger
import typings.opentelemetryApi.tracerProviderMod.TracerProvider
import typings.opentelemetryResources.mod.Resource
import typings.opentelemetryTracing.mod.Tracer
import typings.opentelemetryTracing.noopSpanProcessorMod.NoopSpanProcessor
import typings.opentelemetryTracing.spanProcessorMod.SpanProcessor
import typings.opentelemetryTracing.typesMod.SDKRegistrationConfig
import typings.opentelemetryTracing.typesMod.TracerConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/tracing/build/src/BasicTracerProvider", JSImport.Namespace)
@js.native
object basicTracerProviderMod extends js.Object {
  
  @js.native
  class BasicTracerProvider () extends TracerProvider {
    def this(config: TracerConfig) = this()
    
    var _cleanNotifyOnGlobalShutdown: js.Any = js.native
    
    val _config: js.Any = js.native
    
    val _registeredSpanProcessors: js.Any = js.native
    
    var _shutdownActiveProcessor: js.Any = js.native
    
    val _tracers: js.Any = js.native
    
    var activeSpanProcessor: NoopSpanProcessor = js.native
    
    /**
      * Adds a new {@link SpanProcessor} to this tracer.
      * @param spanProcessor the new SpanProcessor to be added.
      */
    def addSpanProcessor(spanProcessor: SpanProcessor): Unit = js.native
    
    def getActiveSpanProcessor(): SpanProcessor = js.native
    
    def getTracer(name: String, version: js.UndefOr[scala.Nothing], config: TracerConfig): Tracer = js.native
    def getTracer(name: String, version: String, config: TracerConfig): Tracer = js.native
    
    val logger: Logger = js.native
    
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
    
    def shutdown(): Unit = js.native
    def shutdown(cb: js.Function0[Unit]): Unit = js.native
  }
}
