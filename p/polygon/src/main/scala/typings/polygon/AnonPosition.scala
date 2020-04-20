package typings.polygon

import typings.vec2.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPosition extends js.Object {
  var position: ^
  var radius: Double
}

object AnonPosition {
  @scala.inline
  def apply(position: ^, radius: Double): AnonPosition = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPosition]
  }
}

