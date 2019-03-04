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
    val __obj = js.Dynamic.literal(model = model, speed = speed, times = times)
  
    __obj.asInstanceOf[CpuInfo]
  }
}

