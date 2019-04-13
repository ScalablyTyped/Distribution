package typings
package osrmLib.osrmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineString extends js.Object {
  var coordinates: js.Array[Coordinate]
  var `type`: osrmLib.osrmLibStrings.LineString
}

object LineString {
  @scala.inline
  def apply(coordinates: js.Array[Coordinate], `type`: osrmLib.osrmLibStrings.LineString): LineString = {
    val __obj = js.Dynamic.literal(coordinates = coordinates)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[LineString]
  }
}

