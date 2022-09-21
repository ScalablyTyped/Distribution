package typings.openseadragon.mod

import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseTrackerOptions extends StObject {
  
  var blurHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var clickDistThreshold: js.UndefOr[Double] = js.undefined
  
  var clickHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var clickTimeThreshold: js.UndefOr[Double] = js.undefined
  
  var contextMenuHandler: js.UndefOr[EventHandler[ContextMenuMouseTrackerEvent]] = js.undefined
  
  var dblClickDistThreshold: js.UndefOr[Double] = js.undefined
  
  var dblClickHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var dblClickTimeThreshold: js.UndefOr[Double] = js.undefined
  
  var dragEndHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var dragHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var element: Element | String
  
  var enterHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  /**
    * @deprecated use leaveHandler instead
    */
  var exitHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var focusHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var keyDownHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var keyHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var keyUpHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var leaveHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var moveHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var nonPrimaryPressHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var nonPrimaryReleaseHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var outHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var overHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var pinchHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var preProcessEventHandler: js.UndefOr[PreprocessEventHandler] = js.undefined
  
  var pressHandler: js.UndefOr[EventHandler[PressMouseTrackerEvent]] = js.undefined
  
  var releaseHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var scrollHandler: js.UndefOr[EventHandler[MouseTrackerEvent[Event]]] = js.undefined
  
  var startDisabled: js.UndefOr[Boolean] = js.undefined
  
  var stopDelay: js.UndefOr[Double] = js.undefined
  
  var userData: js.UndefOr[js.Object] = js.undefined
}
object MouseTrackerOptions {
  
