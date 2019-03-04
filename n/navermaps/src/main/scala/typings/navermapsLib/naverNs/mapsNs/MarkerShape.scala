package typings
package navermapsLib.naverNs.mapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerShape extends js.Object {
  var coords: js.Array[_]
  var `type`: java.lang.String
}

object MarkerShape {
  @scala.inline
  def apply(coords: js.Array[_], `type`: java.lang.String): MarkerShape = {
    val __obj = js.Dynamic.literal(coords = coords)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[MarkerShape]
  }
}

