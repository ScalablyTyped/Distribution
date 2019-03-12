package typings
package monacoDashEditorLib.monacoDashEditorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyboardEvent extends js.Object {
  val _standardKeyboardEventBrand: monacoDashEditorLib.monacoDashEditorLibNumbers.`true`
  val altKey: scala.Boolean
  val browserEvent: stdLib.KeyboardEvent
  val code: java.lang.String
  val ctrlKey: scala.Boolean
  val keyCode: KeyCode
  val metaKey: scala.Boolean
  val shiftKey: scala.Boolean
  val target: stdLib.HTMLElement
  def equals(keybinding: scala.Double): scala.Boolean
  def preventDefault(): scala.Unit
  def stopPropagation(): scala.Unit
}

object IKeyboardEvent {
  @scala.inline
  def apply(
    _standardKeyboardEventBrand: monacoDashEditorLib.monacoDashEditorLibNumbers.`true`,
    altKey: scala.Boolean,
    browserEvent: stdLib.KeyboardEvent,
    code: java.lang.String,
    ctrlKey: scala.Boolean,
    equals: scala.Double => scala.Boolean,
    keyCode: KeyCode,
    metaKey: scala.Boolean,
    preventDefault: () => scala.Unit,
    shiftKey: scala.Boolean,
    stopPropagation: () => scala.Unit,
    target: stdLib.HTMLElement
  ): IKeyboardEvent = {
    val __obj = js.Dynamic.literal(_standardKeyboardEventBrand = _standardKeyboardEventBrand, altKey = altKey, browserEvent = browserEvent, code = code, ctrlKey = ctrlKey, equals = js.Any.fromFunction1(equals), keyCode = keyCode, metaKey = metaKey, preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey, stopPropagation = js.Any.fromFunction0(stopPropagation), target = target)
  
    __obj.asInstanceOf[IKeyboardEvent]
  }
}

