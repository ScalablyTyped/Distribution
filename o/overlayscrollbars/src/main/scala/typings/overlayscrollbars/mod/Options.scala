package typings.overlayscrollbars.mod

import typings.overlayscrollbars.AnonAutoHide
import typings.overlayscrollbars.AnonDynHeight
import typings.overlayscrollbars.AnonInitialize
import typings.overlayscrollbars.AnonOnContentSizeChanged
import typings.overlayscrollbars.AnonXOverflowBehavior
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var autoUpdate: js.UndefOr[Boolean | Null] = js.undefined
  var autoUpdateInterval: js.UndefOr[Double] = js.undefined
  var callbacks: js.UndefOr[AnonOnContentSizeChanged] = js.undefined
  var className: js.UndefOr[String | Null] = js.undefined
  var clipAlways: js.UndefOr[Boolean] = js.undefined
  var nativeScrollbarsOverlaid: js.UndefOr[AnonInitialize] = js.undefined
  var normalizeRTL: js.UndefOr[Boolean] = js.undefined
  var overflowBehavior: js.UndefOr[AnonXOverflowBehavior] = js.undefined
  var paddingAbsolute: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[ResizeBehavior] = js.undefined
  var scrollbars: js.UndefOr[AnonAutoHide] = js.undefined
  var sizeAutoCapable: js.UndefOr[Boolean] = js.undefined
  var textarea: js.UndefOr[AnonDynHeight] = js.undefined
  var updateOnLoad: js.UndefOr[String | js.Array[String] | Null] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    autoUpdate: js.UndefOr[Boolean] = js.undefined,
    autoUpdateInterval: Int | Double = null,
    callbacks: AnonOnContentSizeChanged = null,
    className: String = null,
    clipAlways: js.UndefOr[Boolean] = js.undefined,
    nativeScrollbarsOverlaid: AnonInitialize = null,
    normalizeRTL: js.UndefOr[Boolean] = js.undefined,
    overflowBehavior: AnonXOverflowBehavior = null,
    paddingAbsolute: js.UndefOr[Boolean] = js.undefined,
    resize: ResizeBehavior = null,
    scrollbars: AnonAutoHide = null,
    sizeAutoCapable: js.UndefOr[Boolean] = js.undefined,
    textarea: AnonDynHeight = null,
    updateOnLoad: String | js.Array[String] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoUpdate)) __obj.updateDynamic("autoUpdate")(autoUpdate.asInstanceOf[js.Any])
    if (autoUpdateInterval != null) __obj.updateDynamic("autoUpdateInterval")(autoUpdateInterval.asInstanceOf[js.Any])
    if (callbacks != null) __obj.updateDynamic("callbacks")(callbacks.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(clipAlways)) __obj.updateDynamic("clipAlways")(clipAlways.asInstanceOf[js.Any])
    if (nativeScrollbarsOverlaid != null) __obj.updateDynamic("nativeScrollbarsOverlaid")(nativeScrollbarsOverlaid.asInstanceOf[js.Any])
    if (!js.isUndefined(normalizeRTL)) __obj.updateDynamic("normalizeRTL")(normalizeRTL.asInstanceOf[js.Any])
    if (overflowBehavior != null) __obj.updateDynamic("overflowBehavior")(overflowBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(paddingAbsolute)) __obj.updateDynamic("paddingAbsolute")(paddingAbsolute.asInstanceOf[js.Any])
    if (resize != null) __obj.updateDynamic("resize")(resize.asInstanceOf[js.Any])
    if (scrollbars != null) __obj.updateDynamic("scrollbars")(scrollbars.asInstanceOf[js.Any])
    if (!js.isUndefined(sizeAutoCapable)) __obj.updateDynamic("sizeAutoCapable")(sizeAutoCapable.asInstanceOf[js.Any])
    if (textarea != null) __obj.updateDynamic("textarea")(textarea.asInstanceOf[js.Any])
    if (updateOnLoad != null) __obj.updateDynamic("updateOnLoad")(updateOnLoad.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

