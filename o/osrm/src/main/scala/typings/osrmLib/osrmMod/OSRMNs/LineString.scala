package typings
package osrmLib.osrmMod.OSRMNs

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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("coordinates")(coordinates)
    __obj.asInstanceOf[LineString]
  }
}

