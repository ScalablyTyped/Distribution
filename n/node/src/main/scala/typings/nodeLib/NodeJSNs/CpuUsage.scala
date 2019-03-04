package typings
package nodeLib.NodeJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuUsage extends js.Object {
  var system: scala.Double
  var user: scala.Double
}

object CpuUsage {
  @scala.inline
  def apply(system: scala.Double, user: scala.Double): CpuUsage = {
    val __obj = js.Dynamic.literal(system = system, user = user)
  
    __obj.asInstanceOf[CpuUsage]
  }
}

