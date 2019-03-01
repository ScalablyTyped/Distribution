package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_L
  extends overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs._Coordinates {
  var l: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Position] = js.undefined
  var t: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Position] = js.undefined
}

object Anon_L {
  @scala.inline
  def apply(
    l: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Position = null,
    t: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Position = null
  ): Anon_L = {
    val __obj = js.Dynamic.literal()
    if (l != null) __obj.updateDynamic("l")(l.asInstanceOf[js.Any])
    if (t != null) __obj.updateDynamic("t")(t.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_L]
  }
}

