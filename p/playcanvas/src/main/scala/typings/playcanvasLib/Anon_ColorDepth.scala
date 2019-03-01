package typings
package playcanvasLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorDepth extends js.Object {
  var color: js.Array[scala.Double]
  var depth: scala.Double
  var flags: scala.Double
}

object Anon_ColorDepth {
  @scala.inline
  def apply(color: js.Array[scala.Double], depth: scala.Double, flags: scala.Double): Anon_ColorDepth = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("depth")(depth)
    __obj.updateDynamic("flags")(flags)
    __obj.asInstanceOf[Anon_ColorDepth]
  }
}

