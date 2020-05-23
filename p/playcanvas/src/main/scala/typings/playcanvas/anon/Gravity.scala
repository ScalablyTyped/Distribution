package typings.playcanvas.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Gravity extends js.Object {
  var gravity: js.Array[Double]
}

object Gravity {
  @scala.inline
  def apply(gravity: js.Array[Double]): Gravity = {
    val __obj = js.Dynamic.literal(gravity = gravity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Gravity]
  }
}

