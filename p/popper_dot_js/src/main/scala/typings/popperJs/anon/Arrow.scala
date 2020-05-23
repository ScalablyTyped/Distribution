package typings.popperJs.anon

import typings.popperJs.mod.Popper.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arrow extends js.Object {
  var arrow: Left
  var popper: Offset
  var reference: Offset
}

object Arrow {
  @scala.inline
  def apply(arrow: Left, popper: Offset, reference: Offset): Arrow = {
    val __obj = js.Dynamic.literal(arrow = arrow.asInstanceOf[js.Any], popper = popper.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrow]
  }
}

