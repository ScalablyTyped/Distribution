package typings.overlayscrollbars.mod

import typings.overlayscrollbars.anon.AutoHide
import typings.overlayscrollbars.anon.DynHeight
import typings.overlayscrollbars.anon.Initialize
import typings.overlayscrollbars.anon.OnContentSizeChanged
import typings.overlayscrollbars.anon.XOverflowBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoUpdate: js.UndefOr[Boolean | Null] = js.undefined
  var autoUpdateInterval: js.UndefOr[Double] = js.undefined
  var callbacks: js.UndefOr[OnContentSizeChanged] = js.undefined
  var className: js.UndefOr[String | Null] = js.undefined
  var clipAlways: js.UndefOr[Boolean] = js.undefined
  var nativeScrollbarsOverlaid: js.UndefOr[Initialize] = js.undefined
  var normalizeRTL: js.UndefOr[Boolean] = js.undefined
  var overflowBehavior: js.UndefOr[XOverflowBehavior] = js.undefined
  var paddingAbsolute: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[ResizeBehavior] = js.undefined
  var scrollbars: js.UndefOr[AutoHide] = js.undefined
  var sizeAutoCapable: js.UndefOr[Boolean] = js.undefined
  var textarea: js.UndefOr[DynHeight] = js.undefined
  var updateOnLoad: js.UndefOr[String | js.Array[String] | Null] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoUpdate: js.UndefOr[Null | Boolean] = js.undefined,
    autoUpdateInterval: js.UndefOr[Double] = js.undefined,
    callbacks: OnContentSizeChanged = null,
    className: js.UndefOr[Null | String] = js.undefined,
    clipAlways: js.UndefOr[Boolean] = js.undefined,
    nativeScrollbarsOverlaid: Initialize = null,
    normalizeRTL: js.UndefOr[Boolean] = js.undefined,
    overflowBehavior: XOverflowBehavior = null,
    paddingAbsolute: js.UndefOr[Boolean] = js.undefined,
    resize: ResizeBehavior = null,
    scrollbars: AutoHide = null,
    sizeAutoCapable: js.UndefOr[Boolean] = js.undefined,
    textarea: DynHeight = null,
    updateOnLoad: js.UndefOr[Null | String | js.Array[String]] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpdate)) __obj.updateDynamic("autoUpdate")(autoUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpdateInterval)) __obj.updateDynamic("autoUpdateInterval")(autoUpdateInterval.get.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (!js.isUndefined(className)) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clipAlways)) __obj.updateDynamic("clipAlways")(clipAlways.get.asInstanceOf[js.Any])
    if (nativeScrollbarsOverlaid != null) __obj.updateDynamic("nativeScrollbarsOverlaid")(nativeScrollbarsOverlaid.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeRTL)) __obj.updateDynamic("normalizeRTL")(normalizeRTL.get.asInstanceOf[js.Any])
    if (overflowBehavior != null) __obj.updateDynamic("overflowBehavior")(overflowBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingAbsolute)) __obj.updateDynamic("paddingAbsolute")(paddingAbsolute.get.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (scrollbars != null) __obj.updateDynamic("scrollbars")(scrollbars.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeAutoCapable)) __obj.updateDynamic("sizeAutoCapable")(sizeAutoCapable.get.asInstanceOf[js.Any])
    if (textarea != null) __obj.updateDynamic("textarea")(textarea.asInstanceOf[js.Any])
    if (!js.isUndefined(updateOnLoad)) __obj.updateDynamic("updateOnLoad")(updateOnLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

