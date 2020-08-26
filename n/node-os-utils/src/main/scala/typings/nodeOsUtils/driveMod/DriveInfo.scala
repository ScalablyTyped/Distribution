package typings.nodeOsUtils.driveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.nodeOsUtils.driveMod.DriveUsedInfo because var conflicts: totalGb. Inlined usedGb, usedPercentage */ @js.native
trait DriveInfo extends DriveFreeInfo {
  var usedGb: Double = js.native
  var usedPercentage: Double = js.native
}

object DriveInfo {
  @scala.inline
  def apply(freeGb: Double, freePercentage: Double, totalGb: Double, usedGb: Double, usedPercentage: Double): DriveInfo = {
    val __obj = js.Dynamic.literal(freeGb = freeGb.asInstanceOf[js.Any], freePercentage = freePercentage.asInstanceOf[js.Any], totalGb = totalGb.asInstanceOf[js.Any], usedGb = usedGb.asInstanceOf[js.Any], usedPercentage = usedPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[DriveInfo]
  }
  @scala.inline
  implicit class DriveInfoOps[Self <: DriveInfo] (val x: Self) extends AnyVal {
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
    def setUsedGb(value: Double): Self = this.set("usedGb", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsedPercentage(value: Double): Self = this.set("usedPercentage", value.asInstanceOf[js.Any])
  }
  
}

