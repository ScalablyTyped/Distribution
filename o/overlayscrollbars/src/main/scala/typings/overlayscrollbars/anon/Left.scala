package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.Position
import typings.overlayscrollbars.mod._Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Left extends _Coordinates {
  var left: js.UndefOr[Position] = js.undefined
  var top: js.UndefOr[Position] = js.undefined
}

object Left {
  @scala.inline
  def apply(left: Position = null, top: Position = null): Left = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Left]
  }
}

