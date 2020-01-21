package typings.overlayscrollbars

import typings.overlayscrollbars.mod.Position
import typings.overlayscrollbars.mod._Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonL extends _Coordinates {
  var l: js.UndefOr[Position] = js.undefined
  var t: js.UndefOr[Position] = js.undefined
}

object AnonL {
  @scala.inline
  def apply(l: Position = null, t: Position = null): AnonL = {
    val __obj = js.Dynamic.literal()
    if (l != null) __obj.updateDynamic("l")(l.asInstanceOf[js.Any])
    if (t != null) __obj.updateDynamic("t")(t.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonL]
  }
}

