package typings.nodeOsUtils.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemFreeInfo extends js.Object {
  var freeMemMb: Double
  var totalMemMb: Double
}

object MemFreeInfo {
  @scala.inline
  def apply(freeMemMb: Double, totalMemMb: Double): MemFreeInfo = {
    val __obj = js.Dynamic.literal(freeMemMb = freeMemMb.asInstanceOf[js.Any], totalMemMb = totalMemMb.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemFreeInfo]
  }
}

