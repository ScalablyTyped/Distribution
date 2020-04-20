package typings.mongodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGeometry extends js.Object {
  @JSName("$geometry")
  var $geometry: js.Object
}

object AnonGeometry {
  @scala.inline
  def apply($geometry: js.Object): AnonGeometry = {
    val __obj = js.Dynamic.literal($geometry = $geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonGeometry]
  }
}

