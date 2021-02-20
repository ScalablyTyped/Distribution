package typings.ngxInfiniteScroll

import typings.angularCore.mod.ElementRef
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsMod {
  
  type ContainerRef = Window | ElementRef[js.Any] | js.Any
  
  @js.native
  trait IInfiniteScrollAction extends StObject {
    
    var payload: IInfiniteScrollEvent = js.native
    
    var `type`: String = js.native
  }
  object IInfiniteScrollAction {
    
    @scala.inline
    def apply(payload: IInfiniteScrollEvent, `type`: String): IInfiniteScrollAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInfiniteScrollAction]
    }
    
    @scala.inline
    implicit class IInfiniteScrollActionMutableBuilder[Self <: IInfiniteScrollAction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPayload(value: IInfiniteScrollEvent): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IInfiniteScrollEvent extends StObject {
    
    var currentScrollPosition: Double = js.native
  }
  object IInfiniteScrollEvent {
    
    @scala.inline
    def apply(currentScrollPosition: Double): IInfiniteScrollEvent = {
      val __obj = js.Dynamic.literal(currentScrollPosition = currentScrollPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInfiniteScrollEvent]
    }
    
    @scala.inline
    implicit class IInfiniteScrollEventMutableBuilder[Self <: IInfiniteScrollEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentScrollPosition(value: Double): Self = StObject.set(x, "currentScrollPosition", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPositionElements extends StObject {
    
    var axis: js.Any = js.native
    
    var windowElement: ContainerRef = js.native
  }
  object IPositionElements {
    
    @scala.inline
    def apply(axis: js.Any, windowElement: ContainerRef): IPositionElements = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], windowElement = windowElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPositionElements]
    }
    
    @scala.inline
    implicit class IPositionElementsMutableBuilder[Self <: IPositionElements] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: js.Any): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWindowElement(value: ContainerRef): Self = StObject.set(x, "windowElement", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IPositionStats extends StObject {
    
    var height: Double = js.native
    
    var isWindow: js.UndefOr[Boolean] = js.native
    
    var scrolled: Double = js.native
    
    var totalToScroll: Double = js.native
  }
  object IPositionStats {
    
    @scala.inline
    def apply(height: Double, scrolled: Double, totalToScroll: Double): IPositionStats = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scrolled = scrolled.asInstanceOf[js.Any], totalToScroll = totalToScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPositionStats]
    }
    
    @scala.inline
    implicit class IPositionStatsMutableBuilder[Self <: IPositionStats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWindow(value: Boolean): Self = StObject.set(x, "isWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWindowUndefined: Self = StObject.set(x, "isWindow", js.undefined)
      
      @scala.inline
      def setScrolled(value: Double): Self = StObject.set(x, "scrolled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalToScroll(value: Double): Self = StObject.set(x, "totalToScroll", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IResolver extends StObject {
    
    var axis: js.Any = js.native
    
    var container: ContainerRef = js.native
    
    var isWindow: Boolean = js.native
  }
  object IResolver {
    
    @scala.inline
    def apply(axis: js.Any, container: ContainerRef, isWindow: Boolean): IResolver = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], isWindow = isWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResolver]
    }
    
    @scala.inline
    implicit class IResolverMutableBuilder[Self <: IResolver] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: js.Any): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainer(value: ContainerRef): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsWindow(value: Boolean): Self = StObject.set(x, "isWindow", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IScrollParams extends StObject {
    
    var fire: Boolean = js.native
    
    var scrollDown: Boolean = js.native
    
    var stats: IPositionStats = js.native
  }
  object IScrollParams {
    
    @scala.inline
    def apply(fire: Boolean, scrollDown: Boolean, stats: IPositionStats): IScrollParams = {
      val __obj = js.Dynamic.literal(fire = fire.asInstanceOf[js.Any], scrollDown = scrollDown.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollParams]
    }
    
    @scala.inline
    implicit class IScrollParamsMutableBuilder[Self <: IScrollParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFire(value: Boolean): Self = StObject.set(x, "fire", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollDown(value: Boolean): Self = StObject.set(x, "scrollDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStats(value: IPositionStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IScrollRegisterConfig extends StObject {
    
    var container: ContainerRef = js.native
    
    var throttle: Double = js.native
  }
  object IScrollRegisterConfig {
    
    @scala.inline
    def apply(container: ContainerRef, throttle: Double): IScrollRegisterConfig = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollRegisterConfig]
    }
    
    @scala.inline
    implicit class IScrollRegisterConfigMutableBuilder[Self <: IScrollRegisterConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContainer(value: ContainerRef): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IScrollState extends StObject {
    
    var lastScrollPosition: Double = js.native
    
    var lastTotalToScroll: Double = js.native
    
    var totalToScroll: Double = js.native
    
    var triggered: IScrollerDistance = js.native
  }
  object IScrollState {
    
    @scala.inline
    def apply(
      lastScrollPosition: Double,
      lastTotalToScroll: Double,
      totalToScroll: Double,
      triggered: IScrollerDistance
    ): IScrollState = {
      val __obj = js.Dynamic.literal(lastScrollPosition = lastScrollPosition.asInstanceOf[js.Any], lastTotalToScroll = lastTotalToScroll.asInstanceOf[js.Any], totalToScroll = totalToScroll.asInstanceOf[js.Any], triggered = triggered.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollState]
    }
    
    @scala.inline
    implicit class IScrollStateMutableBuilder[Self <: IScrollState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLastScrollPosition(value: Double): Self = StObject.set(x, "lastScrollPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastTotalToScroll(value: Double): Self = StObject.set(x, "lastTotalToScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalToScroll(value: Double): Self = StObject.set(x, "totalToScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggered(value: IScrollerDistance): Self = StObject.set(x, "triggered", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IScroller extends StObject {
    
    var alwaysCallback: Boolean = js.native
    
    var disable: Boolean = js.native
    
    var downDistance: Double = js.native
    
    var element: ElementRef[_] = js.native
    
    var fromRoot: Boolean = js.native
    
    var horizontal: Boolean = js.native
    
    var scrollContainer: String | ElementRef[_] = js.native
    
    var scrollWindow: Boolean = js.native
    
    var throttle: Double = js.native
    
    var upDistance: Double = js.native
  }
  object IScroller {
    
    @scala.inline
    def apply(
      alwaysCallback: Boolean,
      disable: Boolean,
      downDistance: Double,
      element: ElementRef[_],
      fromRoot: Boolean,
      horizontal: Boolean,
      scrollContainer: String | ElementRef[_],
      scrollWindow: Boolean,
      throttle: Double,
      upDistance: Double
    ): IScroller = {
      val __obj = js.Dynamic.literal(alwaysCallback = alwaysCallback.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], downDistance = downDistance.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromRoot = fromRoot.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], scrollContainer = scrollContainer.asInstanceOf[js.Any], scrollWindow = scrollWindow.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], upDistance = upDistance.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScroller]
    }
    
    @scala.inline
    implicit class IScrollerMutableBuilder[Self <: IScroller] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlwaysCallback(value: Boolean): Self = StObject.set(x, "alwaysCallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownDistance(value: Double): Self = StObject.set(x, "downDistance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElement(value: ElementRef[_]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromRoot(value: Boolean): Self = StObject.set(x, "fromRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollContainer(value: String | ElementRef[_]): Self = StObject.set(x, "scrollContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollWindow(value: Boolean): Self = StObject.set(x, "scrollWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpDistance(value: Double): Self = StObject.set(x, "upDistance", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IScrollerDistance extends StObject {
    
    var down: js.UndefOr[Double] = js.native
    
    var up: js.UndefOr[Double] = js.native
  }
  object IScrollerDistance {
    
    @scala.inline
    def apply(): IScrollerDistance = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScrollerDistance]
    }
    
    @scala.inline
    implicit class IScrollerDistanceMutableBuilder[Self <: IScrollerDistance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    }
  }
}
