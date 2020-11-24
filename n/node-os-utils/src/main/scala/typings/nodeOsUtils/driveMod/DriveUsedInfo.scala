package typings.nodeOsUtils.driveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveUsedInfo extends js.Object {
  
  var totalGb: Double = js.native
  
  var usedGb: Double = js.native
  
  var usedPercentage: Double = js.native
}
object DriveUsedInfo {
  
  @scala.inline
  def apply(totalGb: Double, usedGb: Double, usedPercentage: Double): DriveUsedInfo = {
    val __obj = js.Dynamic.literal(totalGb = totalGb.asInstanceOf[js.Any], usedGb = usedGb.asInstanceOf[js.Any], usedPercentage = usedPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveUsedInfo]
  }
  
  @scala.inline
  implicit class DriveUsedInfoOps[Self <: DriveUsedInfo] (val x: Self) extends AnyVal {
    
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
    def setTotalGb(value: Double): Self = this.set("totalGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedGb(value: Double): Self = this.set("usedGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsedPercentage(value: Double): Self = this.set("usedPercentage", value.asInstanceOf[js.Any])
  }
}
