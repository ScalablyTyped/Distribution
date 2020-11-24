package typings.opentelemetryApi

import typings.opentelemetryApi.meterMod.Meter
import typings.opentelemetryApi.meterProviderMod.MeterProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api/build/src/metrics/NoopMeterProvider", JSImport.Namespace)
@js.native
object noopMeterProviderMod extends js.Object {
  
  val NOOP_METER_PROVIDER: NoopMeterProvider = js.native
  
  @js.native
  class NoopMeterProvider () extends MeterProvider {
    
    def getMeter(): Meter = js.native
    def getMeter(_name: js.UndefOr[scala.Nothing], _version: String): Meter = js.native
  }
}
