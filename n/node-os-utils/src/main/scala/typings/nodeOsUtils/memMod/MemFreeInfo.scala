package typings.nodeOsUtils.memMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemFreeInfo extends js.Object {
  
  var freeMemMb: Double = js.native
  
  var totalMemMb: Double = js.native
}
object MemFreeInfo {
  
  @scala.inline
  def apply(freeMemMb: Double, totalMemMb: Double): MemFreeInfo = {
    val __obj = js.Dynamic.literal(freeMemMb = freeMemMb.asInstanceOf[js.Any], totalMemMb = totalMemMb.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemFreeInfo]
  }
  
  @scala.inline
  implicit class MemFreeInfoOps[Self <: MemFreeInfo] (val x: Self) extends AnyVal {
    
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
    def setFreeMemMb(value: Double): Self = this.set("freeMemMb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalMemMb(value: Double): Self = this.set("totalMemMb", value.asInstanceOf[js.Any])
  }
}
