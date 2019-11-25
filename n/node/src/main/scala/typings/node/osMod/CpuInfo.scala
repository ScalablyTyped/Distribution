package typings.node.osMod

import typings.node.Anon_Idle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuInfo extends js.Object {
  var model: java.lang.String
  var speed: Double
  var times: Anon_Idle
}

object CpuInfo {
  @scala.inline
  def apply(model: java.lang.String, speed: Double, times: Anon_Idle): CpuInfo = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CpuInfo]
  }
}

