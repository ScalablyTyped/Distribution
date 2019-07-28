package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorDepth extends js.Object {
  var color: js.Array[Double]
  var depth: Double
  var flags: Double
}

object Anon_ColorDepth {
  @scala.inline
  def apply(color: js.Array[Double], depth: Double, flags: Double): Anon_ColorDepth = {
    val __obj = js.Dynamic.literal(color = color, depth = depth, flags = flags)
  
    __obj.asInstanceOf[Anon_ColorDepth]
  }
}

