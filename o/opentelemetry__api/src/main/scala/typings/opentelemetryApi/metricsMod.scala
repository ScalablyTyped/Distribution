package typings.opentelemetryApi

import typings.opentelemetryApi.meterMod.Meter
import typings.opentelemetryApi.meterProviderMod.MeterProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/api/metrics", JSImport.Namespace)
@js.native
object metricsMod extends js.Object {
  
  @js.native
  /** Empty private constructor prevents end users from constructing a new instance of the API */
  class MetricsAPI protected () extends js.Object {
    
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
  @js.native
  object MetricsAPI extends js.Object {
    
    var _instance: js.Any = js.native
    
    /** Get the singleton instance of the Metrics API */
    def getInstance(): MetricsAPI = js.native
  }
}
