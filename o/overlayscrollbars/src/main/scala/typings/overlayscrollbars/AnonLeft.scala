package typings.overlayscrollbars

import typings.overlayscrollbars.mod.Position
import typings.overlayscrollbars.mod._Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeft extends _Coordinates {
  var left: js.UndefOr[Position] = js.undefined
  var top: js.UndefOr[Position] = js.undefined
}

object AnonLeft {
  @scala.inline
  def apply(left: Position = null, top: Position = null): AnonLeft = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLeft]
  }
}

