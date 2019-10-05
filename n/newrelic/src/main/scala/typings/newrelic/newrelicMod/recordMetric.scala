package typings.newrelic.newrelicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("newrelic", "recordMetric")
@js.native
object recordMetric extends js.Object {
  def apply(name: String, value: Double): Unit = js.native
  def apply(name: String, value: Metric): Unit = js.native
}

