package typings.polygon

import typings.vec2.vec2Mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Position extends js.Object {
  var position: ^
  var radius: Double
}

object Anon_Position {
  @scala.inline
  def apply(position: ^, radius: Double): Anon_Position = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Position]
  }
}

