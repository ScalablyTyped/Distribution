package typings.openseadragon.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseTrackerOptions extends StObject {
  
  var blurHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var clickDistThreshold: js.UndefOr[Double] = js.native
  
  var clickHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var clickTimeThreshold: js.UndefOr[Double] = js.native
  
  var dblClickDistThreshold: js.UndefOr[Double] = js.native
  
  var dblClickHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var dblClickTimeThreshold: js.UndefOr[Double] = js.native
  
  var dragEndHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var dragHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var element: Element | String = js.native
  
  var enterHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var exitHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var focusHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var keyDownHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var keyHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var keyUpHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var moveHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var nonPrimaryPressHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var nonPrimaryReleaseHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var pinchHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var pressHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var releaseHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var scrollHandler: js.UndefOr[EventHandler[OSDEvent[_]]] = js.native
  
  var startDisabled: js.UndefOr[Boolean] = js.native
  
  var stopDelay: js.UndefOr[Double] = js.native
  
  var userData: js.UndefOr[js.Object] = js.native
}
object MouseTrackerOptions {
  
  @scala.inline
  def apply(element: Element | String): MouseTrackerOptions = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseTrackerOptions]
  }
  
  @scala.inline
  implicit class MouseTrackerOptionsMutableBuilder[Self <: MouseTrackerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlurHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "blurHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBlurHandlerUndefined: Self = StObject.set(x, "blurHandler", js.undefined)
    
    @scala.inline
    def setClickDistThreshold(value: Double): Self = StObject.set(x, "clickDistThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickDistThresholdUndefined: Self = StObject.set(x, "clickDistThreshold", js.undefined)
    
    @scala.inline
    def setClickHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "clickHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setClickHandlerUndefined: Self = StObject.set(x, "clickHandler", js.undefined)
    
    @scala.inline
    def setClickTimeThreshold(value: Double): Self = StObject.set(x, "clickTimeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClickTimeThresholdUndefined: Self = StObject.set(x, "clickTimeThreshold", js.undefined)
    
    @scala.inline
    def setDblClickDistThreshold(value: Double): Self = StObject.set(x, "dblClickDistThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblClickDistThresholdUndefined: Self = StObject.set(x, "dblClickDistThreshold", js.undefined)
    
    @scala.inline
    def setDblClickHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "dblClickHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDblClickHandlerUndefined: Self = StObject.set(x, "dblClickHandler", js.undefined)
    
    @scala.inline
    def setDblClickTimeThreshold(value: Double): Self = StObject.set(x, "dblClickTimeThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDblClickTimeThresholdUndefined: Self = StObject.set(x, "dblClickTimeThreshold", js.undefined)
    
    @scala.inline
    def setDragEndHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "dragEndHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragEndHandlerUndefined: Self = StObject.set(x, "dragEndHandler", js.undefined)
    
    @scala.inline
    def setDragHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "dragHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDragHandlerUndefined: Self = StObject.set(x, "dragHandler", js.undefined)
    
    @scala.inline
    def setElement(value: Element | String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "enterHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEnterHandlerUndefined: Self = StObject.set(x, "enterHandler", js.undefined)
    
    @scala.inline
    def setExitHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "exitHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setExitHandlerUndefined: Self = StObject.set(x, "exitHandler", js.undefined)
    
    @scala.inline
    def setFocusHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "focusHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocusHandlerUndefined: Self = StObject.set(x, "focusHandler", js.undefined)
    
    @scala.inline
    def setKeyDownHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "keyDownHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyDownHandlerUndefined: Self = StObject.set(x, "keyDownHandler", js.undefined)
    
    @scala.inline
    def setKeyHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "keyHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyHandlerUndefined: Self = StObject.set(x, "keyHandler", js.undefined)
    
    @scala.inline
    def setKeyUpHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "keyUpHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setKeyUpHandlerUndefined: Self = StObject.set(x, "keyUpHandler", js.undefined)
    
    @scala.inline
    def setMoveHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "moveHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMoveHandlerUndefined: Self = StObject.set(x, "moveHandler", js.undefined)
    
    @scala.inline
    def setNonPrimaryPressHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "nonPrimaryPressHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNonPrimaryPressHandlerUndefined: Self = StObject.set(x, "nonPrimaryPressHandler", js.undefined)
    
    @scala.inline
    def setNonPrimaryReleaseHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "nonPrimaryReleaseHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNonPrimaryReleaseHandlerUndefined: Self = StObject.set(x, "nonPrimaryReleaseHandler", js.undefined)
    
    @scala.inline
    def setPinchHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "pinchHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPinchHandlerUndefined: Self = StObject.set(x, "pinchHandler", js.undefined)
    
    @scala.inline
    def setPressHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "pressHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPressHandlerUndefined: Self = StObject.set(x, "pressHandler", js.undefined)
    
    @scala.inline
    def setReleaseHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "releaseHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setReleaseHandlerUndefined: Self = StObject.set(x, "releaseHandler", js.undefined)
    
    @scala.inline
    def setScrollHandler(value: OSDEvent[_] => Unit): Self = StObject.set(x, "scrollHandler", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScrollHandlerUndefined: Self = StObject.set(x, "scrollHandler", js.undefined)
    
    @scala.inline
    def setStartDisabled(value: Boolean): Self = StObject.set(x, "startDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDisabledUndefined: Self = StObject.set(x, "startDisabled", js.undefined)
    
    @scala.inline
    def setStopDelay(value: Double): Self = StObject.set(x, "stopDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopDelayUndefined: Self = StObject.set(x, "stopDelay", js.undefined)
    
    @scala.inline
    def setUserData(value: js.Object): Self = StObject.set(x, "userData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDataUndefined: Self = StObject.set(x, "userData", js.undefined)
  }
}
