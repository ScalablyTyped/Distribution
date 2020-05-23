package typings.polygon.anon

import typings.vec2.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var position: ^
  var radius: Double
}

object Position {
  @scala.inline
  def apply(position: ^, radius: Double): Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

