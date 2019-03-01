package typings
package nodeLib.osMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuInfo extends js.Object {
  var model: java.lang.String
  var speed: scala.Double
  var times: nodeLib.Anon_Idle
}

object CpuInfo {
  @scala.inline
  def apply(model: java.lang.String, speed: scala.Double, times: nodeLib.Anon_Idle): CpuInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("model")(model)
    __obj.updateDynamic("speed")(speed)
    __obj.updateDynamic("times")(times)
    __obj.asInstanceOf[CpuInfo]
  }
}

