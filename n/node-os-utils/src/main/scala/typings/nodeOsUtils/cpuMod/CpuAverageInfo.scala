package typings.nodeOsUtils.cpuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuAverageInfo extends js.Object {
  var avgIdle: Double
  var avgTotal: Double
  var totalIdle: Double
  var totalTick: Double
}

object CpuAverageInfo {
  @scala.inline
  def apply(avgIdle: Double, avgTotal: Double, totalIdle: Double, totalTick: Double): CpuAverageInfo = {
    val __obj = js.Dynamic.literal(avgIdle = avgIdle.asInstanceOf[js.Any], avgTotal = avgTotal.asInstanceOf[js.Any], totalIdle = totalIdle.asInstanceOf[js.Any], totalTick = totalTick.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuAverageInfo]
  }
}

