package typings.preact.mod.createElement.JSX

import typings.std.DOMHighResTimeStamp
import typings.std.EventTarget
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.KeyboardEvent> */
trait TargetedKeyboardEvent[Target /* <: EventTarget */] extends StObject {
  
  var AT_TARGET: Double
  
  var BUBBLING_PHASE: Double
  
  var CAPTURING_PHASE: Double
  
  var DOM_KEY_LOCATION_LEFT: Double
  
  var DOM_KEY_LOCATION_NUMPAD: Double
  
  var DOM_KEY_LOCATION_RIGHT: Double
  
  var DOM_KEY_LOCATION_STANDARD: Double
  
  var NONE: Double
  
  var altKey: Boolean
  
  var bubbles: Boolean
  
  var cancelBubble: Boolean
  
  var cancelable: Boolean
  
  var charCode: Double
  
  var code: String
  
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
  
  def initKeyboardEvent(
    typeArg: String,
    bubblesArg: js.UndefOr[Boolean],
    cancelableArg: js.UndefOr[Boolean],
    viewArg: js.UndefOr[Window | Null],
    keyArg: js.UndefOr[String],
    locationArg: js.UndefOr[Double],
    ctrlKey: js.UndefOr[Boolean],
    altKey: js.UndefOr[Boolean],
    shiftKey: js.UndefOr[Boolean],
    metaKey: js.UndefOr[Boolean]
  ): Unit
  @JSName("initKeyboardEvent")
  var initKeyboardEvent_Original: js.Function10[
    /* typeArg */ String, 
    /* bubblesArg */ js.UndefOr[Boolean], 
    /* cancelableArg */ js.UndefOr[Boolean], 
    /* viewArg */ js.UndefOr[Window | Null], 
    /* keyArg */ js.UndefOr[String], 
    /* locationArg */ js.UndefOr[Double], 
    /* ctrlKey */ js.UndefOr[Boolean], 
    /* altKey */ js.UndefOr[Boolean], 
    /* shiftKey */ js.UndefOr[Boolean], 
    /* metaKey */ js.UndefOr[Boolean], 
    Unit
  ]
  
  def initUIEvent(typeArg: String): Unit
  @JSName("initUIEvent")
  var initUIEvent_Original: js.Function1[/* typeArg */ String, Unit]
  
  var isComposing: Boolean
  
  var isTrusted: Boolean
  
  var key: String
  
  var keyCode: Double
  
  var location: Double
  
  var metaKey: Boolean
  
  def preventDefault(): Unit
  @JSName("preventDefault")
  var preventDefault_Original: js.Function0[Unit]
  
  var repeat: Boolean
  
  var returnValue: Boolean
  
  var shiftKey: Boolean
  
  var srcElement: js.UndefOr[EventTarget | Null] = js.undefined
  
  def stopImmediatePropagation(): Unit
  @JSName("stopImmediatePropagation")
  var stopImmediatePropagation_Original: js.Function0[Unit]
  
  def stopPropagation(): Unit
  @JSName("stopPropagation")
  var stopPropagation_Original: js.Function0[Unit]
  
  var target: js.UndefOr[EventTarget | Null] = js.undefined
  
  var timeStamp: DOMHighResTimeStamp
  
  var `type`: String
  
  var view: js.UndefOr[Window | Null] = js.undefined
  
  var which: Double
}
object TargetedKeyboardEvent {
  
