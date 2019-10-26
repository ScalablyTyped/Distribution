package typings.nodeDashOsDashUtils.libDriveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.nodeDashOsDashUtils.libDriveMod.DriveUsedInfo because var conflicts: totalGb. Inlined usedGb, usedPercentage */ trait DriveInfo extends DriveFreeInfo {
  var usedGb: Double
  var usedPercentage: Double
}

object DriveInfo {
  @scala.inline
  def apply(freeGb: Double, freePercentage: Double, totalGb: Double, usedGb: Double, usedPercentage: Double): DriveInfo = {
    val __obj = js.Dynamic.literal(freeGb = freeGb, freePercentage = freePercentage, totalGb = totalGb, usedGb = usedGb, usedPercentage = usedPercentage)
  
    __obj.asInstanceOf[DriveInfo]
  }
}

