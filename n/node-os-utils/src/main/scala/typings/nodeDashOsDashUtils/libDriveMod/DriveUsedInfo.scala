package typings.nodeDashOsDashUtils.libDriveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveUsedInfo extends js.Object {
  var totalGb: Double
  var usedGb: Double
  var usedPercentage: Double
}

object DriveUsedInfo {
  @scala.inline
  def apply(totalGb: Double, usedGb: Double, usedPercentage: Double): DriveUsedInfo = {
    val __obj = js.Dynamic.literal(totalGb = totalGb.asInstanceOf[js.Any], usedGb = usedGb.asInstanceOf[js.Any], usedPercentage = usedPercentage.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DriveUsedInfo]
  }
}

