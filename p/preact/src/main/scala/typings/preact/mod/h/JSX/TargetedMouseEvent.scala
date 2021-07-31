package typings.preact.mod.h.JSX

import typings.std.EventTarget
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.MouseEvent> */
trait TargetedMouseEvent[Target /* <: EventTarget */] extends StObject {
  
  var AT_TARGET: Double
  
  var BUBBLING_PHASE: Double
  
  var CAPTURING_PHASE: Double
  
  var NONE: Double
  
  var altKey: Boolean
  
  var bubbles: Boolean
  
  var button: Double
  
  var buttons: Double
  
  var cancelBubble: Boolean
  
  var cancelable: Boolean
  
  var clientX: Double
  
  var clientY: Double
  
  var composed: Boolean
  
  def composedPath(): js.Array[EventTarget]
  @JSName("composedPath")
  var composedPath_Original: js.Function0[js.Array[EventTarget]]
  
  var ctrlKey: Boolean
  
  val currentTarget: Target
  
  var defaultPrevented: Boolean
  
  var detail: Double
  
  var eventPhase: Double
  
  def getModifierState(keyArg: String): Boolean
  @JSName("getModifierState")
  var getModifierState_Original: js.Function1[/* keyArg */ String, Boolean]
  
  def initEvent(`type`: String): Unit
  @JSName("initEvent")
  var initEvent_Original: js.Function1[/* type */ String, Unit]
  
  def initMouseEvent(
    typeArg: String,
    canBubbleArg: Boolean,
    cancelableArg: Boolean,
    viewArg: Window,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: Boolean,
    altKeyArg: Boolean,
    shiftKeyArg: Boolean,
    metaKeyArg: Boolean,
    buttonArg: Double
  ): Unit
  @JSName("initMouseEvent")
  var initMouseEvent_Original: js.Function14[
    /* typeArg */ String, 
    /* canBubbleArg */ Boolean, 
    /* cancelableArg */ Boolean, 
    /* viewArg */ Window, 
    /* detailArg */ Double, 
    /* screenXArg */ Double, 
    /* screenYArg */ Double, 
    /* clientXArg */ Double, 
    /* clientYArg */ Double, 
    /* ctrlKeyArg */ Boolean, 
    /* altKeyArg */ Boolean, 
    /* shiftKeyArg */ Boolean, 
    /* metaKeyArg */ Boolean, 
    /* buttonArg */ Double, 
    Unit
  ]
  
  var isTrusted: Boolean
  
  var metaKey: Boolean
  
  var movementX: Double
  
  var movementY: Double
  
  var offsetX: Double
  
  var offsetY: Double
  
  var pageX: Double
  
  var pageY: Double
  
  def preventDefault(): Unit
  @JSName("preventDefault")
  var preventDefault_Original: js.Function0[Unit]
  
  var relatedTarget: js.UndefOr[EventTarget | Null] = js.undefined
  
  var returnValue: Boolean
  
  var screenX: Double
  
  var screenY: Double
  
  var shiftKey: Boolean
  
  var srcElement: js.UndefOr[EventTarget | Null] = js.undefined
  
  def stopImmediatePropagation(): Unit
  @JSName("stopImmediatePropagation")
  var stopImmediatePropagation_Original: js.Function0[Unit]
  
  def stopPropagation(): Unit
  @JSName("stopPropagation")
  var stopPropagation_Original: js.Function0[Unit]
  
  var target: js.UndefOr[EventTarget | Null] = js.undefined
  
  var timeStamp: Double
  
  var `type`: String
  
  var view: js.UndefOr[Window | Null] = js.undefined
  
  var which: Double
  
  var x: Double
  
  var y: Double
}
object TargetedMouseEvent {
  
  @scala.inline
  def apply[Target /* <: EventTarget */](
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    NONE: Double,
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    cancelBubble: Boolean,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    composed: Boolean,
    composedPath: () => js.Array[EventTarget],
    ctrlKey: Boolean,
    currentTarget: Target,
    defaultPrevented: Boolean,
    detail: Double,
    eventPhase: Double,
    getModifierState: /* keyArg */ String => Boolean,
    initEvent: /* type */ String => Unit,
    initMouseEvent: (/* typeArg */ String, /* canBubbleArg */ Boolean, /* cancelableArg */ Boolean, /* viewArg */ Window, /* detailArg */ Double, /* screenXArg */ Double, /* screenYArg */ Double, /* clientXArg */ Double, /* clientYArg */ Double, /* ctrlKeyArg */ Boolean, /* altKeyArg */ Boolean, /* shiftKeyArg */ Boolean, /* metaKeyArg */ Boolean, /* buttonArg */ Double) => Unit,
    isTrusted: Boolean,
    metaKey: Boolean,
    movementX: Double,
    movementY: Double,
    offsetX: Double,
    offsetY: Double,
    pageX: Double,
    pageY: Double,
    preventDefault: () => Unit,
    returnValue: Boolean,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    timeStamp: Double,
    `type`: String,
    which: Double,
    x: Double,
    y: Double
  ): TargetedMouseEvent[Target] = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = js.Any.fromFunction0(composedPath), ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), initEvent = js.Any.fromFunction1(initEvent), initMouseEvent = js.Any.fromFunction14(initMouseEvent), isTrusted = isTrusted.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], movementX = movementX.asInstanceOf[js.Any], movementY = movementY.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), returnValue = returnValue.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedMouseEvent[Target]]
  }
  
  @scala.inline
  implicit class TargetedMouseEventMutableBuilder[Self <: TargetedMouseEvent[?], Target /* <: EventTarget */] (val x: Self & TargetedMouseEvent[Target]) extends AnyVal {
    
    @scala.inline
    def setAT_TARGET(value: Double): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBUBBLING_PHASE(value: Double): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCAPTURING_PHASE(value: Double): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTarget(value: Target): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetModifierState(value: /* keyArg */ String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitMouseEvent(
      value: (/* typeArg */ String, /* canBubbleArg */ Boolean, /* cancelableArg */ Boolean, /* viewArg */ Window, /* detailArg */ Double, /* screenXArg */ Double, /* screenYArg */ Double, /* clientXArg */ Double, /* clientYArg */ Double, /* ctrlKeyArg */ Boolean, /* altKeyArg */ Boolean, /* shiftKeyArg */ Boolean, /* metaKeyArg */ Boolean, /* buttonArg */ Double) => Unit
    ): Self = StObject.set(x, "initMouseEvent", js.Any.fromFunction14(value))
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovementX(value: Double): Self = StObject.set(x, "movementX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMovementY(value: Double): Self = StObject.set(x, "movementY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRelatedTarget(value: EventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedTargetNull: Self = StObject.set(x, "relatedTarget", null)
    
    @scala.inline
    def setRelatedTargetUndefined: Self = StObject.set(x, "relatedTarget", js.undefined)
    
    @scala.inline
    def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
    
    @scala.inline
    def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
    
    @scala.inline
    def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetNull: Self = StObject.set(x, "target", null)
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: Window): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewNull: Self = StObject.set(x, "view", null)
    
    @scala.inline
    def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    @scala.inline
    def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