  inline def apply(element: Element | String): MouseTrackerOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseTrackerOptions]
  }
  
  extension [Self <: MouseTrackerOptions](x: Self) {
    
    inline def setBlurHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "blurHandler", js.Any.fromFunction1(value))
    
    inline def setBlurHandlerUndefined: Self = StObject.set(x, "blurHandler", js.undefined)
    
    inline def setClickDistThreshold(value: Double): Self = StObject.set(x, "clickDistThreshold", value.asInstanceOf[js.Any])
    
    inline def setClickDistThresholdUndefined: Self = StObject.set(x, "clickDistThreshold", js.undefined)
    
    inline def setClickHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "clickHandler", js.Any.fromFunction1(value))
    
    inline def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
    
    inline def setClickTimeThreshold(value: Double): Self = StObject.set(x, "clickTimeThreshold", value.asInstanceOf[js.Any])
    
    inline def setClickTimeThresholdUndefined: Self = StObject.set(x, "clickTimeThreshold", js.undefined)
    
    inline def setContextMenuHandler(value: ContextMenuMouseTrackerEvent => Unit): Self = StObject.set(x, "contextMenuHandler", js.Any.fromFunction1(value))
    
    inline def setContextMenuHandlerUndefined: Self = StObject.set(x, "contextMenuHandler", js.undefined)
    
    inline def setDblClickDistThreshold(value: Double): Self = StObject.set(x, "dblClickDistThreshold", value.asInstanceOf[js.Any])
    
    inline def setDblClickDistThresholdUndefined: Self = StObject.set(x, "dblClickDistThreshold", js.undefined)
    
    inline def setDblClickHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "dblClickHandler", js.Any.fromFunction1(value))
    
    inline def setDblClickHandlerUndefined: Self = StObject.set(x, "dblClickHandler", js.undefined)
    
    inline def setDblClickTimeThreshold(value: Double): Self = StObject.set(x, "dblClickTimeThreshold", value.asInstanceOf[js.Any])
    
    inline def setDblClickTimeThresholdUndefined: Self = StObject.set(x, "dblClickTimeThreshold", js.undefined)
    
    inline def setDragEndHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "dragEndHandler", js.Any.fromFunction1(value))
    
    inline def setDragEndHandlerUndefined: Self = StObject.set(x, "dragEndHandler", js.undefined)
    
    inline def setDragHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "dragHandler", js.Any.fromFunction1(value))
    
    inline def setDragHandlerUndefined: Self = StObject.set(x, "dragHandler", js.undefined)
    
    inline def setElement(value: Element | String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setEnterHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "enterHandler", js.Any.fromFunction1(value))
    
    inline def setEnterHandlerUndefined: Self = StObject.set(x, "enterHandler", js.undefined)
    
    inline def setExitHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "exitHandler", js.Any.fromFunction1(value))
    
    inline def setExitHandlerUndefined: Self = StObject.set(x, "exitHandler", js.undefined)
    
    inline def setFocusHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "focusHandler", js.Any.fromFunction1(value))
    
    inline def setFocusHandlerUndefined: Self = StObject.set(x, "focusHandler", js.undefined)
    
    inline def setKeyDownHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "keyDownHandler", js.Any.fromFunction1(value))
    
    inline def setKeyDownHandlerUndefined: Self = StObject.set(x, "keyDownHandler", js.undefined)
    
    inline def setKeyHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "keyHandler", js.Any.fromFunction1(value))
    
    inline def setKeyHandlerUndefined: Self = StObject.set(x, "keyHandler", js.undefined)
    
    inline def setKeyUpHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "keyUpHandler", js.Any.fromFunction1(value))
    
    inline def setKeyUpHandlerUndefined: Self = StObject.set(x, "keyUpHandler", js.undefined)
    
    inline def setLeaveHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "leaveHandler", js.Any.fromFunction1(value))
    
    inline def setLeaveHandlerUndefined: Self = StObject.set(x, "leaveHandler", js.undefined)
    
    inline def setMoveHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "moveHandler", js.Any.fromFunction1(value))
    
    inline def setMoveHandlerUndefined: Self = StObject.set(x, "moveHandler", js.undefined)
    
    inline def setNonPrimaryPressHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "nonPrimaryPressHandler", js.Any.fromFunction1(value))
    
    inline def setNonPrimaryPressHandlerUndefined: Self = StObject.set(x, "nonPrimaryPressHandler", js.undefined)
    
    inline def setNonPrimaryReleaseHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "nonPrimaryReleaseHandler", js.Any.fromFunction1(value))
    
    inline def setNonPrimaryReleaseHandlerUndefined: Self = StObject.set(x, "nonPrimaryReleaseHandler", js.undefined)
    
    inline def setOutHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "outHandler", js.Any.fromFunction1(value))
    
    inline def setOutHandlerUndefined: Self = StObject.set(x, "outHandler", js.undefined)
    
    inline def setOverHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "overHandler", js.Any.fromFunction1(value))
    
    inline def setOverHandlerUndefined: Self = StObject.set(x, "overHandler", js.undefined)
    
    inline def setPinchHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "pinchHandler", js.Any.fromFunction1(value))
    
    inline def setPinchHandlerUndefined: Self = StObject.set(x, "pinchHandler", js.undefined)
    
    inline def setPreProcessEventHandler(value: /* event */ EventProcessInfo => Unit): Self = StObject.set(x, "preProcessEventHandler", js.Any.fromFunction1(value))
    
    inline def setPreProcessEventHandlerUndefined: Self = StObject.set(x, "preProcessEventHandler", js.undefined)
    
    inline def setPressHandler(value: PressMouseTrackerEvent => Unit): Self = StObject.set(x, "pressHandler", js.Any.fromFunction1(value))
    
    inline def setPressHandlerUndefined: Self = StObject.set(x, "pressHandler", js.undefined)
    
    inline def setReleaseHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "releaseHandler", js.Any.fromFunction1(value))
    
    inline def setReleaseHandlerUndefined: Self = StObject.set(x, "releaseHandler", js.undefined)
    
    inline def setScrollHandler(value: MouseTrackerEvent[Event] => Unit): Self = StObject.set(x, "scrollHandler", js.Any.fromFunction1(value))
    
    inline def setScrollHandlerUndefined: Self = StObject.set(x, "scrollHandler", js.undefined)
    
    inline def setStartDisabled(value: Boolean): Self = StObject.set(x, "startDisabled", value.asInstanceOf[js.Any])
    
    inline def setStartDisabledUndefined: Self = StObject.set(x, "startDisabled", js.undefined)
    
    inline def setStopDelay(value: Double): Self = StObject.set(x, "stopDelay", value.asInstanceOf[js.Any])
    
    inline def setStopDelayUndefined: Self = StObject.set(x, "stopDelay", js.undefined)
    
    inline def setUserData(value: js.Object): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    inline def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
