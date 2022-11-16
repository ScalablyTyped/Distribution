package typings.opentelemetryApi

import typings.opentelemetryApi.buildSrcMetricsMeterProviderMod.MeterProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildSrcMetricsNoopMeterProviderMod {
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeterProvider", "NOOP_METER_PROVIDER")
  @js.native
  val NOOP_METER_PROVIDER: NoopMeterProvider = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeterProvider", "NoopMeterProvider")
  @js.native
  open class NoopMeterProvider ()
    extends StObject
       with MeterProvider
}
