package typings.playcanvas

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorDepthFlags extends js.Object {
  var color: js.Array[Double]
  var depth: Double
  var flags: js.Any
}

object Anon_ColorDepthFlags {
  @scala.inline
  def apply(color: js.Array[Double], depth: Double, flags: js.Any): Anon_ColorDepthFlags = {
    val __obj = js.Dynamic.literal(color = color, depth = depth, flags = flags)
  
    __obj.asInstanceOf[Anon_ColorDepthFlags]
  }
}

