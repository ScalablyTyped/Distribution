package typings.preact.mod.createElement.JSX

import typings.std.EventTarget
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.PointerEvent> */
@js.native
trait TargetedPointerEvent[Target /* <: EventTarget */] extends js.Object {
  var AT_TARGET: Double = js.native
  var BUBBLING_PHASE: Double = js.native
  var CAPTURING_PHASE: Double = js.native
  var NONE: Double = js.native
  var altKey: Boolean = js.native
  var bubbles: Boolean = js.native
  var button: Double = js.native
  var buttons: Double = js.native
  var cancelBubble: Boolean = js.native
  var cancelable: Boolean = js.native
  var clientX: Double = js.native
  var clientY: Double = js.native
  var composed: Boolean = js.native
  @JSName("composedPath")
  var composedPath_Original: js.Function0[js.Array[EventTarget]] = js.native
  var ctrlKey: Boolean = js.native
  val currentTarget: Target = js.native
  var defaultPrevented: Boolean = js.native
  var detail: Double = js.native
  var eventPhase: Double = js.native
  @JSName("getModifierState")
  var getModifierState_Original: js.Function1[/* keyArg */ String, Boolean] = js.native
  var height: Double = js.native
  @JSName("initEvent")
  var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
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
  ] = js.native
  var isPrimary: Boolean = js.native
  var isTrusted: Boolean = js.native
  var metaKey: Boolean = js.native
  var movementX: Double = js.native
  var movementY: Double = js.native
  var offsetX: Double = js.native
  var offsetY: Double = js.native
  var pageX: Double = js.native
  var pageY: Double = js.native
  var pointerId: Double = js.native
  var pointerType: String = js.native
  var pressure: Double = js.native
  @JSName("preventDefault")
  var preventDefault_Original: js.Function0[Unit] = js.native
  var relatedTarget: js.UndefOr[EventTarget | Null] = js.native
  var returnValue: Boolean = js.native
  var screenX: Double = js.native
  var screenY: Double = js.native
  var shiftKey: Boolean = js.native
  var srcElement: js.UndefOr[EventTarget | Null] = js.native
  @JSName("stopImmediatePropagation")
  var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
  @JSName("stopPropagation")
  var stopPropagation_Original: js.Function0[Unit] = js.native
  var tangentialPressure: Double = js.native
  var target: js.UndefOr[EventTarget | Null] = js.native
  var tiltX: Double = js.native
  var tiltY: Double = js.native
  var timeStamp: Double = js.native
  var twist: Double = js.native
  var `type`: String = js.native
  var view: js.UndefOr[Window | Null] = js.native
  var which: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
  def composedPath(): js.Array[EventTarget] = js.native
  def getModifierState(keyArg: String): Boolean = js.native
  def initEvent(`type`: String): Unit = js.native
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
  ): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

