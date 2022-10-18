package typings.opentelemetryInstrumentationGrpc

import typings.opentelemetryApi.buildSrcTraceTracerProviderMod.TracerProvider
import typings.opentelemetryApiMetrics.buildSrcTypesMeterProviderMod.MeterProvider
import typings.opentelemetryInstrumentationGrpc.buildSrcTypesMod.GrpcInstrumentationConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcInstrumentationMod {
  
  @JSImport("@opentelemetry/instrumentation-grpc/build/src/instrumentation", "GRPC_TRACE_KEY")
  @js.native
  val GRPC_TRACE_KEY: /* "grpc-trace-bin" */ String = js.native
  
  @JSImport("@opentelemetry/instrumentation-grpc/build/src/instrumentation", "GrpcInstrumentation")
  @js.native
  open class GrpcInstrumentation () extends StObject {
    def this(config: GrpcInstrumentationConfig) = this()
    
    /* private */ var _grpcJsInstrumentation: Any = js.native
    
    /* private */ var _grpcNativeInstrumentation: Any = js.native
    
    def disable(): Unit = js.native
    
    def enable(): Unit = js.native
    
    /**
      * @internal
      * Public reference to the protected BaseInstrumentation `_config` instance to be used by this
      * plugin's external helper functions
      */
    def getConfig(): GrpcInstrumentationConfig = js.native
    
    def init(): Unit = js.native
    
    val instrumentationName: String = js.native
    
    val instrumentationVersion: String = js.native
    
    def setConfig(): Unit = js.native
    def setConfig(config: GrpcInstrumentationConfig): Unit = js.native
    
    /**
      * Sets MeterProvider to this plugin
      * @param meterProvider
      */
    def setMeterProvider(meterProvider: MeterProvider): Unit = js.native
    
    /**
      * Sets TraceProvider to this plugin
      * @param tracerProvider
      */
    def setTracerProvider(tracerProvider: TracerProvider): Unit = js.native
  }
}
