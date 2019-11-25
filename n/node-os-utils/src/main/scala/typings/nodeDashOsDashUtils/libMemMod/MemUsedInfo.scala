package typings.nodeDashOsDashUtils.libMemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MemUsedInfo extends js.Object {
  var totalMemMb: Double
  var usedMemMb: Double
}

object MemUsedInfo {
  @scala.inline
  def apply(totalMemMb: Double, usedMemMb: Double): MemUsedInfo = {
    val __obj = js.Dynamic.literal(totalMemMb = totalMemMb.asInstanceOf[js.Any], usedMemMb = usedMemMb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemUsedInfo]
  }
}

