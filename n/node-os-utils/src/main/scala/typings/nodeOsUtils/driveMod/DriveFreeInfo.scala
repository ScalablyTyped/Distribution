package typings.nodeOsUtils.driveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveFreeInfo extends js.Object {
  
  var freeGb: Double = js.native
  
  var freePercentage: Double = js.native
  
  var totalGb: Double = js.native
}
object DriveFreeInfo {
  
  @scala.inline
  def apply(freeGb: Double, freePercentage: Double, totalGb: Double): DriveFreeInfo = {
    val __obj = js.Dynamic.literal(freeGb = freeGb.asInstanceOf[js.Any], freePercentage = freePercentage.asInstanceOf[js.Any], totalGb = totalGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveFreeInfo]
  }
  
  @scala.inline
  implicit class DriveFreeInfoOps[Self <: DriveFreeInfo] (val x: Self) extends AnyVal {
    
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
    def setFreeGb(value: Double): Self = this.set("freeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFreePercentage(value: Double): Self = this.set("freePercentage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalGb(value: Double): Self = this.set("totalGb", value.asInstanceOf[js.Any])
  }
}
