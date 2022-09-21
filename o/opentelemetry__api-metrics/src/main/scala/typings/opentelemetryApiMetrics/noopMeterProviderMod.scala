package typings.opentelemetryApiMetrics

import typings.opentelemetryApiMetrics.meterProviderMod.MeterProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopMeterProviderMod {
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeterProvider", "NOOP_METER_PROVIDER")
  @js.native
  val NOOP_METER_PROVIDER: NoopMeterProvider = js.native
  
  @JSImport("@opentelemetry/api-metrics/build/src/NoopMeterProvider", "NoopMeterProvider")
  @js.native
  open class NoopMeterProvider ()
    extends StObject
       with MeterProvider
}
