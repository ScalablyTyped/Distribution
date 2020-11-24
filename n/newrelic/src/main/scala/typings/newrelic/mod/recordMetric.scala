package typings.newrelic.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("newrelic", "recordMetric")
@js.native
object recordMetric extends js.Object {
  
  def apply(name: String, value: Double): Unit = js.native
  def apply(name: String, value: Metric): Unit = js.native
}
