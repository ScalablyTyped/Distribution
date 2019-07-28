package typings.ol.reprojTriangulationMod

import typings.ol.coordinateMod.Coordinate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Triangle extends js.Object {
  var source: js.Array[Coordinate]
  var target: js.Array[Coordinate]
}

object Triangle {
  @scala.inline
  def apply(source: js.Array[Coordinate], target: js.Array[Coordinate]): Triangle = {
    val __obj = js.Dynamic.literal(source = source, target = target)
  
    __obj.asInstanceOf[Triangle]
  }
}

