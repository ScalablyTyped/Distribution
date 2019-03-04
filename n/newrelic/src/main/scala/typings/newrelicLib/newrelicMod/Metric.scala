package typings
package newrelicLib.newrelicMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  var count: scala.Double
  var max: scala.Double
  var min: scala.Double
  var sumOfSquares: scala.Double
  var total: scala.Double
}

object Metric {
  @scala.inline
  def apply(
    count: scala.Double,
    max: scala.Double,
    min: scala.Double,
    sumOfSquares: scala.Double,
    total: scala.Double
  ): Metric = {
    val __obj = js.Dynamic.literal(count = count, max = max, min = min, sumOfSquares = sumOfSquares, total = total)
  
    __obj.asInstanceOf[Metric]
  }
}

