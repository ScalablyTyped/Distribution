package typings.popmotion

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Damping extends js.Object {
  var damping: Double
  var stiffness: Double
}

object Anon_Damping {
  @scala.inline
  def apply(damping: Double, stiffness: Double): Anon_Damping = {
    val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Damping]
  }
}

