package typings.opentelemetryApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@opentelemetry/api", "NoopMetric")
@js.native
class NoopMetric[T] protected ()
  extends typings.opentelemetryApi.noopMeterMod.NoopMetric[T] {
  def this(instrument: T) = this()
}
