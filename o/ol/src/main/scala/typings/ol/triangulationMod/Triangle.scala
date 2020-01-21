package typings.ol.triangulationMod

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
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Triangle]
  }
}

