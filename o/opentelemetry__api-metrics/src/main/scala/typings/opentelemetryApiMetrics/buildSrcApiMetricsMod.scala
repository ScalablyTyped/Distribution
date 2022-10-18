package typings.opentelemetryApiMetrics

import typings.opentelemetryApiMetrics.buildSrcTypesMeterMod.Meter
import typings.opentelemetryApiMetrics.buildSrcTypesMeterMod.MeterOptions
import typings.opentelemetryApiMetrics.buildSrcTypesMeterProviderMod.MeterProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcApiMetricsMod {
  
  @JSImport("@opentelemetry/api-metrics/build/src/api/metrics", "MetricsAPI")
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  /* private */ open class MetricsAPI () extends StObject {
    
    /** Remove the global meter provider */
    def disable(): Unit = js.native
    
    /**
      * Returns a meter from the global meter provider.
      */
    def getMeter(name: String): Meter = js.native
    def getMeter(name: String, version: String): Meter = js.native
    def getMeter(name: String, version: String, options: MeterOptions): Meter = js.native
    def getMeter(name: String, version: Unit, options: MeterOptions): Meter = js.native
    
    /**
      * Returns the global meter provider.
      */
    def getMeterProvider(): MeterProvider = js.native
    
    /**
      * Set the current global meter. Returns the initialized global meter provider.
      */
    def setGlobalMeterProvider(provider: MeterProvider): MeterProvider = js.native
  }
  /* static members */
  object MetricsAPI {
    
    @JSImport("@opentelemetry/api-metrics/build/src/api/metrics", "MetricsAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api-metrics/build/src/api/metrics", "MetricsAPI._instance")
    @js.native
    def _instance: Any = js.native
    inline def _instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the Metrics API */
    inline def getInstance(): MetricsAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[MetricsAPI]
  }
}
