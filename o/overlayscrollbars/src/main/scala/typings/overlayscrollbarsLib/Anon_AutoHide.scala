package typings
package overlayscrollbarsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoHide extends js.Object {
  var autoHide: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.AutoHideBehavior] = js.undefined
  var autoHideDelay: js.UndefOr[scala.Double] = js.undefined
  var clickScrolling: js.UndefOr[scala.Boolean] = js.undefined
  var dragScrolling: js.UndefOr[scala.Boolean] = js.undefined
  var touchSupport: js.UndefOr[scala.Boolean] = js.undefined
  var visibility: js.UndefOr[overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.VisibilityBehavior] = js.undefined
}

object Anon_AutoHide {
  @scala.inline
  def apply(
    autoHide: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.AutoHideBehavior = null,
    autoHideDelay: scala.Int | scala.Double = null,
    clickScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    dragScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    touchSupport: js.UndefOr[scala.Boolean] = js.undefined,
    visibility: overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs.VisibilityBehavior = null
  ): Anon_AutoHide = {
    val __obj = js.Dynamic.literal()
    if (autoHide != null) __obj.updateDynamic("autoHide")(autoHide)
    if (autoHideDelay != null) __obj.updateDynamic("autoHideDelay")(autoHideDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(clickScrolling)) __obj.updateDynamic("clickScrolling")(clickScrolling)
    if (!js.isUndefined(dragScrolling)) __obj.updateDynamic("dragScrolling")(dragScrolling)
    if (!js.isUndefined(touchSupport)) __obj.updateDynamic("touchSupport")(touchSupport)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[Anon_AutoHide]
  }
}

