package typings.node

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIdle extends js.Object {
  var idle: Double
  var irq: Double
  var nice: Double
  var sys: Double
  var user: Double
}

object AnonIdle {
  @scala.inline
  def apply(idle: Double, irq: Double, nice: Double, sys: Double, user: Double): AnonIdle = {
    val __obj = js.Dynamic.literal(idle = idle.asInstanceOf[js.Any], irq = irq.asInstanceOf[js.Any], nice = nice.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonIdle]
  }
}

