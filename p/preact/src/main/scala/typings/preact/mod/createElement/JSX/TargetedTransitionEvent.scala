package typings.preact.mod.createElement.JSX

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.TransitionEvent> */
trait TargetedTransitionEvent[Target /* <: EventTarget */] extends StObject {
  
  var AT_TARGET: Double
  
  var BUBBLING_PHASE: Double
  
  var CAPTURING_PHASE: Double
  
  var NONE: Double
  
  var bubbles: Boolean
  
  var cancelBubble: Boolean
  
  var cancelable: Boolean
  
  var composed: Boolean
  
  def composedPath(): js.Array[EventTarget]
  @JSName("composedPath")
  var composedPath_Original: js.Function0[js.Array[EventTarget]]
  
  val currentTarget: Target
  
  var defaultPrevented: Boolean
  
  var elapsedTime: Double
  
  var eventPhase: Double
  
  def initEvent(`type`: String): Unit
  @JSName("initEvent")
  var initEvent_Original: js.Function1[/* type */ String, Unit]
  
  var isTrusted: Boolean
  
  def preventDefault(): Unit
  @JSName("preventDefault")
  var preventDefault_Original: js.Function0[Unit]
  
  var propertyName: String
  
  var pseudoElement: String
  
  var returnValue: Boolean
  
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
}
object TargetedTransitionEvent {
  
  inline def apply[Target /* <: EventTarget */](
    AT_TARGET: Double,
    BUBBLING_PHASE: Double,
    CAPTURING_PHASE: Double,
    NONE: Double,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    composed: Boolean,
    composedPath: () => js.Array[EventTarget],
    currentTarget: Target,
    defaultPrevented: Boolean,
    elapsedTime: Double,
    eventPhase: Double,
    initEvent: /* type */ String => Unit,
    isTrusted: Boolean,
    preventDefault: () => Unit,
    propertyName: String,
    pseudoElement: String,
    returnValue: Boolean,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    timeStamp: Double,
    `type`: String
  ): TargetedTransitionEvent[Target] = {
    val __obj = js.Dynamic.literal(AT_TARGET = AT_TARGET.asInstanceOf[js.Any], BUBBLING_PHASE = BUBBLING_PHASE.asInstanceOf[js.Any], CAPTURING_PHASE = CAPTURING_PHASE.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], composed = composed.asInstanceOf[js.Any], composedPath = js.Any.fromFunction0(composedPath), currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction1(initEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), propertyName = propertyName.asInstanceOf[js.Any], pseudoElement = pseudoElement.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetedTransitionEvent[Target]]
  }
  
  extension [Self <: TargetedTransitionEvent[?], Target /* <: EventTarget */](x: Self & TargetedTransitionEvent[Target]) {
    
    inline def setAT_TARGET(value: Double): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
    
    inline def setBUBBLING_PHASE(value: Double): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    inline def setCAPTURING_PHASE(value: Double): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
    
    inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    inline def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    inline def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    inline def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
    
    inline def setCurrentTarget(value: Target): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    inline def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    inline def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    inline def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    inline def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
    
    inline def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    inline def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
    
    inline def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    inline def setPropertyName(value: String): Self = StObject.set(x, "propertyName", value.asInstanceOf[js.Any])
    
    inline def setPseudoElement(value: String): Self = StObject.set(x, "pseudoElement", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    inline def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
    
    inline def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
    
    inline def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
    
    inline def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    inline def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
