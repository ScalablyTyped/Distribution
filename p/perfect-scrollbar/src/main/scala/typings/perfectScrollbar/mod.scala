package typings.perfectScrollbar

import typings.perfectScrollbar.anon.X
import typings.perfectScrollbar.mod.PerfectScrollbar.Options
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("perfect-scrollbar", JSImport.Default)
  @js.native
  class default protected () extends PerfectScrollbar {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: Options) = this()
    def this(element: Element, options: Options) = this()
  }
  
  @js.native
  trait PerfectScrollbar extends StObject {
    
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
  object PerfectScrollbar {
    
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
    ): PerfectScrollbar = {
      val __obj = js.Dynamic.literal(containerHeight = containerHeight.asInstanceOf[js.Any], containerWidth = containerWidth.asInstanceOf[js.Any], contentHeight = contentHeight.asInstanceOf[js.Any], contentWidth = contentWidth.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), element = element.asInstanceOf[js.Any], isAlive = isAlive.asInstanceOf[js.Any], isNegativeScroll = isNegativeScroll.asInstanceOf[js.Any], isRtl = isRtl.asInstanceOf[js.Any], isScrollbarXUsingBottom = isScrollbarXUsingBottom.asInstanceOf[js.Any], isScrollbarYUsingBottom = isScrollbarYUsingBottom.asInstanceOf[js.Any], lastScrollLeft = lastScrollLeft.asInstanceOf[js.Any], lastScrollTop = lastScrollTop.asInstanceOf[js.Any], negativeScrollAdjustment = negativeScrollAdjustment.asInstanceOf[js.Any], railBorderXWidth = railBorderXWidth.asInstanceOf[js.Any], railBorderYWidth = railBorderYWidth.asInstanceOf[js.Any], railXMarginWidth = railXMarginWidth.asInstanceOf[js.Any], railXRatio = railXRatio.asInstanceOf[js.Any], railXWidth = railXWidth.asInstanceOf[js.Any], railYHeight = railYHeight.asInstanceOf[js.Any], railYMarginHeight = railYMarginHeight.asInstanceOf[js.Any], railYRatio = railYRatio.asInstanceOf[js.Any], reach = reach.asInstanceOf[js.Any], scrollbarX = scrollbarX.asInstanceOf[js.Any], scrollbarXActive = scrollbarXActive.asInstanceOf[js.Any], scrollbarXBottom = scrollbarXBottom.asInstanceOf[js.Any], scrollbarXLeft = scrollbarXLeft.asInstanceOf[js.Any], scrollbarXRail = scrollbarXRail.asInstanceOf[js.Any], scrollbarXWidth = scrollbarXWidth.asInstanceOf[js.Any], scrollbarY = scrollbarY.asInstanceOf[js.Any], scrollbarYActive = scrollbarYActive.asInstanceOf[js.Any], scrollbarYHeight = scrollbarYHeight.asInstanceOf[js.Any], scrollbarYRail = scrollbarYRail.asInstanceOf[js.Any], scrollbarYRight = scrollbarYRight.asInstanceOf[js.Any], scrollbarYTop = scrollbarYTop.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[PerfectScrollbar]
    }
    
    @js.native
    trait Options extends StObject {
      
      var handlers: js.UndefOr[js.Array[String]] = js.native
      
      var maxScrollbarLength: js.UndefOr[Double] = js.native
      
      var minScrollbarLength: js.UndefOr[Double] = js.native
      
      var scrollXMarginOffset: js.UndefOr[Double] = js.native
      
      var scrollYMarginOffset: js.UndefOr[Double] = js.native
      
      var scrollingThreshold: js.UndefOr[Double] = js.native
      
      var suppressScrollX: js.UndefOr[Boolean] = js.native
      
      var suppressScrollY: js.UndefOr[Boolean] = js.native
      
      var swipeEasing: js.UndefOr[Boolean] = js.native
      
      var useBothWheelAxes: js.UndefOr[Boolean] = js.native
      
      var wheelPropagation: js.UndefOr[Boolean] = js.native
      
      var wheelSpeed: js.UndefOr[Double] = js.native
    }
    object Options {
      
      @scala.inline
      def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setHandlers(value: js.Array[String]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
        
        @scala.inline
        def setHandlersVarargs(value: String*): Self = StObject.set(x, "handlers", js.Array(value :_*))
        
        @scala.inline
        def setMaxScrollbarLength(value: Double): Self = StObject.set(x, "maxScrollbarLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMaxScrollbarLengthUndefined: Self = StObject.set(x, "maxScrollbarLength", js.undefined)
        
        @scala.inline
        def setMinScrollbarLength(value: Double): Self = StObject.set(x, "minScrollbarLength", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMinScrollbarLengthUndefined: Self = StObject.set(x, "minScrollbarLength", js.undefined)
        
        @scala.inline
        def setScrollXMarginOffset(value: Double): Self = StObject.set(x, "scrollXMarginOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollXMarginOffsetUndefined: Self = StObject.set(x, "scrollXMarginOffset", js.undefined)
        
        @scala.inline
        def setScrollYMarginOffset(value: Double): Self = StObject.set(x, "scrollYMarginOffset", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollYMarginOffsetUndefined: Self = StObject.set(x, "scrollYMarginOffset", js.undefined)
        
        @scala.inline
        def setScrollingThreshold(value: Double): Self = StObject.set(x, "scrollingThreshold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setScrollingThresholdUndefined: Self = StObject.set(x, "scrollingThreshold", js.undefined)
        
        @scala.inline
        def setSuppressScrollX(value: Boolean): Self = StObject.set(x, "suppressScrollX", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuppressScrollXUndefined: Self = StObject.set(x, "suppressScrollX", js.undefined)
        
        @scala.inline
        def setSuppressScrollY(value: Boolean): Self = StObject.set(x, "suppressScrollY", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSuppressScrollYUndefined: Self = StObject.set(x, "suppressScrollY", js.undefined)
        
        @scala.inline
        def setSwipeEasing(value: Boolean): Self = StObject.set(x, "swipeEasing", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setSwipeEasingUndefined: Self = StObject.set(x, "swipeEasing", js.undefined)
        
        @scala.inline
        def setUseBothWheelAxes(value: Boolean): Self = StObject.set(x, "useBothWheelAxes", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseBothWheelAxesUndefined: Self = StObject.set(x, "useBothWheelAxes", js.undefined)
        
        @scala.inline
        def setWheelPropagation(value: Boolean): Self = StObject.set(x, "wheelPropagation", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWheelPropagationUndefined: Self = StObject.set(x, "wheelPropagation", js.undefined)
        
        @scala.inline
        def setWheelSpeed(value: Double): Self = StObject.set(x, "wheelSpeed", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWheelSpeedUndefined: Self = StObject.set(x, "wheelSpeed", js.undefined)
      }
    }
    
    @scala.inline
    implicit class PerfectScrollbarMutableBuilder[Self <: PerfectScrollbar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentWidth(value: Double): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAlive(value: Boolean): Self = StObject.set(x, "isAlive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNegativeScroll(value: Boolean): Self = StObject.set(x, "isNegativeScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsScrollbarXUsingBottom(value: Boolean): Self = StObject.set(x, "isScrollbarXUsingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsScrollbarYUsingBottom(value: Boolean): Self = StObject.set(x, "isScrollbarYUsingBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastScrollLeft(value: Boolean): Self = StObject.set(x, "lastScrollLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastScrollTop(value: Boolean): Self = StObject.set(x, "lastScrollTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNegativeScrollAdjustment(value: Double): Self = StObject.set(x, "negativeScrollAdjustment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailBorderXWidth(value: Double): Self = StObject.set(x, "railBorderXWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailBorderYWidth(value: Double): Self = StObject.set(x, "railBorderYWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailXMarginWidth(value: Double): Self = StObject.set(x, "railXMarginWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailXRatio(value: Double): Self = StObject.set(x, "railXRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailXWidth(value: Double): Self = StObject.set(x, "railXWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailYHeight(value: Double): Self = StObject.set(x, "railYHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailYMarginHeight(value: Double): Self = StObject.set(x, "railYMarginHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRailYRatio(value: Double): Self = StObject.set(x, "railYRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReach(value: X): Self = StObject.set(x, "reach", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarX(value: HTMLElement): Self = StObject.set(x, "scrollbarX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarXActive(value: Boolean): Self = StObject.set(x, "scrollbarXActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarXBottom(value: Double): Self = StObject.set(x, "scrollbarXBottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarXLeft(value: Double): Self = StObject.set(x, "scrollbarXLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarXRail(value: HTMLElement): Self = StObject.set(x, "scrollbarXRail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarXWidth(value: Double): Self = StObject.set(x, "scrollbarXWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarY(value: HTMLElement): Self = StObject.set(x, "scrollbarY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarYActive(value: Boolean): Self = StObject.set(x, "scrollbarYActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarYHeight(value: Double): Self = StObject.set(x, "scrollbarYHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarYOuterWidth(value: Double): Self = StObject.set(x, "scrollbarYOuterWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarYOuterWidthUndefined: Self = StObject.set(x, "scrollbarYOuterWidth", js.undefined)
      
      @scala.inline
      def setScrollbarYRail(value: HTMLElement): Self = StObject.set(x, "scrollbarYRail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarYRight(value: Double): Self = StObject.set(x, "scrollbarYRight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarYTop(value: Double): Self = StObject.set(x, "scrollbarYTop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettings(value: Options): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
