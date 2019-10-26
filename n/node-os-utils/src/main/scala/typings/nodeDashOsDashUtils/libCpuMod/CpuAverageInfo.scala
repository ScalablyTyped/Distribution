package typings.nodeDashOsDashUtils.libCpuMod

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
    val __obj = js.Dynamic.literal(avgIdle = avgIdle, avgTotal = avgTotal, totalIdle = totalIdle, totalTick = totalTick)
  
    __obj.asInstanceOf[CpuAverageInfo]
  }
}

