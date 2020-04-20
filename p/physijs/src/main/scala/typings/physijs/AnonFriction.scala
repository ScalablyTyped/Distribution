package typings.physijs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFriction extends js.Object {
  var friction: Double
  var id: Double
  var restriction: Double
}

object AnonFriction {
  @scala.inline
  def apply(friction: Double, id: Double, restriction: Double): AnonFriction = {
    val __obj = js.Dynamic.literal(friction = friction.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], restriction = restriction.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFriction]
  }
}

