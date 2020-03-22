package typings.openfin.hostSpecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuInfo extends js.Object {
  var model: String
  var speed: Double
  var times: Time
}

object CpuInfo {
  @scala.inline
  def apply(model: String, speed: Double, times: Time): CpuInfo = {
    val __obj = js.Dynamic.literal(model = model.asInstanceOf[js.Any], speed = speed.asInstanceOf[js.Any], times = times.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CpuInfo]
  }
}

