package typings.mongoose

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCoordinates extends js.Object {
  var coordinates: js.Array[_]
  var `type`: String
}

object AnonCoordinates {
  @scala.inline
  def apply(coordinates: js.Array[_], `type`: String): AnonCoordinates = {
    val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCoordinates]
  }
}

