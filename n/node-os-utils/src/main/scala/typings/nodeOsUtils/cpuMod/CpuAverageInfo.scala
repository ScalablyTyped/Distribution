package typings.nodeOsUtils.cpuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpuAverageInfo extends js.Object {
  var avgIdle: Double = js.native
  var avgTotal: Double = js.native
  var totalIdle: Double = js.native
  var totalTick: Double = js.native
}

object CpuAverageInfo {
  @scala.inline
  def apply(avgIdle: Double, avgTotal: Double, totalIdle: Double, totalTick: Double): CpuAverageInfo = {
    val __obj = js.Dynamic.literal(avgIdle = avgIdle.asInstanceOf[js.Any], avgTotal = avgTotal.asInstanceOf[js.Any], totalIdle = totalIdle.asInstanceOf[js.Any], totalTick = totalTick.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuAverageInfo]
  }
  @scala.inline
  implicit class CpuAverageInfoOps[Self <: CpuAverageInfo] (val x: Self) extends AnyVal {
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
    def setAvgIdle(value: Double): Self = this.set("avgIdle", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvgTotal(value: Double): Self = this.set("avgTotal", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalIdle(value: Double): Self = this.set("totalIdle", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalTick(value: Double): Self = this.set("totalTick", value.asInstanceOf[js.Any])
  }
  
}

