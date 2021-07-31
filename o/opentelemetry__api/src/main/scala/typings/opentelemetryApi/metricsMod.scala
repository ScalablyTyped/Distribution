package typings.opentelemetryApi

import typings.opentelemetryApi.meterMod.Meter
import typings.opentelemetryApi.meterProviderMod.MeterProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metricsMod {
  
  @JSImport("@opentelemetry/api/build/src/api/metrics", "MetricsAPI")
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  class MetricsAPI protected () extends StObject {
    
    /** Remove the global meter provider */
    def disable(): Unit = js.native
    
    /**
      * Returns a meter from the global meter provider.
      */
    def getMeter(name: String): Meter = js.native
    def getMeter(name: String, version: String): Meter = js.native
    
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
    
    @JSImport("@opentelemetry/api/build/src/api/metrics", "MetricsAPI")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@opentelemetry/api/build/src/api/metrics", "MetricsAPI._instance")
    @js.native
    def _instance: js.Any = js.native
    @scala.inline
    def _instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_instance")(x.asInstanceOf[js.Any])
    
    /** Get the singleton instance of the Metrics API */
    @scala.inline
    def getInstance(): MetricsAPI = ^.asInstanceOf[js.Dynamic].applyDynamic("getInstance")().asInstanceOf[MetricsAPI]
  }
}
