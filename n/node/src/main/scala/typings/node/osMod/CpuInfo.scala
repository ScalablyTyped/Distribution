package typings.node.osMod

import typings.node.AnonIdle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuInfo extends js.Object {
  var model: String
  var speed: Double
  var times: AnonIdle
}

object CpuInfo {
  @scala.inline
  def apply(model: String, speed: Double, times: AnonIdle): CpuInfo = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CpuInfo]
  }
}

