package typings.node.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsMemoryEstimate extends js.Object {
  var jsMemoryEstimate: Double
  var jsMemoryRange: js.Tuple2[Double, Double]
}

object JsMemoryEstimate {
  @scala.inline
  def apply(jsMemoryEstimate: Double, jsMemoryRange: js.Tuple2[Double, Double]): JsMemoryEstimate = {
    val __obj = js.Dynamic.literal(jsMemoryEstimate = jsMemoryEstimate.asInstanceOf[js.Any], jsMemoryRange = jsMemoryRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsMemoryEstimate]
  }
}

