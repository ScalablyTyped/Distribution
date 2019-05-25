package typings
package olLib.reprojTriangulationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Triangle extends js.Object {
  var source: js.Array[olLib.coordinateMod.Coordinate]
  var target: js.Array[olLib.coordinateMod.Coordinate]
}

object Triangle {
  @scala.inline
  def apply(source: js.Array[olLib.coordinateMod.Coordinate], target: js.Array[olLib.coordinateMod.Coordinate]): Triangle = {
    val __obj = js.Dynamic.literal(source = source, target = target)
  
    __obj.asInstanceOf[Triangle]
  }
}

