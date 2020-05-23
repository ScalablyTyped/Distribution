package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.Position
import typings.overlayscrollbars.mod._Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait L extends _Coordinates {
  var l: js.UndefOr[Position] = js.undefined
  var t: js.UndefOr[Position] = js.undefined
}

object L {
  @scala.inline
  def apply(l: Position = null, t: Position = null): L = {
    val __obj = js.Dynamic.literal()
    if (l != null) __obj.updateDynamic("l")(l.asInstanceOf[js.Any])
    if (t != null) __obj.updateDynamic("t")(t.asInstanceOf[js.Any])
    __obj.asInstanceOf[L]
  }
}

