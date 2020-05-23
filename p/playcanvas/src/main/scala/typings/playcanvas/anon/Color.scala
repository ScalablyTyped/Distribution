package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Color extends js.Object {
  var color: js.Array[Double]
  var depth: Double
  var flags: Double
}

object Color {
  @scala.inline
  def apply(color: js.Array[Double], depth: Double, flags: Double): Color = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Color]
  }
}

