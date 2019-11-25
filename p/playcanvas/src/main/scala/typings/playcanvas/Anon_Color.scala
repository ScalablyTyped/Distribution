package typings.playcanvas

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Color extends js.Object {
  var color: js.Array[Number]
  var depth: Double
  var flags: Double
}

object Anon_Color {
  @scala.inline
  def apply(color: js.Array[Number], depth: Double, flags: Double): Anon_Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Color]
  }
}

