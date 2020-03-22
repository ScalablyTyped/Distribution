package typings.openfin.shapesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transition extends js.Object {
  var opacity: js.UndefOr[Opacity] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
  var size: js.UndefOr[Size] = js.undefined
}

object Transition {
  @scala.inline
  def apply(opacity: Opacity = null, position: Position = null, size: Size = null): Transition = {
    val __obj = js.Dynamic.literal()
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transition]
  }
}

