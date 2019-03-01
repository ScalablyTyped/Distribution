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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("sumOfSquares")(sumOfSquares)
    __obj.updateDynamic("total")(total)
    __obj.asInstanceOf[Metric]
  }
}

