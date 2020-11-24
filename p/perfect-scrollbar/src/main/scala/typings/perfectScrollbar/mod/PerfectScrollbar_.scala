package typings.perfectScrollbar.mod

import typings.perfectScrollbar.anon.X
import typings.perfectScrollbar.mod.PerfectScrollbar.Options
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PerfectScrollbar_ extends js.Object {
  
  var containerHeight: Double = js.native
  
  var containerWidth: Double = js.native
  
  var contentHeight: Double = js.native
  
  var contentWidth: Double = js.native
  
  def destroy(): Unit = js.native
  
  var element: HTMLElement = js.native
  
  var isAlive: Boolean = js.native
  
  var isNegativeScroll: Boolean = js.native
  
  var isRtl: Boolean = js.native
  
  var isScrollbarXUsingBottom: Boolean = js.native
  
  var isScrollbarYUsingBottom: Boolean = js.native
  
  var lastScrollLeft: Boolean = js.native
  
  var lastScrollTop: Boolean = js.native
  
  var negativeScrollAdjustment: Double = js.native
  
  var railBorderXWidth: Double = js.native
  
  var railBorderYWidth: Double = js.native
  
  var railXMarginWidth: Double = js.native
  
  var railXRatio: Double = js.native
  
  var railXWidth: Double = js.native
  
  var railYHeight: Double = js.native
  
  var railYMarginHeight: Double = js.native
  
  var railYRatio: Double = js.native
  
  var reach: X = js.native
  
  var scrollbarX: HTMLElement = js.native
  
  var scrollbarXActive: Boolean = js.native
  
  var scrollbarXBottom: Double = js.native
  
  var scrollbarXLeft: Double = js.native
  
  var scrollbarXRail: HTMLElement = js.native
  
  var scrollbarXWidth: Double = js.native
  
  var scrollbarY: HTMLElement = js.native
  
  var scrollbarYActive: Boolean = js.native
  
  var scrollbarYHeight: Double = js.native
  
  var scrollbarYOuterWidth: js.UndefOr[Double] = js.native
  
  var scrollbarYRail: HTMLElement = js.native
  
  var scrollbarYRight: Double = js.native
  
  var scrollbarYTop: Double = js.native
  
  var settings: Options = js.native
  
  def update(): Unit = js.native
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
    reach: X,
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
    update: () => Unit
  ): PerfectScrollbar_ = {
    val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], contentHeight = contentHeight.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], isAlive = isAlive.asInstanceOf[js.Any], isNegativeScroll = isNegativeScroll.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], isScrollbarXUsingBottom = isScrollbarXUsingBottom.asInstanceOf[js.Any], isScrollbarYUsingBottom = isScrollbarYUsingBottom.asInstanceOf[js.Any], lastScrollLeft = lastScrollLeft.asInstanceOf[js.Any], lastScrollTop = lastScrollTop.asInstanceOf[js.Any], negativeScrollAdjustment = negativeScrollAdjustment.asInstanceOf[js.Any], railBorderXWidth = railBorderXWidth.asInstanceOf[js.Any], railBorderYWidth = railBorderYWidth.asInstanceOf[js.Any], railXMarginWidth = railXMarginWidth.asInstanceOf[js.Any], railXRatio = railXRatio.asInstanceOf[js.Any], railXWidth = railXWidth.asInstanceOf[js.Any], railYHeight = railYHeight.asInstanceOf[js.Any], railYMarginHeight = railYMarginHeight.asInstanceOf[js.Any], railYRatio = railYRatio.asInstanceOf[js.Any], reach = reach.asInstanceOf[js.Any], scrollbarX = scrollbarX.asInstanceOf[js.Any], scrollbarXActive = scrollbarXActive.asInstanceOf[js.Any], scrollbarXBottom = scrollbarXBottom.asInstanceOf[js.Any], scrollbarXLeft = scrollbarXLeft.asInstanceOf[js.Any], scrollbarXRail = scrollbarXRail.asInstanceOf[js.Any], scrollbarXWidth = scrollbarXWidth.asInstanceOf[js.Any], scrollbarY = scrollbarY.asInstanceOf[js.Any], scrollbarYActive = scrollbarYActive.asInstanceOf[js.Any], scrollbarYHeight = scrollbarYHeight.asInstanceOf[js.Any], scrollbarYRail = scrollbarYRail.asInstanceOf[js.Any], scrollbarYRight = scrollbarYRight.asInstanceOf[js.Any], scrollbarYTop = scrollbarYTop.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[PerfectScrollbar_]
  }
  
  @scala.inline
  implicit class PerfectScrollbar_Ops[Self <: PerfectScrollbar_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setContainerHeight(value: Double): Self = this.set("containerHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContainerWidth(value: Double): Self = this.set("containerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentHeight(value: Double): Self = this.set("contentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentWidth(value: Double): Self = this.set("contentWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsAlive(value: Boolean): Self = this.set("isAlive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsNegativeScroll(value: Boolean): Self = this.set("isNegativeScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsRtl(value: Boolean): Self = this.set("isRtl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrollbarXUsingBottom(value: Boolean): Self = this.set("isScrollbarXUsingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsScrollbarYUsingBottom(value: Boolean): Self = this.set("isScrollbarYUsingBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastScrollLeft(value: Boolean): Self = this.set("lastScrollLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastScrollTop(value: Boolean): Self = this.set("lastScrollTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeScrollAdjustment(value: Double): Self = this.set("negativeScrollAdjustment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailBorderXWidth(value: Double): Self = this.set("railBorderXWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailBorderYWidth(value: Double): Self = this.set("railBorderYWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailXMarginWidth(value: Double): Self = this.set("railXMarginWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailXRatio(value: Double): Self = this.set("railXRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailXWidth(value: Double): Self = this.set("railXWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailYHeight(value: Double): Self = this.set("railYHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailYMarginHeight(value: Double): Self = this.set("railYMarginHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRailYRatio(value: Double): Self = this.set("railYRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReach(value: X): Self = this.set("reach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarX(value: HTMLElement): Self = this.set("scrollbarX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarXActive(value: Boolean): Self = this.set("scrollbarXActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarXBottom(value: Double): Self = this.set("scrollbarXBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarXLeft(value: Double): Self = this.set("scrollbarXLeft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarXRail(value: HTMLElement): Self = this.set("scrollbarXRail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarXWidth(value: Double): Self = this.set("scrollbarXWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarY(value: HTMLElement): Self = this.set("scrollbarY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarYActive(value: Boolean): Self = this.set("scrollbarYActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarYHeight(value: Double): Self = this.set("scrollbarYHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarYRail(value: HTMLElement): Self = this.set("scrollbarYRail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarYRight(value: Double): Self = this.set("scrollbarYRight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollbarYTop(value: Double): Self = this.set("scrollbarYTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSettings(value: Options): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => Unit): Self = this.set("update", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScrollbarYOuterWidth(value: Double): Self = this.set("scrollbarYOuterWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollbarYOuterWidth: Self = this.set("scrollbarYOuterWidth", js.undefined)
  }
}
