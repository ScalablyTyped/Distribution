package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonJsMemoryEstimate extends js.Object {
  var jsMemoryEstimate: Double
  var jsMemoryRange: js.Tuple2[Double, Double]
}

object AnonJsMemoryEstimate {
  @scala.inline
  def apply(jsMemoryEstimate: Double, jsMemoryRange: js.Tuple2[Double, Double]): AnonJsMemoryEstimate = {
    val __obj = js.Dynamic.literal(jsMemoryEstimate = jsMemoryEstimate.asInstanceOf[js.Any], jsMemoryRange = jsMemoryRange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonJsMemoryEstimate]
  }
}

