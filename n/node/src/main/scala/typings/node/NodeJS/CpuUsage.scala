package typings.node.NodeJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CpuUsage extends js.Object {
  var system: Double
  var user: Double
}

object CpuUsage {
  @scala.inline
  def apply(system: Double, user: Double): CpuUsage = {
    val __obj = js.Dynamic.literal(system = system.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CpuUsage]
  }
}

