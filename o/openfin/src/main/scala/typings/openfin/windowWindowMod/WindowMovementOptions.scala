package typings.openfin.windowWindowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowMovementOptions extends js.Object {
  var moveIndependently: Boolean
}

object WindowMovementOptions {
  @scala.inline
  def apply(moveIndependently: Boolean): WindowMovementOptions = {
    val __obj = js.Dynamic.literal(moveIndependently = moveIndependently.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowMovementOptions]
  }
}

