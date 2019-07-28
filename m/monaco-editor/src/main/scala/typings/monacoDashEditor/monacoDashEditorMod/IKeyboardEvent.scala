package typings.monacoDashEditor.monacoDashEditorMod

import typings.monacoDashEditor.monacoDashEditorNumbers.`true`
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyboardEvent extends js.Object {
  val _standardKeyboardEventBrand: `true`
  val altKey: Boolean
  val browserEvent: KeyboardEvent
  val code: String
  val ctrlKey: Boolean
  val keyCode: KeyCode
  val metaKey: Boolean
  val shiftKey: Boolean
  val target: HTMLElement
  def equals(keybinding: Double): Boolean
  def preventDefault(): Unit
  def stopPropagation(): Unit
}

object IKeyboardEvent {
  @scala.inline
  def apply(
    _standardKeyboardEventBrand: `true`,
    altKey: Boolean,
    browserEvent: KeyboardEvent,
    code: String,
    ctrlKey: Boolean,
    equals: Double => Boolean,
    keyCode: KeyCode,
    metaKey: Boolean,
    preventDefault: () => Unit,
    shiftKey: Boolean,
    stopPropagation: () => Unit,
    target: HTMLElement
  ): IKeyboardEvent = {
    val __obj = js.Dynamic.literal(_standardKeyboardEventBrand = _standardKeyboardEventBrand, altKey = altKey, browserEvent = browserEvent, code = code, ctrlKey = ctrlKey, equals = js.Any.fromFunction1(equals), keyCode = keyCode, metaKey = metaKey, preventDefault = js.Any.fromFunction0(preventDefault), shiftKey = shiftKey, stopPropagation = js.Any.fromFunction0(stopPropagation), target = target)
  
    __obj.asInstanceOf[IKeyboardEvent]
  }
}

