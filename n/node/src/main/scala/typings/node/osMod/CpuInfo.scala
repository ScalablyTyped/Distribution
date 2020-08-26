package typings.node.osMod

import typings.node.anon.Idle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CpuInfo extends js.Object {
  var model: String = js.native
  var speed: Double = js.native
  var times: Idle = js.native
}

object CpuInfo {
  @scala.inline
  def apply(model: String, speed: Double, times: Idle): CpuInfo = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
    __obj.asInstanceOf[CpuInfo]
  }
  @scala.inline
  implicit class CpuInfoOps[Self <: CpuInfo] (val x: Self) extends AnyVal {
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
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpeed(value: Double): Self = this.set("speed", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimes(value: Idle): Self = this.set("times", value.asInstanceOf[js.Any])
  }
  
}

