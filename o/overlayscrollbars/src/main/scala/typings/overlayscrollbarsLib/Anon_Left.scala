package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Left
  extends overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs._Coordinates {
  var left: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Position] = js.undefined
  var top: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Position] = js.undefined
}

object Anon_Left {
  @scala.inline
  def apply(
    left: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Position = null,
    top: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Position = null
  ): Anon_Left = {
    val __obj = js.Dynamic.literal()
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Left]
  }
}

