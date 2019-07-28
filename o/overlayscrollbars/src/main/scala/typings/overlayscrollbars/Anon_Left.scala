package typings.overlayscrollbars

import typings.overlayscrollbars.overlayscrollbarsMod.Position
import typings.overlayscrollbars.overlayscrollbarsMod._Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Left extends _Coordinates {
  var left: js.UndefOr[Position] = js.undefined
  var top: js.UndefOr[Position] = js.undefined
}

object Anon_Left {
  @scala.inline
  def apply(left: Position = null, top: Position = null): Anon_Left = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Left]
  }
}

