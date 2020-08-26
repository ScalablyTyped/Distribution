package typings.preact.mod.h.JSX

import typings.std.EventTarget
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined preact.preact/src/jsx.JSXInternal.TargetedEvent<Target, std.KeyboardEvent> */
@js.native
trait TargetedKeyboardEvent[Target /* <: EventTarget */] extends js.Object {
  var AT_TARGET: Double = js.native
  var BUBBLING_PHASE: Double = js.native
  var CAPTURING_PHASE: Double = js.native
  var DOM_KEY_LOCATION_LEFT: Double = js.native
  var DOM_KEY_LOCATION_NUMPAD: Double = js.native
  var DOM_KEY_LOCATION_RIGHT: Double = js.native
  var DOM_KEY_LOCATION_STANDARD: Double = js.native
  var NONE: Double = js.native
  var altKey: Boolean = js.native
  var bubbles: Boolean = js.native
  var cancelBubble: Boolean = js.native
  var cancelable: Boolean = js.native
  var char: String = js.native
  var charCode: Double = js.native
  var code: String = js.native
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
  @JSName("initEvent")
  var initEvent_Original: js.Function1[/* type */ String, Unit] = js.native
  var isComposing: Boolean = js.native
  var isTrusted: Boolean = js.native
  var key: String = js.native
  var keyCode: Double = js.native
  var location: Double = js.native
  var metaKey: Boolean = js.native
  @JSName("preventDefault")
  var preventDefault_Original: js.Function0[Unit] = js.native
  var repeat: Boolean = js.native
  var returnValue: Boolean = js.native
  var shiftKey: Boolean = js.native
  var srcElement: js.UndefOr[EventTarget | Null] = js.native
  @JSName("stopImmediatePropagation")
  var stopImmediatePropagation_Original: js.Function0[Unit] = js.native
  @JSName("stopPropagation")
  var stopPropagation_Original: js.Function0[Unit] = js.native
  var target: js.UndefOr[EventTarget | Null] = js.native
  var timeStamp: Double = js.native
  var `type`: String = js.native
  var view: js.UndefOr[Window | Null] = js.native
  var which: Double = js.native
  def composedPath(): js.Array[EventTarget] = js.native
  def getModifierState(keyArg: String): Boolean = js.native
  def initEvent(`type`: String): Unit = js.native
  def preventDefault(): Unit = js.native
  def stopImmediatePropagation(): Unit = js.native
  def stopPropagation(): Unit = js.native
}

