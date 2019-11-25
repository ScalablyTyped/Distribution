package typings.nodeDashOsDashUtils.libDriveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DriveFreeInfo extends js.Object {
  var freeGb: Double
  var freePercentage: Double
  var totalGb: Double
}

object DriveFreeInfo {
  @scala.inline
  def apply(freeGb: Double, freePercentage: Double, totalGb: Double): DriveFreeInfo = {
    val __obj = js.Dynamic.literal(freeGb = freeGb.asInstanceOf[js.Any], freePercentage = freePercentage.asInstanceOf[js.Any], totalGb = totalGb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DriveFreeInfo]
  }
}

