package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bottom extends js.Object {
  var bottom: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin] = js.undefined
  var left: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin] = js.undefined
  var right: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin] = js.undefined
  var top: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin] = js.undefined
}

object Anon_Bottom {
  @scala.inline
  def apply(
    bottom: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin = null,
    left: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin = null,
    right: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin = null,
    top: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.Margin = null
  ): Anon_Bottom = {
    val __obj = js.Dynamic.literal()
    if (bottom != null) __obj.updateDynamic("bottom")(bottom.asInstanceOf[js.Any])
    if (left != null) __obj.updateDynamic("left")(left.asInstanceOf[js.Any])
    if (right != null) __obj.updateDynamic("right")(right.asInstanceOf[js.Any])
    if (top != null) __obj.updateDynamic("top")(top.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Bottom]
  }
}

