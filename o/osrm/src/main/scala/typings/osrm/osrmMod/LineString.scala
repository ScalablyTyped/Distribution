package typings.osrm.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineString extends js.Object {
  var coordinates: js.Array[Coordinate]
  var `type`: typings.osrm.osrmStrings.LineString
}

object LineString {
  @scala.inline
  def apply(coordinates: js.Array[Coordinate], `type`: typings.osrm.osrmStrings.LineString): LineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LineString]
  }
}

