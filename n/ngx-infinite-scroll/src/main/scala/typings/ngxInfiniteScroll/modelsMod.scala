package typings.ngxInfiniteScroll

import typings.angularCore.mod.ElementRef
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modelsMod {
  
  type ContainerRef = Window | ElementRef[js.Any] | js.Any
  
  trait IInfiniteScrollAction extends StObject {
    
    var payload: IInfiniteScrollEvent
    
    var `type`: String
  }
  object IInfiniteScrollAction {
    
    inline def apply(payload: IInfiniteScrollEvent, `type`: String): IInfiniteScrollAction = {
      val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInfiniteScrollAction]
    }
    
    extension [Self <: IInfiniteScrollAction](x: Self) {
      
      inline def setPayload(value: IInfiniteScrollEvent): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait IInfiniteScrollEvent extends StObject {
    
    var currentScrollPosition: Double
  }
  object IInfiniteScrollEvent {
    
    inline def apply(currentScrollPosition: Double): IInfiniteScrollEvent = {
      val __obj = js.Dynamic.literal(currentScrollPosition = currentScrollPosition.asInstanceOf[js.Any])
      __obj.asInstanceOf[IInfiniteScrollEvent]
    }
    
    extension [Self <: IInfiniteScrollEvent](x: Self) {
      
      inline def setCurrentScrollPosition(value: Double): Self = StObject.set(x, "currentScrollPosition", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPositionElements extends StObject {
    
    var axis: js.Any
    
    var windowElement: ContainerRef
  }
  object IPositionElements {
    
    inline def apply(axis: js.Any, windowElement: ContainerRef): IPositionElements = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], windowElement = windowElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPositionElements]
    }
    
    extension [Self <: IPositionElements](x: Self) {
      
      inline def setAxis(value: js.Any): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setWindowElement(value: ContainerRef): Self = StObject.set(x, "windowElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait IPositionStats extends StObject {
    
    var height: Double
    
    var isWindow: js.UndefOr[Boolean] = js.undefined
    
    var scrolled: Double
    
    var totalToScroll: Double
  }
  object IPositionStats {
    
    inline def apply(height: Double, scrolled: Double, totalToScroll: Double): IPositionStats = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], scrolled = scrolled.asInstanceOf[js.Any], totalToScroll = totalToScroll.asInstanceOf[js.Any])
      __obj.asInstanceOf[IPositionStats]
    }
    
    extension [Self <: IPositionStats](x: Self) {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsWindow(value: Boolean): Self = StObject.set(x, "isWindow", value.asInstanceOf[js.Any])
      
      inline def setIsWindowUndefined: Self = StObject.set(x, "isWindow", js.undefined)
      
      inline def setScrolled(value: Double): Self = StObject.set(x, "scrolled", value.asInstanceOf[js.Any])
      
      inline def setTotalToScroll(value: Double): Self = StObject.set(x, "totalToScroll", value.asInstanceOf[js.Any])
    }
  }
  
  trait IResolver extends StObject {
    
    var axis: js.Any
    
    var container: ContainerRef
    
    var isWindow: Boolean
  }
  object IResolver {
    
    inline def apply(axis: js.Any, container: ContainerRef, isWindow: Boolean): IResolver = {
      val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], container = container.asInstanceOf[js.Any], isWindow = isWindow.asInstanceOf[js.Any])
      __obj.asInstanceOf[IResolver]
    }
    
    extension [Self <: IResolver](x: Self) {
      
      inline def setAxis(value: js.Any): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setContainer(value: ContainerRef): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setIsWindow(value: Boolean): Self = StObject.set(x, "isWindow", value.asInstanceOf[js.Any])
    }
  }
  
  trait IScrollParams extends StObject {
    
    var fire: Boolean
    
    var scrollDown: Boolean
    
    var stats: IPositionStats
  }
  object IScrollParams {
    
    inline def apply(fire: Boolean, scrollDown: Boolean, stats: IPositionStats): IScrollParams = {
      val __obj = js.Dynamic.literal(fire = fire.asInstanceOf[js.Any], scrollDown = scrollDown.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollParams]
    }
    
    extension [Self <: IScrollParams](x: Self) {
      
      inline def setFire(value: Boolean): Self = StObject.set(x, "fire", value.asInstanceOf[js.Any])
      
      inline def setScrollDown(value: Boolean): Self = StObject.set(x, "scrollDown", value.asInstanceOf[js.Any])
      
      inline def setStats(value: IPositionStats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
    }
  }
  
  trait IScrollRegisterConfig extends StObject {
    
    var container: ContainerRef
    
    var throttle: Double
  }
  object IScrollRegisterConfig {
    
    inline def apply(container: ContainerRef, throttle: Double): IScrollRegisterConfig = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollRegisterConfig]
    }
    
    extension [Self <: IScrollRegisterConfig](x: Self) {
      
      inline def setContainer(value: ContainerRef): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
    }
  }
  
  trait IScrollState extends StObject {
    
    var lastScrollPosition: Double
    
    var lastTotalToScroll: Double
    
    var totalToScroll: Double
    
    var triggered: IScrollerDistance
  }
  object IScrollState {
    
    inline def apply(
      lastScrollPosition: Double,
      lastTotalToScroll: Double,
      totalToScroll: Double,
      triggered: IScrollerDistance
    ): IScrollState = {
      val __obj = js.Dynamic.literal(lastScrollPosition = lastScrollPosition.asInstanceOf[js.Any], lastTotalToScroll = lastTotalToScroll.asInstanceOf[js.Any], totalToScroll = totalToScroll.asInstanceOf[js.Any], triggered = triggered.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScrollState]
    }
    
    extension [Self <: IScrollState](x: Self) {
      
      inline def setLastScrollPosition(value: Double): Self = StObject.set(x, "lastScrollPosition", value.asInstanceOf[js.Any])
      
      inline def setLastTotalToScroll(value: Double): Self = StObject.set(x, "lastTotalToScroll", value.asInstanceOf[js.Any])
      
      inline def setTotalToScroll(value: Double): Self = StObject.set(x, "totalToScroll", value.asInstanceOf[js.Any])
      
      inline def setTriggered(value: IScrollerDistance): Self = StObject.set(x, "triggered", value.asInstanceOf[js.Any])
    }
  }
  
  trait IScroller extends StObject {
    
    var alwaysCallback: Boolean
    
    var disable: Boolean
    
    var downDistance: Double
    
    var element: ElementRef[js.Any]
    
    var fromRoot: Boolean
    
    var horizontal: Boolean
    
    var scrollContainer: String | ElementRef[js.Any]
    
    var scrollWindow: Boolean
    
    var throttle: Double
    
    var upDistance: Double
  }
  object IScroller {
    
    inline def apply(
      alwaysCallback: Boolean,
      disable: Boolean,
      downDistance: Double,
      element: ElementRef[js.Any],
      fromRoot: Boolean,
      horizontal: Boolean,
      scrollContainer: String | ElementRef[js.Any],
      scrollWindow: Boolean,
      throttle: Double,
      upDistance: Double
    ): IScroller = {
      val __obj = js.Dynamic.literal(alwaysCallback = alwaysCallback.asInstanceOf[js.Any], disable = disable.asInstanceOf[js.Any], downDistance = downDistance.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fromRoot = fromRoot.asInstanceOf[js.Any], horizontal = horizontal.asInstanceOf[js.Any], scrollContainer = scrollContainer.asInstanceOf[js.Any], scrollWindow = scrollWindow.asInstanceOf[js.Any], throttle = throttle.asInstanceOf[js.Any], upDistance = upDistance.asInstanceOf[js.Any])
      __obj.asInstanceOf[IScroller]
    }
    
    extension [Self <: IScroller](x: Self) {
      
      inline def setAlwaysCallback(value: Boolean): Self = StObject.set(x, "alwaysCallback", value.asInstanceOf[js.Any])
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDownDistance(value: Double): Self = StObject.set(x, "downDistance", value.asInstanceOf[js.Any])
      
      inline def setElement(value: ElementRef[js.Any]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFromRoot(value: Boolean): Self = StObject.set(x, "fromRoot", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setScrollContainer(value: String | ElementRef[js.Any]): Self = StObject.set(x, "scrollContainer", value.asInstanceOf[js.Any])
      
      inline def setScrollWindow(value: Boolean): Self = StObject.set(x, "scrollWindow", value.asInstanceOf[js.Any])
      
      inline def setThrottle(value: Double): Self = StObject.set(x, "throttle", value.asInstanceOf[js.Any])
      
      inline def setUpDistance(value: Double): Self = StObject.set(x, "upDistance", value.asInstanceOf[js.Any])
    }
  }
  
  trait IScrollerDistance extends StObject {
    
    var down: js.UndefOr[Double] = js.undefined
    
    var up: js.UndefOr[Double] = js.undefined
  }
  object IScrollerDistance {
    
    inline def apply(): IScrollerDistance = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IScrollerDistance]
    }
    
    extension [Self <: IScrollerDistance](x: Self) {
      
      inline def setDown(value: Double): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
      
      inline def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      inline def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
      
      inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
    }
  }
}
