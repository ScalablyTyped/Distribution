package typings
package overlayscrollbarsLib.overlayscrollbarsMod.OverlayScrollbarsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoUpdate: js.UndefOr[scala.Boolean | scala.Null] = js.undefined
  var autoUpdateInterval: js.UndefOr[scala.Double] = js.undefined
  var callbacks: js.UndefOr[overlayscrollbarsLib.Anon_OnContentSizeChanged] = js.undefined
  var className: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var clipAlways: js.UndefOr[scala.Boolean] = js.undefined
  var nativeScrollbarsOverlaid: js.UndefOr[overlayscrollbarsLib.Anon_Initialize] = js.undefined
  var normalizeRTL: js.UndefOr[scala.Boolean] = js.undefined
  var overflowBehavior: js.UndefOr[overlayscrollbarsLib.Anon_XYOverflowBehavior] = js.undefined
  var paddingAbsolute: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[ResizeBehavior] = js.undefined
  var scrollbars: js.UndefOr[overlayscrollbarsLib.Anon_AutoHide] = js.undefined
  var sizeAutoCapable: js.UndefOr[scala.Boolean] = js.undefined
  var textarea: js.UndefOr[overlayscrollbarsLib.Anon_DynHeight] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoUpdate: js.UndefOr[scala.Boolean] = js.undefined,
    autoUpdateInterval: scala.Int | scala.Double = null,
    callbacks: overlayscrollbarsLib.Anon_OnContentSizeChanged = null,
    className: java.lang.String = null,
    clipAlways: js.UndefOr[scala.Boolean] = js.undefined,
    nativeScrollbarsOverlaid: overlayscrollbarsLib.Anon_Initialize = null,
    normalizeRTL: js.UndefOr[scala.Boolean] = js.undefined,
    overflowBehavior: overlayscrollbarsLib.Anon_XYOverflowBehavior = null,
    paddingAbsolute: js.UndefOr[scala.Boolean] = js.undefined,
    resize: ResizeBehavior = null,
    scrollbars: overlayscrollbarsLib.Anon_AutoHide = null,
    sizeAutoCapable: js.UndefOr[scala.Boolean] = js.undefined,
    textarea: overlayscrollbarsLib.Anon_DynHeight = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpdate)) __obj.updateDynamic("autoUpdate")(autoUpdate)
    if (autoUpdateInterval != null) __obj.updateDynamic("autoUpdateInterval")(autoUpdateInterval.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(clipAlways)) __obj.updateDynamic("clipAlways")(clipAlways)
    if (nativeScrollbarsOverlaid != null) __obj.updateDynamic("nativeScrollbarsOverlaid")(nativeScrollbarsOverlaid)
    if (!js.isUndefined(normalizeRTL)) __obj.updateDynamic("normalizeRTL")(normalizeRTL)
    if (overflowBehavior != null) __obj.updateDynamic("overflowBehavior")(overflowBehavior)
    if (!js.isUndefined(paddingAbsolute)) __obj.updateDynamic("paddingAbsolute")(paddingAbsolute)
    if (resize != null) __obj.updateDynamic("resize")(resize)
    if (scrollbars != null) __obj.updateDynamic("scrollbars")(scrollbars)
    if (!js.isUndefined(sizeAutoCapable)) __obj.updateDynamic("sizeAutoCapable")(sizeAutoCapable)
    if (textarea != null) __obj.updateDynamic("textarea")(textarea)
    __obj.asInstanceOf[Options]
  }
}

