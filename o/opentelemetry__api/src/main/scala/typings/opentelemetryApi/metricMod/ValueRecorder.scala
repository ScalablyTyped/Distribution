package typings.opentelemetryApi.metricMod

import typings.opentelemetryApi.boundInstrumentMod.BoundValueRecorder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValueRecorder extends UnboundMetric[BoundValueRecorder] {
  
  /**
    * Records the given value to this value recorder.
    */
  def record(value: Double): Unit = js.native
  def record(value: Double, labels: Labels): Unit = js.native
}
