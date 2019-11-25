package typings.nodeDashOsDashUtils.libMemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.nodeDashOsDashUtils.libMemMod.MemUsedInfo because var conflicts: totalMemMb. Inlined usedMemMb */ trait MemInfo extends MemFreeInfo {
  var freeMemPercentage: Double
  var usedMemMb: Double
}

object MemInfo {
  @scala.inline
  def apply(freeMemMb: Double, freeMemPercentage: Double, totalMemMb: Double, usedMemMb: Double): MemInfo = {
    val __obj = js.Dynamic.literal(freeMemMb = freeMemMb.asInstanceOf[js.Any], freeMemPercentage = freeMemPercentage.asInstanceOf[js.Any], totalMemMb = totalMemMb.asInstanceOf[js.Any], usedMemMb = usedMemMb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MemInfo]
  }
}

