package typings.navermaps.naver.maps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerShape extends js.Object {
  var coords: js.Array[_]
  var `type`: String
}

object MarkerShape {
  @scala.inline
  def apply(coords: js.Array[_], `type`: String): MarkerShape = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerShape]
  }
}

