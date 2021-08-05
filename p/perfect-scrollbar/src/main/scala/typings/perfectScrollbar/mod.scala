package typings.perfectScrollbar

import typings.perfectScrollbar.anon.X
import typings.perfectScrollbar.mod.PerfectScrollbar.Options
import typings.std.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("perfect-scrollbar", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with PerfectScrollbar {
    def this(element: String) = this()
    def this(element: Element) = this()
    def this(element: String, options: Options) = this()
    def this(element: Element, options: Options) = this()
    
    /* CompleteClass */
    var containerHeight: Double = js.native
    
    /* CompleteClass */
    var containerWidth: Double = js.native
    
    /* CompleteClass */
    var contentHeight: Double = js.native
    
    /* CompleteClass */
    var contentWidth: Double = js.native
    
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /* CompleteClass */
    var element: HTMLElement = js.native
    
    /* CompleteClass */
    var isAlive: Boolean = js.native
    
    /* CompleteClass */
    var isNegativeScroll: Boolean = js.native
    
    /* CompleteClass */
    var isRtl: Boolean = js.native
    
    /* CompleteClass */
    var isScrollbarXUsingBottom: Boolean = js.native
    
    /* CompleteClass */
    var isScrollbarYUsingBottom: Boolean = js.native
    
    /* CompleteClass */
    var lastScrollLeft: Boolean = js.native
    
    /* CompleteClass */
    var lastScrollTop: Boolean = js.native
    
    /* CompleteClass */
    var negativeScrollAdjustment: Double = js.native
    
    /* CompleteClass */
    var railBorderXWidth: Double = js.native
    
    /* CompleteClass */
    var railBorderYWidth: Double = js.native
    
    /* CompleteClass */
    var railXMarginWidth: Double = js.native
    
    /* CompleteClass */
    var railXRatio: Double = js.native
    
    /* CompleteClass */
    var railXWidth: Double = js.native
    
    /* CompleteClass */
    var railYHeight: Double = js.native
    
    /* CompleteClass */
    var railYMarginHeight: Double = js.native
    
    /* CompleteClass */
    var railYRatio: Double = js.native
    
    /* CompleteClass */
    var reach: X = js.native
    
    /* CompleteClass */
    var scrollbarX: HTMLElement = js.native
    
    /* CompleteClass */
    var scrollbarXActive: Boolean = js.native
    
    /* CompleteClass */
    var scrollbarXBottom: Double = js.native
    
    /* CompleteClass */
    var scrollbarXLeft: Double = js.native
    
    /* CompleteClass */
    var scrollbarXRail: HTMLElement = js.native
    
    /* CompleteClass */
    var scrollbarXWidth: Double = js.native
    
    /* CompleteClass */
    var scrollbarY: HTMLElement = js.native
    
    /* CompleteClass */
    var scrollbarYActive: Boolean = js.native
    
    /* CompleteClass */
    var scrollbarYHeight: Double = js.native
    
    /* CompleteClass */
    var scrollbarYRail: HTMLElement = js.native
    
    /* CompleteClass */
    var scrollbarYRight: Double = js.native
    
    /* CompleteClass */
    var scrollbarYTop: Double = js.native
    
    /* CompleteClass */
    var settings: Options = js.native
    
    /* CompleteClass */
    override def update(): Unit = js.native
  }
  
  trait PerfectScrollbar extends StObject {
    
    var containerHeight: Double
    
    var containerWidth: Double
    
    var contentHeight: Double
    
    var contentWidth: Double
    
    def destroy(): Unit
    
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
    
    var reach: X
    
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
    
    def update(): Unit
  }
  object PerfectScrollbar {
    
    inline def apply(
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
    
    trait Options extends StObject {
      
      var handlers: js.UndefOr[js.Array[String]] = js.undefined
      
      var maxScrollbarLength: js.UndefOr[Double] = js.undefined
      
      var minScrollbarLength: js.UndefOr[Double] = js.undefined
      
      var scrollXMarginOffset: js.UndefOr[Double] = js.undefined
      
      var scrollYMarginOffset: js.UndefOr[Double] = js.undefined
      
      var scrollingThreshold: js.UndefOr[Double] = js.undefined
      
      var suppressScrollX: js.UndefOr[Boolean] = js.undefined
      
      var suppressScrollY: js.UndefOr[Boolean] = js.undefined
      
      var swipeEasing: js.UndefOr[Boolean] = js.undefined
      
      var useBothWheelAxes: js.UndefOr[Boolean] = js.undefined
      
      var wheelPropagation: js.UndefOr[Boolean] = js.undefined
      
      var wheelSpeed: js.UndefOr[Double] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      extension [Self <: Options](x: Self) {
        
        inline def setHandlers(value: js.Array[String]): Self = StObject.set(x, "handlers", value.asInstanceOf[js.Any])
        
        inline def setHandlersUndefined: Self = StObject.set(x, "handlers", js.undefined)
        
        inline def setHandlersVarargs(value: String*): Self = StObject.set(x, "handlers", js.Array(value :_*))
        
        inline def setMaxScrollbarLength(value: Double): Self = StObject.set(x, "maxScrollbarLength", value.asInstanceOf[js.Any])
        
        inline def setMaxScrollbarLengthUndefined: Self = StObject.set(x, "maxScrollbarLength", js.undefined)
        
        inline def setMinScrollbarLength(value: Double): Self = StObject.set(x, "minScrollbarLength", value.asInstanceOf[js.Any])
        
        inline def setMinScrollbarLengthUndefined: Self = StObject.set(x, "minScrollbarLength", js.undefined)
        
        inline def setScrollXMarginOffset(value: Double): Self = StObject.set(x, "scrollXMarginOffset", value.asInstanceOf[js.Any])
        
        inline def setScrollXMarginOffsetUndefined: Self = StObject.set(x, "scrollXMarginOffset", js.undefined)
        
        inline def setScrollYMarginOffset(value: Double): Self = StObject.set(x, "scrollYMarginOffset", value.asInstanceOf[js.Any])
        
        inline def setScrollYMarginOffsetUndefined: Self = StObject.set(x, "scrollYMarginOffset", js.undefined)
        
        inline def setScrollingThreshold(value: Double): Self = StObject.set(x, "scrollingThreshold", value.asInstanceOf[js.Any])
        
        inline def setScrollingThresholdUndefined: Self = StObject.set(x, "scrollingThreshold", js.undefined)
        
        inline def setSuppressScrollX(value: Boolean): Self = StObject.set(x, "suppressScrollX", value.asInstanceOf[js.Any])
        
        inline def setSuppressScrollXUndefined: Self = StObject.set(x, "suppressScrollX", js.undefined)
        
        inline def setSuppressScrollY(value: Boolean): Self = StObject.set(x, "suppressScrollY", value.asInstanceOf[js.Any])
        
        inline def setSuppressScrollYUndefined: Self = StObject.set(x, "suppressScrollY", js.undefined)
        
        inline def setSwipeEasing(value: Boolean): Self = StObject.set(x, "swipeEasing", value.asInstanceOf[js.Any])
        
        inline def setSwipeEasingUndefined: Self = StObject.set(x, "swipeEasing", js.undefined)
        
        inline def setUseBothWheelAxes(value: Boolean): Self = StObject.set(x, "useBothWheelAxes", value.asInstanceOf[js.Any])
        
        inline def setUseBothWheelAxesUndefined: Self = StObject.set(x, "useBothWheelAxes", js.undefined)
        
        inline def setWheelPropagation(value: Boolean): Self = StObject.set(x, "wheelPropagation", value.asInstanceOf[js.Any])
        
        inline def setWheelPropagationUndefined: Self = StObject.set(x, "wheelPropagation", js.undefined)
        
        inline def setWheelSpeed(value: Double): Self = StObject.set(x, "wheelSpeed", value.asInstanceOf[js.Any])
        
        inline def setWheelSpeedUndefined: Self = StObject.set(x, "wheelSpeed", js.undefined)
      }
    }
    
    extension [Self <: PerfectScrollbar](x: Self) {
      
      inline def setContainerHeight(value: Double): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
      
      inline def setContainerWidth(value: Double): Self = StObject.set(x, "containerWidth", value.asInstanceOf[js.Any])
      
      inline def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      inline def setContentWidth(value: Double): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setIsAlive(value: Boolean): Self = StObject.set(x, "isAlive", value.asInstanceOf[js.Any])
      
      inline def setIsNegativeScroll(value: Boolean): Self = StObject.set(x, "isNegativeScroll", value.asInstanceOf[js.Any])
      
      inline def setIsRtl(value: Boolean): Self = StObject.set(x, "isRtl", value.asInstanceOf[js.Any])
      
      inline def setIsScrollbarXUsingBottom(value: Boolean): Self = StObject.set(x, "isScrollbarXUsingBottom", value.asInstanceOf[js.Any])
      
      inline def setIsScrollbarYUsingBottom(value: Boolean): Self = StObject.set(x, "isScrollbarYUsingBottom", value.asInstanceOf[js.Any])
      
      inline def setLastScrollLeft(value: Boolean): Self = StObject.set(x, "lastScrollLeft", value.asInstanceOf[js.Any])
      
      inline def setLastScrollTop(value: Boolean): Self = StObject.set(x, "lastScrollTop", value.asInstanceOf[js.Any])
      
      inline def setNegativeScrollAdjustment(value: Double): Self = StObject.set(x, "negativeScrollAdjustment", value.asInstanceOf[js.Any])
      
      inline def setRailBorderXWidth(value: Double): Self = StObject.set(x, "railBorderXWidth", value.asInstanceOf[js.Any])
      
      inline def setRailBorderYWidth(value: Double): Self = StObject.set(x, "railBorderYWidth", value.asInstanceOf[js.Any])
      
      inline def setRailXMarginWidth(value: Double): Self = StObject.set(x, "railXMarginWidth", value.asInstanceOf[js.Any])
      
      inline def setRailXRatio(value: Double): Self = StObject.set(x, "railXRatio", value.asInstanceOf[js.Any])
      
      inline def setRailXWidth(value: Double): Self = StObject.set(x, "railXWidth", value.asInstanceOf[js.Any])
      
      inline def setRailYHeight(value: Double): Self = StObject.set(x, "railYHeight", value.asInstanceOf[js.Any])
      
      inline def setRailYMarginHeight(value: Double): Self = StObject.set(x, "railYMarginHeight", value.asInstanceOf[js.Any])
      
      inline def setRailYRatio(value: Double): Self = StObject.set(x, "railYRatio", value.asInstanceOf[js.Any])
      
      inline def setReach(value: X): Self = StObject.set(x, "reach", value.asInstanceOf[js.Any])
      
      inline def setScrollbarX(value: HTMLElement): Self = StObject.set(x, "scrollbarX", value.asInstanceOf[js.Any])
      
      inline def setScrollbarXActive(value: Boolean): Self = StObject.set(x, "scrollbarXActive", value.asInstanceOf[js.Any])
      
      inline def setScrollbarXBottom(value: Double): Self = StObject.set(x, "scrollbarXBottom", value.asInstanceOf[js.Any])
      
      inline def setScrollbarXLeft(value: Double): Self = StObject.set(x, "scrollbarXLeft", value.asInstanceOf[js.Any])
      
      inline def setScrollbarXRail(value: HTMLElement): Self = StObject.set(x, "scrollbarXRail", value.asInstanceOf[js.Any])
      
      inline def setScrollbarXWidth(value: Double): Self = StObject.set(x, "scrollbarXWidth", value.asInstanceOf[js.Any])
      
      inline def setScrollbarY(value: HTMLElement): Self = StObject.set(x, "scrollbarY", value.asInstanceOf[js.Any])
      
      inline def setScrollbarYActive(value: Boolean): Self = StObject.set(x, "scrollbarYActive", value.asInstanceOf[js.Any])
      
      inline def setScrollbarYHeight(value: Double): Self = StObject.set(x, "scrollbarYHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollbarYOuterWidth(value: Double): Self = StObject.set(x, "scrollbarYOuterWidth", value.asInstanceOf[js.Any])
      
      inline def setScrollbarYOuterWidthUndefined: Self = StObject.set(x, "scrollbarYOuterWidth", js.undefined)
      
      inline def setScrollbarYRail(value: HTMLElement): Self = StObject.set(x, "scrollbarYRail", value.asInstanceOf[js.Any])
      
      inline def setScrollbarYRight(value: Double): Self = StObject.set(x, "scrollbarYRight", value.asInstanceOf[js.Any])
      
      inline def setScrollbarYTop(value: Double): Self = StObject.set(x, "scrollbarYTop", value.asInstanceOf[js.Any])
      
      inline def setSettings(value: Options): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setUpdate(value: () => Unit): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
}
