package typings
package onionooLib.onionooMod.OnionooNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Histogram extends js.Object {
  var count: scala.Double
  var factor: scala.Double
  var first: java.lang.String
  var interval: scala.Double
  var last: java.lang.String
  var values: js.Array[scala.Double]
}

object Histogram {
  @scala.inline
  def apply(
    count: scala.Double,
    factor: scala.Double,
    first: java.lang.String,
    interval: scala.Double,
    last: java.lang.String,
    values: js.Array[scala.Double]
  ): Histogram = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("factor")(factor)
    __obj.updateDynamic("first")(first)
    __obj.updateDynamic("interval")(interval)
    __obj.updateDynamic("last")(last)
    __obj.updateDynamic("values")(values)
    __obj.asInstanceOf[Histogram]
  }
}

