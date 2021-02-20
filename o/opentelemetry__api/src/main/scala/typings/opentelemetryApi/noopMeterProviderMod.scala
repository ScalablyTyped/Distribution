package typings.opentelemetryApi

import typings.opentelemetryApi.meterMod.Meter
import typings.opentelemetryApi.meterProviderMod.MeterProvider
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noopMeterProviderMod {
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeterProvider", "NOOP_METER_PROVIDER")
  @js.native
  val NOOP_METER_PROVIDER: NoopMeterProvider = js.native
  
  @JSImport("@opentelemetry/api/build/src/metrics/NoopMeterProvider", "NoopMeterProvider")
  @js.native
  class NoopMeterProvider () extends MeterProvider {
    
    def getMeter(): Meter = js.native
    def getMeter(_name: js.UndefOr[scala.Nothing], _version: String): Meter = js.native
  }
}
