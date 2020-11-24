package typings.nodeOsUtils.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.nodeOsUtils.memMod.MemUsedInfo because var conflicts: totalMemMb. Inlined usedMemMb */ @js.native
trait MemInfo extends MemFreeInfo {
  
  var freeMemPercentage: Double = js.native
  
  var usedMemMb: Double = js.native
}
object MemInfo {
  
  @scala.inline
  def apply(freeMemMb: Double, freeMemPercentage: Double, totalMemMb: Double, usedMemMb: Double): MemInfo = {
    val __obj = js.Dynamic.literal(freeMemMb = freeMemMb.asInstanceOf[js.Any], freeMemPercentage = freeMemPercentage.asInstanceOf[js.Any], totalMemMb = totalMemMb.asInstanceOf[js.Any], usedMemMb = usedMemMb.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemInfo]
  }
  
  @scala.inline
  implicit class MemInfoOps[Self <: MemInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFreeMemPercentage(value: Double): Self = this.set("freeMemPercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedMemMb(value: Double): Self = this.set("usedMemMb", value.asInstanceOf[js.Any])
  }
}
