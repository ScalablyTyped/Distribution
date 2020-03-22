package typings.openfin

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends js.Object {
  /**
    * the left virtual screen coordinate of the mouse
    */
  var left: Double
  /**
    * the top virtual screen coordinate of the mouse
    */
  var top: Double
}

object AnonLeft {
  @scala.inline
  def apply(left: Double, top: Double): AnonLeft = {
    val __obj = js.Dynamic.literal(left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLeft]
  }
}

