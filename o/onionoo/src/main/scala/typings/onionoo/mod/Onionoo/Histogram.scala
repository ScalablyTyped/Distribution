package typings.onionoo.mod.Onionoo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Histogram extends js.Object {
  var count: Double
  var factor: Double
  var first: String
  var interval: Double
  var last: String
  var values: js.Array[Double]
}

object Histogram {
  @scala.inline
  def apply(
    count: Double,
    factor: Double,
    first: String,
    interval: Double,
    last: String,
    values: js.Array[Double]
  ): Histogram = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], factor = factor.asInstanceOf[js.Any], first = first.asInstanceOf[js.Any], interval = interval.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[Histogram]
  }
}

