package typings.node.vmMod

import typings.node.anon.JsMemoryEstimate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemoryMeasurement extends js.Object {
  var total: JsMemoryEstimate
}

object MemoryMeasurement {
  @scala.inline
  def apply(total: JsMemoryEstimate): MemoryMeasurement = {
    val __obj = js.Dynamic.literal(total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemoryMeasurement]
  }
}