  inline def apply[Target /* <: EventTarget */](
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    DOM_KEY_LOCATION_LEFT: Double,
    DOM_KEY_LOCATION_NUMPAD: Double,
    DOM_KEY_LOCATION_RIGHT: Double,
    DOM_KEY_LOCATION_STANDARD: Double,
    NONE: Double,
    altKey: Boolean,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    charCode: Double,
    code: String,
    composed: Boolean,
    composedPath: () => js.Array[EventTarget],
    ctrlKey: Boolean,
    currentTarget: Target,
    defaultPrevented: Boolean,
    detail: Double,
    eventPhase: Double,
    getModifierState: /* keyArg */ String => Boolean,
    initEvent: /* type */ String => Unit,
    initKeyboardEvent: (/* typeArg */ String, /* bubblesArg */ js.UndefOr[Boolean], /* cancelableArg */ js.UndefOr[Boolean], /* viewArg */ js.UndefOr[Window | Null], /* keyArg */ js.UndefOr[String], /* locationArg */ js.UndefOr[Double], /* ctrlKey */ js.UndefOr[Boolean], /* altKey */ js.UndefOr[Boolean], /* shiftKey */ js.UndefOr[Boolean], /* metaKey */ js.UndefOr[Boolean]) => Unit,
    initUIEvent: /* typeArg */ String => Unit,
    isComposing: Boolean,
    isTrusted: Boolean,
    key: String,
    keyCode: Double,
    location: Double,
    metaKey: Boolean,
    preventDefault: () => Unit,
    repeat: Boolean,
    returnValue: Boolean,
    shiftKey: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    timeStamp: DOMHighResTimeStamp,
    `type`: String,
    which: Double
  ): TargetedKeyboardEvent[Target] = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], DOM_KEY_LOCATION_LEFT = DOM_KEY_LOCATION_LEFT.asInstanceOf[js.Any], DOM_KEY_LOCATION_NUMPAD = DOM_KEY_LOCATION_NUMPAD.asInstanceOf[js.Any], DOM_KEY_LOCATION_RIGHT = DOM_KEY_LOCATION_RIGHT.asInstanceOf[js.Any], DOM_KEY_LOCATION_STANDARD = DOM_KEY_LOCATION_STANDARD.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], charCode = charCode.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = js.Any.fromFunction0(composedPath), ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), initEvent = js.Any.fromFunction1(initEvent), initKeyboardEvent = js.Any.fromFunction10(initKeyboardEvent), initUIEvent = js.Any.fromFunction1(initUIEvent), isComposing = isComposing.asInstanceOf[js.Any], isTrusted = isTrusted.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), repeat = repeat.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedKeyboardEvent[Target]]
  }
  
  extension [Self <: TargetedKeyboardEvent[?], Target /* <: EventTarget */](x: Self & TargetedKeyboardEvent[Target]) {
    
    inline def setAT_TARGET(value: Double): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setBUBBLING_PHASE(value: Double): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCAPTURING_PHASE(value: Double): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setCharCode(value: Double): Self = StObject.set(x, "charCode", value.asInstanceOf[js.Any])
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setCurrentTarget(value: Target): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDOM_KEY_LOCATION_LEFT(value: Double): Self = StObject.set(x, "DOM_KEY_LOCATION_LEFT", value.asInstanceOf[js.Any])
    
    inline def setDOM_KEY_LOCATION_NUMPAD(value: Double): Self = StObject.set(x, "DOM_KEY_LOCATION_NUMPAD", value.asInstanceOf[js.Any])
    
    inline def setDOM_KEY_LOCATION_RIGHT(value: Double): Self = StObject.set(x, "DOM_KEY_LOCATION_RIGHT", value.asInstanceOf[js.Any])
    
    inline def setDOM_KEY_LOCATION_STANDARD(value: Double): Self = StObject.set(x, "DOM_KEY_LOCATION_STANDARD", value.asInstanceOf[js.Any])
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setGetModifierState(value: /* keyArg */ String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
    
    inline def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
    
    inline def setInitKeyboardEvent(
      value: (/* typeArg */ String, /* bubblesArg */ js.UndefOr[Boolean], /* cancelableArg */ js.UndefOr[Boolean], /* viewArg */ js.UndefOr[Window | Null], /* keyArg */ js.UndefOr[String], /* locationArg */ js.UndefOr[Double], /* ctrlKey */ js.UndefOr[Boolean], /* altKey */ js.UndefOr[Boolean], /* shiftKey */ js.UndefOr[Boolean], /* metaKey */ js.UndefOr[Boolean]) => Unit
    ): Self = StObject.set(x, "initKeyboardEvent", js.Any.fromFunction10(value))
    
    inline def setInitUIEvent(value: /* typeArg */ String => Unit): Self = StObject.set(x, "initUIEvent", js.Any.fromFunction1(value))
    
    inline def setIsComposing(value: Boolean): Self = StObject.set(x, "isComposing", value.asInstanceOf[js.Any])
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setRepeat(value: Boolean): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
    
    inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
    
    inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
    
    inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTimeStamp(value: DOMHighResTimeStamp): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setView(value: Window): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    inline def setViewNull: Self = StObject.set(x, "view", null)
    
    inline def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    
    inline def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
  }
}
