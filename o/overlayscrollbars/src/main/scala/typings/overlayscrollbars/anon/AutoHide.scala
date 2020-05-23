package typings.overlayscrollbars.anon

import typings.overlayscrollbars.mod.AutoHideBehavior
import typings.overlayscrollbars.mod.VisibilityBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoHide extends js.Object {
  var autoHide: js.UndefOr[AutoHideBehavior] = js.undefined
  var autoHideDelay: js.UndefOr[Double] = js.undefined
  var clickScrolling: js.UndefOr[Boolean] = js.undefined
  var dragScrolling: js.UndefOr[Boolean] = js.undefined
  var snapHandle: js.UndefOr[Boolean] = js.undefined
  var touchSupport: js.UndefOr[Boolean] = js.undefined
  var visibility: js.UndefOr[VisibilityBehavior] = js.undefined
}

object AutoHide {
  @scala.inline
  def apply(
    autoHide: AutoHideBehavior = null,
    autoHideDelay: js.UndefOr[Double] = js.undefined,
    clickScrolling: js.UndefOr[Boolean] = js.undefined,
    dragScrolling: js.UndefOr[Boolean] = js.undefined,
    snapHandle: js.UndefOr[Boolean] = js.undefined,
    touchSupport: js.UndefOr[Boolean] = js.undefined,
    visibility: VisibilityBehavior = null
  ): AutoHide = {
    val __obj = js.Dynamic.literal()
    if (autoHide != null) __obj.updateDynamic("autoHide")(autoHide.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHideDelay)) __obj.updateDynamic("autoHideDelay")(autoHideDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(clickScrolling)) __obj.updateDynamic("clickScrolling")(clickScrolling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(dragScrolling)) __obj.updateDynamic("dragScrolling")(dragScrolling.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapHandle)) __obj.updateDynamic("snapHandle")(snapHandle.get.asInstanceOf[js.Any])
    if (!js.isUndefined(touchSupport)) __obj.updateDynamic("touchSupport")(touchSupport.get.asInstanceOf[js.Any])
    if (visibility != null) __obj.updateDynamic("visibility")(visibility.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoHide]
  }
}

