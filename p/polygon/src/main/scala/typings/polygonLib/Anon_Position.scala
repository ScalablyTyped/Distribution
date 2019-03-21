package typings
package polygonLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Position extends js.Object {
  var position: vec2Lib.vec2Mod.namespaced
  var radius: scala.Double
}

object Anon_Position {
  @scala.inline
  def apply(position: vec2Lib.vec2Mod.namespaced, radius: scala.Double): Anon_Position = {
    val __obj = js.Dynamic.literal(position = position, radius = radius)
  
    __obj.asInstanceOf[Anon_Position]
  }
}

