package typings.opentelemetryApi.metricMod

import typings.opentelemetryApi.boundInstrumentMod.BoundCounter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpDownCounter extends UnboundMetric[BoundCounter] {
  
  /**
    * Adds the given value to the current value. Values can be negative.
    */
  def add(value: Double): Unit = js.native
  def add(value: Double, labels: Labels): Unit = js.native
}
