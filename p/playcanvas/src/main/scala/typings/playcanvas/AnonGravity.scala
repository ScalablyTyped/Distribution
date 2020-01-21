package typings.playcanvas

import typings.std.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGravity extends js.Object {
  var gravity: js.Array[Number]
}

object AnonGravity {
  @scala.inline
  def apply(gravity: js.Array[Number]): AnonGravity = {
    val __obj = js.Dynamic.literal(gravity = gravity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGravity]
  }
}

