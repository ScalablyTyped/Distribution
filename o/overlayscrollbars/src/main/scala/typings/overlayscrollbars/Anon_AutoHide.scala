package typings.overlayscrollbars

import typings.overlayscrollbars.overlayscrollbarsMod.AutoHideBehavior
import typings.overlayscrollbars.overlayscrollbarsMod.VisibilityBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoHide extends js.Object {
  var autoHide: js.UndefOr[AutoHideBehavior] = js.undefined
  var autoHideDelay: js.UndefOr[Double] = js.undefined
  var clickScrolling: js.UndefOr[Boolean] = js.undefined
  var dragScrolling: js.UndefOr[Boolean] = js.undefined
  var snapHandle: js.UndefOr[Boolean] = js.undefined
  var touchSupport: js.UndefOr[Boolean] = js.undefined
  var visibility: js.UndefOr[VisibilityBehavior] = js.undefined
}

object Anon_AutoHide {
  @scala.inline
  def apply(
    autoHide: AutoHideBehavior = null,
    autoHideDelay: Int | Double = null,
    clickScrolling: js.UndefOr[Boolean] = js.undefined,
    dragScrolling: js.UndefOr[Boolean] = js.undefined,
    snapHandle: js.UndefOr[Boolean] = js.undefined,
    touchSupport: js.UndefOr[Boolean] = js.undefined,
    visibility: VisibilityBehavior = null
  ): Anon_AutoHide = {
    val __obj = js.Dynamic.literal()
    if (autoHide != null) __obj.updateDynamic("autoHide")(autoHide)
    if (autoHideDelay != null) __obj.updateDynamic("autoHideDelay")(autoHideDelay.asInstanceOf[js.Any])
    if (!js.isUndefined(clickScrolling)) __obj.updateDynamic("clickScrolling")(clickScrolling)
    if (!js.isUndefined(dragScrolling)) __obj.updateDynamic("dragScrolling")(dragScrolling)
    if (!js.isUndefined(snapHandle)) __obj.updateDynamic("snapHandle")(snapHandle)
    if (!js.isUndefined(touchSupport)) __obj.updateDynamic("touchSupport")(touchSupport)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[Anon_AutoHide]
  }
}

