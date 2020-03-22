package typings.perfectScrollbar.mod

import typings.perfectScrollbar.AnonX
import typings.perfectScrollbar.mod.PerfectScrollbar.Options
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PerfectScrollbar_ extends js.Object {
  var containerHeight: Double
  var containerWidth: Double
  var contentHeight: Double
  var contentWidth: Double
  var element: HTMLElement
  var isAlive: Boolean
  var isNegativeScroll: Boolean
  var isRtl: Boolean
  var isScrollbarXUsingBottom: Boolean
  var isScrollbarYUsingBottom: Boolean
  var lastScrollLeft: Boolean
  var lastScrollTop: Boolean
  var negativeScrollAdjustment: Double
  var railBorderXWidth: Double
  var railBorderYWidth: Double
  var railXMarginWidth: Double
  var railXRatio: Double
  var railXWidth: Double
  var railYHeight: Double
  var railYMarginHeight: Double
  var railYRatio: Double
  var reach: AnonX
  var scrollbarX: HTMLElement
  var scrollbarXActive: Boolean
  var scrollbarXBottom: Double
  var scrollbarXLeft: Double
  var scrollbarXRail: HTMLElement
  var scrollbarXWidth: Double
  var scrollbarY: HTMLElement
  var scrollbarYActive: Boolean
  var scrollbarYHeight: Double
  var scrollbarYOuterWidth: js.UndefOr[Double] = js.undefined
  var scrollbarYRail: HTMLElement
  var scrollbarYRight: Double
  var scrollbarYTop: Double
  var settings: Options
  def destroy(): Unit
  def update(): Unit
}

object PerfectScrollbar_ {
  @scala.inline
  def apply(
    containerHeight: Double,
    containerWidth: Double,
    contentHeight: Double,
    contentWidth: Double,
    destroy: () => Unit,
    element: HTMLElement,
    isAlive: Boolean,
    isNegativeScroll: Boolean,
    isRtl: Boolean,
    isScrollbarXUsingBottom: Boolean,
    isScrollbarYUsingBottom: Boolean,
    lastScrollLeft: Boolean,
    lastScrollTop: Boolean,
    negativeScrollAdjustment: Double,
    railBorderXWidth: Double,
    railBorderYWidth: Double,
    railXMarginWidth: Double,
    railXRatio: Double,
    railXWidth: Double,
    railYHeight: Double,
    railYMarginHeight: Double,
    railYRatio: Double,
    reach: AnonX,
    scrollbarX: HTMLElement,
    scrollbarXActive: Boolean,
    scrollbarXBottom: Double,
    scrollbarXLeft: Double,
    scrollbarXRail: HTMLElement,
    scrollbarXWidth: Double,
    scrollbarY: HTMLElement,
    scrollbarYActive: Boolean,
    scrollbarYHeight: Double,
    scrollbarYRail: HTMLElement,
    scrollbarYRight: Double,
    scrollbarYTop: Double,
    settings: Options,
    update: () => Unit,
    scrollbarYOuterWidth: Int | Double = null
  ): PerfectScrollbar_ = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], contentHeight = contentHeight.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], isAlive = isAlive.asInstanceOf[js.Any], isNegativeScroll = isNegativeScroll.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], isScrollbarXUsingBottom = isScrollbarXUsingBottom.asInstanceOf[js.Any], isScrollbarYUsingBottom = isScrollbarYUsingBottom.asInstanceOf[js.Any], lastScrollLeft = lastScrollLeft.asInstanceOf[js.Any], lastScrollTop = lastScrollTop.asInstanceOf[js.Any], negativeScrollAdjustment = negativeScrollAdjustment.asInstanceOf[js.Any], railBorderXWidth = railBorderXWidth.asInstanceOf[js.Any], railBorderYWidth = railBorderYWidth.asInstanceOf[js.Any], railXMarginWidth = railXMarginWidth.asInstanceOf[js.Any], railXRatio = railXRatio.asInstanceOf[js.Any], railXWidth = railXWidth.asInstanceOf[js.Any], railYHeight = railYHeight.asInstanceOf[js.Any], railYMarginHeight = railYMarginHeight.asInstanceOf[js.Any], railYRatio = railYRatio.asInstanceOf[js.Any], reach = reach.asInstanceOf[js.Any], scrollbarX = scrollbarX.asInstanceOf[js.Any], scrollbarXActive = scrollbarXActive.asInstanceOf[js.Any], scrollbarXBottom = scrollbarXBottom.asInstanceOf[js.Any], scrollbarXLeft = scrollbarXLeft.asInstanceOf[js.Any], scrollbarXRail = scrollbarXRail.asInstanceOf[js.Any], scrollbarXWidth = scrollbarXWidth.asInstanceOf[js.Any], scrollbarY = scrollbarY.asInstanceOf[js.Any], scrollbarYActive = scrollbarYActive.asInstanceOf[js.Any], scrollbarYHeight = scrollbarYHeight.asInstanceOf[js.Any], scrollbarYRail = scrollbarYRail.asInstanceOf[js.Any], scrollbarYRight = scrollbarYRight.asInstanceOf[js.Any], scrollbarYTop = scrollbarYTop.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    if (scrollbarYOuterWidth != null) __obj.updateDynamic("scrollbarYOuterWidth")(scrollbarYOuterWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[PerfectScrollbar_]
  }
}

