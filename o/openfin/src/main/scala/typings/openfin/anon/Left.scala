package typings.openfin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Left extends js.Object {
  /**
    * the left virtual screen coordinate of the mouse
    */
  var left: Double
  /**
    * the top virtual screen coordinate of the mouse
    */
  var top: Double
}

object Left {
  @scala.inline
  def apply(left: Double, top: Double): Left = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

