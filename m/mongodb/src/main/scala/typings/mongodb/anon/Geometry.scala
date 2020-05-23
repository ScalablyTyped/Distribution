package typings.mongodb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Geometry extends js.Object {
  @JSName("$geometry")
  var $geometry: js.Object
}

object Geometry {
  @scala.inline
  def apply($geometry: js.Object): Geometry = {
    val __obj = js.Dynamic.literal($geometry = $geometry.asInstanceOf[js.Any])
    __obj.asInstanceOf[Geometry]
  }
}

