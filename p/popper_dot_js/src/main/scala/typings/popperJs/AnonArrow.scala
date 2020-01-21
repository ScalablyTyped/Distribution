package typings.popperJs

import typings.popperJs.mod.Popper.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArrow extends js.Object {
  var arrow: AnonLeft
  var popper: Offset
  var reference: Offset
}

object AnonArrow {
  @scala.inline
  def apply(arrow: AnonLeft, popper: Offset, reference: Offset): AnonArrow = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonArrow]
  }
}

