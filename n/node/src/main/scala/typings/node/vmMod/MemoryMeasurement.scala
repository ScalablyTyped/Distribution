package typings.node.vmMod

import typings.node.AnonJsMemoryEstimate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryMeasurement extends js.Object {
  var total: AnonJsMemoryEstimate
}

object MemoryMeasurement {
  @scala.inline
  def apply(total: AnonJsMemoryEstimate): MemoryMeasurement = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemoryMeasurement]
  }
}

