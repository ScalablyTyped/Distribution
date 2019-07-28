package typings.overlayscrollbars

import typings.overlayscrollbars.overlayscrollbarsMod.Position
import typings.overlayscrollbars.overlayscrollbarsMod._Coordinates
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_L extends _Coordinates {
  var l: js.UndefOr[Position] = js.undefined
  var t: js.UndefOr[Position] = js.undefined
}

object Anon_L {
  @scala.inline
  def apply(l: Position = null, t: Position = null): Anon_L = {
    val __obj = js.Dynamic.literal()
    if (l != null) __obj.updateDynamic("l")(l.asInstanceOf[js.Any])
    if (t != null) __obj.updateDynamic("t")(t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_L]
  }
}

