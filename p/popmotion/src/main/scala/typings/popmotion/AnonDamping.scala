package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDamping extends js.Object {
  var damping: Double
  var stiffness: Double
}

object AnonDamping {
  @scala.inline
  def apply(damping: Double, stiffness: Double): AnonDamping = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDamping]
  }
}

