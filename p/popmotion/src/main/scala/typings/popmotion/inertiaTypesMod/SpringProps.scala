package typings.popmotion.inertiaTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpringProps extends js.Object {
  var from: Double
  var to: Double
  var velocity: Double
}

object SpringProps {
  @scala.inline
  def apply(from: Double, to: Double, velocity: Double): SpringProps = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpringProps]
  }
}

