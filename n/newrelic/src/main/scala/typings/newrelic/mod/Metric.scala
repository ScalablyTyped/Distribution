package typings.newrelic.mod

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
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], sumOfSquares = sumOfSquares.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Metric]
  }
}

