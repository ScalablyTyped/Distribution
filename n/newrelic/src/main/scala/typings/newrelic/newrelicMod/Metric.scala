package typings.newrelic.newrelicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  var count: Double
  var max: Double
  var min: Double
  var sumOfSquares: Double
  var total: Double
}

object Metric {
  @scala.inline
  def apply(count: Double, max: Double, min: Double, sumOfSquares: Double, total: Double): Metric = {
    val __obj = js.Dynamic.literal(count = count, max = max, min = min, sumOfSquares = sumOfSquares, total = total)
  
    __obj.asInstanceOf[Metric]
  }
}

